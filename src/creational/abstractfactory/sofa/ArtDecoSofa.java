package creational.abstractfactory.sofa;

public class ArtDecoSofa implements Sofa {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
