package patterns.behavioral.templateMethod.abstractClass;

import patterns.behavioral.templateMethod.exceptions.UnsupportedPatternException;

public abstract class AbstractFormatter {
	private final String text;
	private final String format;
	private final String SUPPORTED_PATTERN = "^[#]+[\\-|\\.|\\,|\\@|\\/|\\:|\\+|\\=]?([#]{1,}[\\-|\\.|\\,|\\@|\\/|\\:|\\+|\\=]{1})*[#]+$";
	private final String SEPARATORS = "[\\#\\,\\/\\.\\-\\=\\+\\@\\:]";
	protected AbstractFormatter(String text, String format) {
		try {
			if (text == null || text.isEmpty() || text.trim().isEmpty()) {
				throw new IllegalArgumentException("text is null");
			}
			if (format == null || format.isEmpty()) {
				throw new IllegalArgumentException("format is null");
			} else if (format.replaceAll(SEPARATORS ,"").length() > 0){
				throw new UnsupportedPatternException("####-##-## 이런 형태로 입력해주세요.");
			}else  if (!format.matches(SUPPORTED_PATTERN)) {
				throw new UnsupportedPatternException();
			} else if (format.matches("^[#]{1,}$")) {
				format = null;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			this.text = text;
			this.format = format;
		}
	}
	
	protected final String getFormatText() {
		String[] patterns = this.format.replaceAll("#", "").split("");
		if (patterns.length == 0) {
			return text;
		}
		String[] texts = this.format.split("[^#]");
		int index = 0;
		int start = 0;
		int end = texts[index].length();
		int range = patterns.length;
		final StringBuffer sb = new StringBuffer(this.text.substring(start, end));
		do {
			start = end;
			sb.append(patterns[index++]);
			end += texts[index].length();
			sb.append(this.text.substring(start, end));
		} while(index < range);
		
		return sb.toString();
	}
	
	public abstract void print();
	
}
