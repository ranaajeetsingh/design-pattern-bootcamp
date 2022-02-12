package creational.abstractfactory.chair;

public class VictorianChair implements Chair {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}
}
