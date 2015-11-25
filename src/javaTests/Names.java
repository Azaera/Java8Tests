package javaTests;

public class Names {
	public String name;
	public int age;
	
	public Names(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + name + ". Age: " + age + "\n";
	}
	
	public void print() {
		System.out.print("Name: " + name + ". Age: " + age);
	}
}
