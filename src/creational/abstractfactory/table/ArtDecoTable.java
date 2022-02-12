package creational.abstractfactory.table;

public class ArtDecoTable implements Table{

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
