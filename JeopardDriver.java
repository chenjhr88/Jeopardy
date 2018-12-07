package jeopardy;

import java.io.FileNotFoundException;
import java.util.*;

public class JeopardDriver 
{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		
		Board main = new Board();
		System.out.println("What is player one's name?");
		Player player1 = new Player(scan.nextLine(), 0);
		System.out.println("What is player two's name?");
		Player player2 = new Player(scan.nextLine(), 0);
	}
}
