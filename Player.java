package jeopardy;

public class Player {
	private String name;
	private int points;
	
	public Player (String name, int points) {
		this.name = name;
		this.points = points;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points the points to be set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
}