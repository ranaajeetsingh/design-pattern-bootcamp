package creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton instance;

	private Singleton() {
		// To overcome reflection issue
		if (instance != null) {
			throw new RuntimeException("DuplicateInstanceException");
		}
	}

	public static Singleton getInsatance() {

		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// return super.clone();

		// To overcome cloning issue
		// throw new CloneNotSupportedException();

		// If you don't want to throw exception
		return instance;
	}

	// To overcome serialization issue
	protected Object readResolve() {
		return instance;
	}

}
