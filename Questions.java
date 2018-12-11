package jeopardy;

import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questions{
	private String question, answer;
	private int points;
	private boolean isVisible;
	
	public Questions (String question, String answer, int points) {
		this.question = question;
		this.answer = answer;
		this.points = points;
		this.isVisible = true;
	}
	
	public String toString() {
		String str = this.question + "\n" + this.answer + "\n" + this.points;
		return str;
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

	/**
	 * @return the isVisible
	 */
	public boolean isVisible() {
		return isVisible;
	}

	/**
	 * @param isVisible the isVisible to set
	 */
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

}
