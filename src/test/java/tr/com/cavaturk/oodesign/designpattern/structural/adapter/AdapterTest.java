/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.adapter;

import org.junit.Test;

/**
 * @author patron
 *
 */
public class AdapterTest {

	@Test
	public void testPlugs() {

		EuropeanPlug eu = new EuropeanPlugImpl();

		eu.euWork();

		EuropeanPlug eu2 = new AmericanAdapter(new AmericanPlugImpl());
		eu2.euWork();

	}

}
