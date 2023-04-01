package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MarkTag extends BodyTagSupport {
	char character;
	String color;

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_BUFFERED;
	}

	// doInit
	// setBodyContent

	@Override
	public int doAfterBody() throws JspException {
		String bodyData = bodyContent.getString();
		// royaleducation
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < bodyData.length(); i++) {
			if (bodyData.charAt(i) == character) {
				sb.append("<font color='" + color + "'>" + character + "</font>");
			} else {
				sb.append(bodyData.charAt(i));
			}
		}

		JspWriter out = bodyContent.getEnclosingWriter();
		try {
			out.print(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
