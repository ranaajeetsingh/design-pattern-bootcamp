package creational.abstractfactory.table;

public class VictorianTable implements Table {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
