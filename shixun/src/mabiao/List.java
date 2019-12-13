package mabiao;

public class List {
	private String character;
	private String code;
	private String rate;
	private String line;
	public List(String line) {
		this.line=line;
	}
	public List(String character,String code) {
		this.character=character;
		this.code=code;
	}
	public List(String character,String code,String rate) {
		this.character=character;
		this.code=code;
		this.rate=rate;
	}
	public String getCharacter() {
		return character;
	}
	public String getCode() {
		return code;
	}
	public String getRate() {
		return rate;
	}
	public String gerLine() {
		return line;
	}
}
