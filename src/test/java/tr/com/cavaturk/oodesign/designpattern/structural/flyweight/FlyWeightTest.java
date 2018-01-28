/**
 * 
 */
package tr.com.cavaturk.oodesign.designpattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author patron
 *
 */
public class FlyWeightTest {

	@Test
	public void testFlyWeight() {

		List<SoldierClient> soldierList = new ArrayList<SoldierClient>();

		int currentX = 0, currentY = 0;

		for (int i = 0; i < 2; i++) {
			soldierList.add(new SoldierClient(ForcesType.AIR));
		}

		for (int i = 0; i < 4; i++) {
			soldierList.add(new SoldierClient(ForcesType.NAVY));
		}

		for (int i = 0; i < 8; i++) {
			soldierList.add(new SoldierClient(ForcesType.ARMY));
		}

		for (SoldierClient client : soldierList) {
			currentX += 10;
			client.move(currentX, currentY);
		}

	}
}
