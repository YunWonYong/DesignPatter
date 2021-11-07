package patterns.behavioral.templateMethod;


import patterns.behavioral.templateMethod.abstractClass.AbstractFormatter;
import patterns.behavioral.templateMethod.concrete.DateFormatter;
import patterns.behavioral.templateMethod.concrete.NumberFormatter;

public class Main {

	public static void main(String[] args) {
		AbstractFormatter dateFormat = new DateFormatter("20211107");
		dateFormat.print();
		dateFormat = new DateFormatter("20211107", "####.##.##");
		dateFormat.print();
		dateFormat = new DateFormatter("20211107", "####/##/##");
		dateFormat.print();
		AbstractFormatter numberFormat = new NumberFormatter("100000");
		numberFormat.print();
	}

}
