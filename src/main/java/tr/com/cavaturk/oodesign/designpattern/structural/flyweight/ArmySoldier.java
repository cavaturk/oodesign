/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.flyweight;

/**
 * @author patron
 *
 */
public class ArmySoldier extends Soldier {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tr.com.cavaturk.oodesign.designpattern.structural.flyweight.Soldier#move(int,
	 * int, int, int)
	 */
	@Override
	void move(int currentX, int currentY, int newX, int newY) {
		System.out.println(this.type + " is moving from " + currentX + "," + currentY + " to " + newX + "," + newY);
	}

}
