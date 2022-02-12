package creational.factorymethod;

public class VehicleFactory {

	public static Vehicle getVehicle(VehicleType type) {
		Vehicle v = null;
		switch (type) {
		case TWO:
			v = new TwoWheeler();
			break;
		case THREE:
			v = new ThreeWheeler();
			break;
		case FOUR:
			v = new FourWheeler();
			break;
		default:
			break;
		}
		return v;
	}

}
