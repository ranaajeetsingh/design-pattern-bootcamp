package creational.factory;

public class VehicleClient {

	public static void main(String[] args) {
		// Without Vehicle Factory
		Vehicle vehicleObject = null;
		VehicleType type = VehicleType.THREE;

		switch (type) {
		case TWO:
			vehicleObject = new TwoWheeler();
			break;
		case THREE:
			vehicleObject = new ThreeWheeler();
			break;
		case FOUR:
			vehicleObject = new FourWheeler();
			break;
		default:
			break;
		}
		vehicleObject.print();

		// With Vehicle Factory

		VehicleType type1 = VehicleType.FOUR;

		Vehicle vehicleObject1 = VehicleFactory.getVehicle(type1);

		vehicleObject1.print();
	}
}
