/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author patron
 *
 */
public class BridgeTest {

	@Test
	public void testCar() {

		Vehicle redCar = new Car(new RedImplementor());
		Vehicle blueCar = new Car(new BlueImplementor());
		Vehicle redBike = new Bike(new RedImplementor());

		assertEquals("RedCar", redCar.getName());
		assertEquals("BlueCar", blueCar.getName());
		assertEquals("RedBike", redBike.getName());
	}

}
