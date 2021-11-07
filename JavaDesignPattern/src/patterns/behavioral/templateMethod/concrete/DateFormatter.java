package patterns.behavioral.templateMethod.concrete;

import patterns.behavioral.templateMethod.abstractClass.AbstractFormatter;

public class DateFormatter extends AbstractFormatter {
	
	public DateFormatter(String text){
		this(text, "####-##-##");
	}
	
	public DateFormatter(String text, String format) {
		super(text, format);
	}

	@Override
	public void print() {
		System.out.println(getFormatText());
	}

}
