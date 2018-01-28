/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.facade;

/**
 * @author patron
 *
 */
public class PlaneFacade implements PlaneControl {

	private ControlTower controlTower = new ControlTower();
	private Crew crew = new Crew();
	private Engine engine = new Engine();
	private Fuel fuel = new Fuel();
	private Radar radar = new Radar();

	/*
	 * (non-Javadoc)
	 * 
	 * @see tr.com.cavaturk.oodesign.designpattern.structural.facade.PlaneControl#
	 * makeFlightControls()
	 */
	public boolean flightControl() {

		if (!controlTower.readyToTakeOff()) {
			return false;
		}

		if (!fuel.isEnough()) {
			return false;
		}

		if (!engine.isHealthy()) {
			return false;
		}

		if (!crew.everythingOK()) {
			return false;
		}

		if (radar.anyObject()) {
			return false;
		}

		System.out.println("Flight control is OK.");

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tr.com.cavaturk.oodesign.designpattern.structural.facade.PlaneControl#takeOff
	 * ()
	 */
	public void takeOff() {
		String rotate = controlTower.getFlightRotate();
		if (ControlTower.FLIGHT_ROTATE.equals(rotate) && fuel.getPercent() > 85 && !radar.anyObject()) {
			engine.start();
			engine.takeOff();
		}
		System.out.println("Flight is succesful.");
	}

}
