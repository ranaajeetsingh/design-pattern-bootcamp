package creational.abstractfactory.sofa;

public class ModernSofa implements Sofa {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
