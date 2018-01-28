/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.bridge;

/**
 * @author patron
 *
 */
public class BlueImplementor implements ColorImplementor {

	/* (non-Javadoc)
	 * @see tr.com.cavaturk.oodesign.designpattern.structural.bridge.ColorImplementor#getColor()
	 */
	public String getColor() {
		return "Blue";
	}

}
