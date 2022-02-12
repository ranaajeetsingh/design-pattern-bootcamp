package creational.abstractfactory;

import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.chair.VictorianChair;
import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.sofa.VictorianSofa;
import creational.abstractfactory.table.Table;
import creational.abstractfactory.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new VictorianTable();
	}

}
