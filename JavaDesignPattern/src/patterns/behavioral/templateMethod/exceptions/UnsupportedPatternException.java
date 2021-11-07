package patterns.behavioral.templateMethod.exceptions;

public class UnsupportedPatternException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UnsupportedPatternException() {
		this("지원하는 구분자는 , . : \\ - + = @ 입니다.");
	}

	public UnsupportedPatternException(String var1) {
		super(var1);
	}

	public UnsupportedPatternException(String var1, Throwable var2) {
		super(var1, var2);
	}

	public UnsupportedPatternException(Throwable var1) {
		super(var1);
	}

	protected UnsupportedPatternException(String var1, Throwable var2, boolean var3, boolean var4) {
		super(var1, var2, var3, var4);
	}
	
}
