package tr.com.cavaturk.oodesign.designpattern.structural.flyweight;

import java.util.EnumMap;

public class SoldierFactory {

	private static EnumMap<ForcesType, Soldier> flyweights = new EnumMap<ForcesType, Soldier>(ForcesType.class);

	private SoldierFactory() {
	}

	public static Soldier getSoldier(ForcesType type) {
		if (flyweights.containsKey(type)) {
			return flyweights.get(type);
		}

		Soldier soldier;
		switch (type) {
		case ARMY:
			soldier = new ArmySoldier();
			soldier.type = ForcesType.ARMY;
			break;
		case AIR:
			soldier = new AirSoldier();
			soldier.type = ForcesType.AIR;
			break;
		case NAVY:
			soldier = new NavySoldier();
			soldier.type = ForcesType.NAVY;
			break;
		default:
			throw new IllegalArgumentException("Unsupported car type.");
		}
		flyweights.put(type, soldier);
		return soldier;
	}

}
