package day12.T;

public class TestMyArray {
	public static void main(String[] args) {
		Person p = new Person();
		
//		MyArray myArray = new MyArray();
//		myArray.add("abc");
//		myArray.add(1);
//		myArray.add(p);
//		System.out.println(myArray.get(0));
//		System.out.println(myArray.get(1));
//		System.out.println(myArray.get(2));
		
		MyArray<String> arr1 = new MyArray<String>();
//		arr1.add(1);
		arr1.add("123");
		arr1.add("123");
		arr1.add("123");
		arr1.add("123");
		String str = arr1.get(0);
		System.out.println(str);
		
		MyArray<Integer> arr2 = new MyArray<Integer>();
		arr2.add(1);
		MyClass class1 = new MyClass();
//		MyArray<MyClass> arr3 = new MyArray<MyClass>();
//		Integer i = new Integer(11);
//		arr3.add(3.2);
//		arr3.add(1);
//		arr3.add(i);
//		MyClass myClass = new MyClass();
//		arr3.add(myClass);
		//		arr2.add("rwe");
	}
}
class Person{
	
}
class MyClass extends Number{
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
