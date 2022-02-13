package creational.builder.car.builders;

import creational.builder.car.CarType;
import creational.builder.car.components.Engine;
import creational.builder.car.components.GPSNavigator;
import creational.builder.car.components.Transmission;
import creational.builder.car.components.TripComputer;

public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}
