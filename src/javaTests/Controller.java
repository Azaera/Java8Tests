package javaTests;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class Controller {

	private View view = new View();
	private Model model = new Model();
	
	public Controller() {
		
	}
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
		model.setController(this);
		view.oldWayListener(new oldWayListener());
		view.predicateOldListener(new PredicateOld());
		view.predicateLambdaListener(new PredicateLambda());
		view.iterate(new Iterate());
		view.iterateLambda(new IterateLambda());
		view.sortLambda(new SortLambda());
		view.sortOldway(new SortOldway());
	}
	
	public void start(){
	}
	
	class oldWayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String text = "Old way to use ActionListener\n";
			view.setText(text);
		}
	}
	
	class PredicateLambda implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String one = JOptionPane.showInputDialog("Enter a number");
			String two = JOptionPane.showInputDialog("Enter another number");
			
			Integer number1 = Integer.valueOf(one);
			Integer number2 = Integer.valueOf(two);

			boolean check;
			
			check = model.predicateLambda(number1, (i) -> i > number2 ) ;
			
			if (check) {
				view.setText("Number " + number1 + " is higher then " + number2 + "\n");
			}
			else {
				view.setText("Number " + number1 + " is lower then " + number2 +"\n");
			}
			
		}
	}
	
	class PredicateOld implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String one = JOptionPane.showInputDialog("Enter a number");
			String two = JOptionPane.showInputDialog("Enter another number");
			
			Integer number1 = Integer.valueOf(one);
			Integer number2 = Integer.valueOf(two);
			
			boolean test = model.predicateOld(number1, number2);
			
			if (test == true ){
				view.setText("Number " + number1 + " is higher then " + number2 + "\n");
			}
			else {
				view.setText("Number " + number1 + " is lower then " + number2 + "\n");
			
			}
		}
	}
	
	class Iterate implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String list;
			list = model.iterateOld();
			
			view.setText(list);
		}
	}
	
	class IterateLambda implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String list;
			
			list = model.iterateLambda();
			
			view.setText(list);
		}
	}
	
	class SortLambda implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String list;
			list = model.sortLambda();
			view.setText(list);
		}
	}
	
	class SortOldway implements ActionListener {
		public void actionPerformed(ActionEvent e ) {
			String list;
			list = model.sortOldway();
			view.setText(list);
		}
	}
}
