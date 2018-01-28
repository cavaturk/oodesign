/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.facade;

/**
 * @author patron
 *
 */
public class Engine {

	public void start() {
		System.out.println("Engine has started.");
	}

	public void stop() {
		System.out.println("Engine has stoped.");
	}
	
	public void takeOff() {
		System.out.println("Plane has taken off.");
	}
	
	
	public boolean isHealthy() {
		System.out.println("Engine is healhty.");
		return true;
	}

}
