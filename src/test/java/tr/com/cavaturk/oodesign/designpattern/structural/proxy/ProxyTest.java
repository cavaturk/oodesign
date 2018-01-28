/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author patron
 *
 */
public class ProxyTest {

	@Test
	public void testInternetConnection() {
		String url = "www.facebook.com";
		Internet internet = new RealInternet();

		assertEquals("200", internet.connectTo(url));
		assertEquals("403", new ProxyInternet(internet).connectTo(url));
	}

}
