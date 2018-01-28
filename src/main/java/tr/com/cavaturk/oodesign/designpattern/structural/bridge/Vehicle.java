/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.bridge;

/**
 * @author patron
 *
 */
public abstract class Vehicle {

	protected ColorImplementor colorImplementor;
	
	public Vehicle(ColorImplementor colorImplementor) {
		super();
		this.colorImplementor = colorImplementor;
	}

	abstract public String getName();
}
