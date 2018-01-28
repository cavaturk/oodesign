/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.flyweight;

/**
 * @author patron
 *
 */
public class SoldierClient {

	private Soldier soldier;
	private int currentX = 0;
	private int currentY = 0;

	public SoldierClient(ForcesType type) {
		super();
		this.soldier = SoldierFactory.getSoldier(type);
	}
	
	public void move(int newX, int newY) {
		soldier.move(currentX, currentY, newX, newY);
		currentX = newX;
		currentY = newY;
	}
	
	
}
