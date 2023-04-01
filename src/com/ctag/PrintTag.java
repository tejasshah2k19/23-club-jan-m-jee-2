package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTag extends TagSupport {

	// attribute
	Integer count;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE; // doAfterBody()
	}

	@Override
	public int doAfterBody() throws JspException {
		count--;
		if (count == 0) {
			return SKIP_BODY;
		} else {
			return EVAL_BODY_AGAIN;
		}
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}
}
