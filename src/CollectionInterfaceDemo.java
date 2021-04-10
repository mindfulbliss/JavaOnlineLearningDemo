import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//collection - concept
//Collection - Interface 
//Collections - Class

public class CollectionInterfaceDemo {

	public static void main(String[] args) {
		// Collection below itself is an interface
		// we cannot create a obj of Interface directly.
		// we need to find classes that implement Collection interface
		// ArrayList class extends List class which extends Collection
		Collection<Object> values = new ArrayList<>();
		values.add(3);
		values.add("Name");
		values.add('Z');
		values.add(true);
		values.add(4.5f);

		System.out.println(values);
		System.out.println(values.size());
		System.out.println(values.isEmpty());

		// To remove a value from the Collection
		values.remove('Z');

		System.out.println(values);

		// Problem here is we cannot loop over the values collection and
		// or get specific value.
		// To solve this problem use a Iterator

		Iterator<Object> it = values.iterator();
		// it.next() gets the next value from the array
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

		// Looping
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
		//The problem with Collection interface is that it does not support
		//a index based add remove insert.
		//So we should use List

	}

}
