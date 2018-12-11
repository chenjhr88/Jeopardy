package jeopardy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import java.io.FileNotFoundException;
import javax.swing.*;
import java.awt.*;

public class JeopardDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		
		Board main = new Board();
		System.out.println("What is player one's name?");
		Player player1 = new Player(scan.nextLine(), 0);
		System.out.println("What is player two's name?");
		Player player2 = new Player(scan.nextLine(), 0);



		JFrame window = new JFrame();
		window.setSize(800,1000);
		window.setTitle("JEOPARDY");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Board myPanel = new Board();
		myPanel.setLayout(null);
		window.add(myPanel);
		
		window.setVisible(true);
		

		Scanner inF = new Scanner(new File("jeopardyQuestions.txt"));
		Questions[][] q = new Questions[5][4];
		Questions holder = new Questions(" ", " ", 0);
		for(int col = 0; col < q[0].length; col++){
        	for(int row = 0; row < q.length; row++) {
        		holder.setQuestion(inF.nextLine());
        		holder.setAnswer(inF.nextLine());
        		holder.setPoints(inF.nextInt());
        		
        		if(inF.hasNextLine())
        		inF.nextLine();
        		
        		q[row][col] = holder;
        		System.out.println(q[row][col]);
        	}
        }
		
	}
}


