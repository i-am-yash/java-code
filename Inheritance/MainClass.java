package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.name="harry";
		t.walk();
		t.teach();
		t.eat();
		Footballer f=new Footballer();
		f.name="Ronaldo";
		f.eat();
		f.playFootball();
		f.walk();
		

	}

}
