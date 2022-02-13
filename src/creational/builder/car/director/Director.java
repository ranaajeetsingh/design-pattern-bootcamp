package creational.builder.car.director;

import creational.builder.car.CarType;
import creational.builder.car.builders.Builder;
import creational.builder.car.components.Engine;
import creational.builder.car.components.GPSNavigator;
import creational.builder.car.components.Transmission;
import creational.builder.car.components.TripComputer;

public class Director {
	public void constructSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructSUV(Builder builder) {
		builder.setCarType(CarType.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
}
