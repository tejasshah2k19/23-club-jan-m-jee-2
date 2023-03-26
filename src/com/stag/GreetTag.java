package com.stag;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int h = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(h);
		JspWriter out = getJspContext().getOut();

		if (h >= 0 && h <= 11) {
			out.print("Good Morning");
		} else if (h >= 12 && h <= 17) {
			out.print("Good Noon");

		} else {
			out.print("Good Evening");

		}

	}
}
