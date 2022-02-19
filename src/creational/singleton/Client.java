package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		System.out.println(Singleton.getInsatance().hashCode());
		System.out.println(Singleton.getInsatance().hashCode());

		// Reflection Hack		
		Singleton instance = null;
		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// Below code will destroy the singleton pattern
			constructor.setAccessible(true);
			instance = (Singleton) constructor.newInstance();
			break;
		}
		System.out.println(instance.hashCode());
		
		// Serialize & Deserialize Hack
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instance);
		out.close();

		// deserialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

		Singleton instance1 = (Singleton) in.readObject();
		in.close();
		System.out.println(instance1.hashCode());
		
		// Clone Hack
		Singleton instance2 = (Singleton) instance1.clone();
		System.out.println(instance2.hashCode());
	}
}
