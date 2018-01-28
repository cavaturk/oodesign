/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.flyweight;

/**
 * @author patron
 *
 */
public abstract class Soldier {

	 /*Intrinsic state  stored and shared in the Flyweight object*/
	protected ForcesType type;
	
	/* Extrinsic state is stored or computed by client objects, and passed to the Flyweight.*/
    abstract void move(int currentX, int currentY, int newX, int newY);
	
}
