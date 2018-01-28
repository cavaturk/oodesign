/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.facade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author patron
 *
 */
public class FacadeTest {
	@Test
	public void planeTest() {

		PlaneFacade plane = new PlaneFacade();
		assertEquals(true, plane.flightControl());
		plane.takeOff();
	}

}
