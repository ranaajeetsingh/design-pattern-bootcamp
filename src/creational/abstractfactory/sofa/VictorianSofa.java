package creational.abstractfactory.sofa;

public class VictorianSofa implements Sofa{

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
