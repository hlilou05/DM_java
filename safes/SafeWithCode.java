package safes;

public class SafeWithCode extends Safe {
	
	private String code = "password";

	public SafeWithCode() {
	}

	public SafeWithCode(int capac) {
		super(capac);
	}
	
	public SafeWithCode(int capac, String c) {
		super(capac);
		this.code = c;
	}
	
	public SafeWithCode(String c) {
		//super();
		this.code = c;
	}
	
	public void changeCode(String newCode, String code) {
		if(this.code.contentEquals(code)) this.code = newCode;
		else System.err.println("Mauvais code, sale hacker");
	}
	
	public void open(String code) {
		if(this.code.contentEquals(code)) super.open();
		else System.err.println("Mauvais code, sale hacker");
	}

	@Override
	public void open() {
		System.err.println("Wrong usage: please provide a code");
	}
}
