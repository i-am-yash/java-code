package Inheritance;

public class Person {
	protected String name;        //protected means it can pass to any of its children class ,public means
									//it can pass into any class
	public void eat() {
		System.out.println(name +" is eating");
	}
	public void walk() {
		System.out.println(name +" is walking");
	}

}
