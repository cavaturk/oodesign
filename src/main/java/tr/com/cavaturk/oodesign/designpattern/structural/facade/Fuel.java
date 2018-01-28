/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.facade;

/**
 * @author patron
 *
 */
public class Fuel {

	public int getPercent() {
		return 99;
	}

	public boolean isEnough() {
		System.out.println("Fuel is OK.");
		return true;
	}
}
