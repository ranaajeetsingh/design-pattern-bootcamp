package creational.abstractfactory;

import creational.abstractfactory.chair.ArtDecoChair;
import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.sofa.ArtDecoSofa;
import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.table.ArtDecoTable;
import creational.abstractfactory.table.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new ArtDecoSofa();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new ArtDecoTable();
	}

}
