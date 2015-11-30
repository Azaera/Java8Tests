package javaTests;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class View {

	private JFrame frame = new JFrame("Java 8 Tests");
	private JPanel background = new JPanel();
	private Dimension windowSize = new Dimension();
	
	private JPanel leftSide = new JPanel();
	private JPanel rightSide = new JPanel();
	
	private JButton predicateOld = new JButton("Predicate");
	private JButton predicateLambda = new JButton("Predicate - Lambda");

	private JButton oldWay = new JButton("ActionListener - Old way");
	private JButton lambdaWay = new JButton("ActionListener - Lambda");
	
	private JButton iterate = new JButton("Iterate List");
	private JButton iterateLambda = new JButton("Iterate - Lambda");
	
	private JButton sortOldway = new JButton("Sorting - Old way");
	private JButton sortLambda = new JButton("Sorting - Lambda");

	private JTextArea printer = new JTextArea(43,40);
	
	private Dimension left = new Dimension();
	
	public View () {
	
		windowSize.setSize(900, 700);
		left.setSize(450, 700);
		
		background.setLayout(new GridLayout(1,2));
		background.setPreferredSize(windowSize);
	
		leftSide.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(3,40,10,3);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		
		leftSide.add(oldWay,gbc);

		gbc.gridx = 3;
		gbc.gridy = 0;
		leftSide.add(lambdaWay,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		leftSide.add(predicateOld, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		leftSide.add(predicateLambda, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		leftSide.add(iterate, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 2;
		leftSide.add(iterateLambda, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		leftSide.add(sortOldway, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		leftSide.add(sortLambda, gbc);
		
		/*
		 * Lambda way to use actionlistener. 
		 * Notice no need to use a inner class in controller
		 */
		lambdaWay.addActionListener((event) -> printer.append("Lambda way to use ActionListener\n"));
		
		rightSide.setLayout(new FlowLayout());
		rightSide.setPreferredSize(left);
		rightSide.add(printer);
		
		background.add(leftSide);
		background.add(rightSide);
		
		frame.add(background);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();		
		frame.setLocationRelativeTo(null);
	}
	
	public void setVisible() {
		frame.setVisible(true);
		
	}
	
	public void sortOldway(ActionListener act){
		sortOldway.addActionListener(act);
	}
	
	public void sortLambda(ActionListener act) {
		sortLambda.addActionListener(act);
	}
	
	public void iterate(ActionListener act){
		iterate.addActionListener(act);
	}
	
	public void iterateLambda(ActionListener act) {
		iterateLambda.addActionListener(act);
	}

	public void oldWayListener(ActionListener act) {
		oldWay.addActionListener(act);
	}
	
	public void predicateOldListener(ActionListener act) {
		predicateOld.addActionListener(act);
	}
	
	public void predicateLambdaListener(ActionListener act) {
		predicateLambda.addActionListener(act);
	}
	
	public void setText(String text) {
		printer.append(text);
	}
}
