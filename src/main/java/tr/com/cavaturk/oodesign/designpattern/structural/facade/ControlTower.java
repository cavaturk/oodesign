/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.facade;

/**
 * @author patron
 *
 */
public class ControlTower {

	public static final String FLIGHT_ROTATE = "39.925054, 32.836944";

	public boolean readyToTakeOff() {
		return true;
	}

	public String getFlightRotate() {
		return FLIGHT_ROTATE;
	}

}
