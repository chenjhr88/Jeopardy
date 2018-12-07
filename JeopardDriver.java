package jeopardy;

import java.io.FileNotFoundException;
import javax.swing.*;


public class JeopardDriver 
{
	public static void main(String[] args) throws FileNotFoundException {
		
		JFrame window = new JFrame();
		window.setSize(1000,1000);
		window.setTitle("JEOPARDY");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Board myPanel = new Board();
		myPanel.setLayout(null);
		window.add(myPanel);
		
		window.setVisible(true);
		

		
		Questions main = new Questions();
		main.inputQuestions();
		System.out.println(main);
	}
}
