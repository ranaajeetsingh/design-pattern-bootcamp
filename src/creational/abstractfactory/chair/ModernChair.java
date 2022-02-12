package creational.abstractfactory.chair;

public class ModernChair  implements Chair{

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		}

}
