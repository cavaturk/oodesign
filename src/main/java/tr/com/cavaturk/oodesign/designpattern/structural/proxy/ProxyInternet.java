/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author patron
 *
 */
public class ProxyInternet implements Internet {

	Internet internet;

	public ProxyInternet(Internet internet) {
		super();
		this.internet = internet;
	}

	private final List<String> restrictedAddresses = new ArrayList<String>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		{
			add("wwww.facebook.com");
			add("www.youtube.com");
		}
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tr.com.cavaturk.oodesign.designpattern.structural.proxy.Internet#connectTo(
	 * java.lang.String)
	 */
	public String connectTo(String address) {

		if (restrictedAddresses.contains(address.toLowerCase())) {
			return internet.connectTo(address);
		}
		System.out.println("The address is forbidden \"" + address + "\"");
		return HttpCodes.FORBIDDEN.getCode();
	}

}
