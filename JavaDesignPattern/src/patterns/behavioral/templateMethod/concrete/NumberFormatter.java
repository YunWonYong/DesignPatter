package patterns.behavioral.templateMethod.concrete;

import patterns.behavioral.templateMethod.abstractClass.AbstractFormatter;

public class NumberFormatter extends AbstractFormatter {
	public NumberFormatter(String text) {
		this(text, "###.###");
	}
	public NumberFormatter(String text, String format) {
		super(text, format);
	}

	@Override
	public void print() {
		System.out.println(getFormatText());
	}

}
