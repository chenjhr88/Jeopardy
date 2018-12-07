package jeopardy;

import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions{
	private String question;
	private int points;
	private String answer;
	
	public Questions (String question, String answer ,int points) {
		this.question = question;
		this.answer = answer;
		this.points = points;
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
