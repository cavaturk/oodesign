/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.adapter;

/**
 * @author patron
 *
 */
public class AmericanAdapter implements EuropeanPlug {
	
	private AmericanPlug americanPlug;
	
	public AmericanAdapter(AmericanPlug americanPlug) {
		super();
		this.americanPlug = americanPlug;
	}

	/* (non-Javadoc)
	 * @see tr.com.cavaturk.oodesign.designpattern.structural.adapter.EuropeanPlug#euWork()
	 */
	public void euWork() {
		americanPlug.usWork();
	}

}
