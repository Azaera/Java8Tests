package javaTests;

import java.util.Comparator;

public class Names{
	public String name;
	public int age;
	
	public Names(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	//Used for the Java8 sorting
	public static int nameCompare(Names a1, Names a2) {
		return a1.name.compareTo(a2.name);
	}
	
	public String toString() {
		return "Name: " + name + ". Age: " + age + "\n";
	}
	
	public void print() {
		System.out.print("Name: " + name + ". Age: " + age + "\n");
	}
}
