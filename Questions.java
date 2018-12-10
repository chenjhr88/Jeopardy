package jeopardy;

import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions{
	private String question, answer, category;
	private int points;
	private boolean isVisible;
	
	public Questions (String question, String answer, String category , int points, boolean isVisible) {
		this.question = question;
		this.answer = answer;
		this.category = category;
		this.points = points;
		this.isVisible = isVisible;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

}
