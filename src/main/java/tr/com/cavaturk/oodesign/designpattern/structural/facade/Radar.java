/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.facade;

/**
 * @author patron
 *
 */
public class Radar {

	public void open() {
		System.out.println("Radar is openç");
	}

	public void close() {
		System.out.println("Radar is closed.");
	}

	public boolean anyObject() {
		System.out.println("No object found in radar.");
		return false;
	}
}
