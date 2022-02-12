package creational.abstractfactory.chair;

public class ArtDecoChair implements Chair {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
	}
}
