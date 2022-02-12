package creational.abstractfactory;

import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.table.Table;

public class Client {
	private Chair chair;
	private Sofa sofa;
	private Table table;

	public Client(FurnitureFactory furniture) {
		chair = furniture.createChair();
		sofa = furniture.createSofa();
		table = furniture.createTable();
	}

	public void print() {
		chair.print();
		sofa.print();
		table.print();
	}

	public static void main(String[] args) {
		Client client = null;
		FurnitureFactory furniture = null;
		FurnitureType type = FurnitureType.ARTDECO;
		switch (type) {
		case ARTDECO:
			furniture = new ArtDecoFurnitureFactory();
			client = new Client(furniture);
			break;
		case MODERN:
			furniture = new ModernFurnitureFactory();
			client = new Client(furniture);
			break;
		case VICTORIAN:
			furniture = new VictorianFurnitureFactory();
			client = new Client(furniture);
			break;

		default:
			break;
		}
		client.print();
	}
}
