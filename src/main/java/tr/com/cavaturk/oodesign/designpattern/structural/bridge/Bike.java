/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.bridge;

/**
 * @author patron
 *
 */
public class Bike extends Vehicle {

	public Bike(ColorImplementor colorImplementor) {
		super(colorImplementor);
	}

	/* (non-Javadoc)
	 * @see tr.com.cavaturk.oodesign.designpattern.structural.bridge.Vehicle#getName()
	 */
	@Override
	public String getName() {
		return this.colorImplementor.getColor() + "Bike";
	}

}
