package creational.abstractfactory;

import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.chair.ModernChair;
import creational.abstractfactory.sofa.ModernSofa;
import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.table.ModernTable;
import creational.abstractfactory.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new ModernTable();
	}

}
