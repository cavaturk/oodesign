/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.bridge;

/**
 * @author patron
 *
 */
public class RedImplementor implements ColorImplementor {

	/* (non-Javadoc)
	 * @see tr.com.cavaturk.oodesign.designpattern.structural.bridge.ColorImplementor#getColour()
	 */
	public String getColor() {
		return "Red";
	}

}
