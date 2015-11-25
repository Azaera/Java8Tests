package javaTests;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Model {

	private Controller controller;
	private List<Names> names = new ArrayList<Names>();
	private Names name;
	
	public Model() {
		names.add(new Names("Andrew", 30));
		names.add(new Names("Scott",32));
		names.add(new Names("Milhouse",35));
		names.add(new Names("Bart",23));
		names.add(new Names("Nelson",27));
		names.add(new Names("Lisa",20));
		names.add(new Names("Maggie",18));
		names.add(new Names("Sofy",14));
		names.add(new Names("Andy",41));
	}
	
	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	public boolean predicateOld(int x, int y) {
		if (x > y ) {
		 return true;	
		}
		else
			return false;

	}
	
	public boolean predicateLambda(int number,  Predicate<Integer> predicate) {
		if(predicate.test(number) == true ){
			return true;
		}
		else 
			return false;
		
	}
	
	public String iterateOld() {
		String list = "";
		Iterator iter = names.iterator();
		while (iter.hasNext()) {
			list += iter.next().toString();
		}
		list += "\n";
		return list;
	}
	
	public String iterateLambda() {		
		String list = "";
		//Reaching the print method. 
		//Note the toString method won't show anything in console
		names.forEach(n -> n.print());
		
		//Concat for showing output in View using toString method
		list = names.stream().map(e -> e.toString()).reduce("", String::concat);
		list += "\n";
		return list;
	}

}
