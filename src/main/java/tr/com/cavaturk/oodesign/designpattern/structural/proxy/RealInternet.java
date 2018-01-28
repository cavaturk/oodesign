/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.proxy;

/**
 * @author patron
 *
 */
public class RealInternet implements Internet {

	/* (non-Javadoc)
	 * @see tr.com.cavaturk.oodesign.designpattern.structural.proxy.Internet#connectTo(java.lang.String)
	 */
	public String connectTo(String address) {
		System.out.println("Connected to \"" + address + "\"");
		return HttpCodes.OK.getCode();
	}

}
