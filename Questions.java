package jeopardy;

import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions{
	
	
	private String[][] questions = new String[5][4];
	private String[][] answers = new String[5][4];
	private int[][] points = new int[5][4];
	private int numRow = questions.length;
	private int numCol = questions[0].length;
	
	public void inputQuestions() throws FileNotFoundException {
		
		Scanner inF = new Scanner(new File("jeopardyQuestions.txt"));
		
		System.out.println(numCol);
		
		for (int row  = 0; row < numRow; row ++) {	
        	for(int col = 0; col < numCol; col++) {
        		questions[row][col] += inF.nextLine();
        		answers[row][col] += inF.nextLine();
        		points[row][col] += inF.nextInt();
        		inF.nextLine();
        	}
        }		
	}
	
	public String toString() {
		String str = "";
		for (int row  = 0; row < numRow; row ++) {	
        	for(int col = 0; col < numCol; col++) {
        		str += questions[row][col] + "\n";
        	}
        }
		return str;
	}
	
	
	
	
}
