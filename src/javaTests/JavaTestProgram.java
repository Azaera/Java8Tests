package javaTests;

public class JavaTestProgram {

	public static void main(String[] args){
		
		Model model = new Model();
		View view = new View();
		
		Controller cont = new Controller(model, view);
		
		view.setVisible();
	}
}
