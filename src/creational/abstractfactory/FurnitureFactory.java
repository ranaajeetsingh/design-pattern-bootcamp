package creational.abstractfactory;

import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.table.Table;

public interface FurnitureFactory {
	Chair createChair();

	Sofa createSofa();

	Table createTable();
}
