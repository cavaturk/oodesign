package tr.com.cavaturk.oodesign.designpattern.structural.proxy;

/**
 * @author patron
 *
 */
public enum HttpCodes {

	OK("200"), FORBIDDEN("403");

	private String code;

	HttpCodes(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
