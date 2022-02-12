package creational.abstractfactory.table;

public class ModernTable implements Table {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
