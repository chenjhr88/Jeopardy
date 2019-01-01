package jeopardy;

import java.io.FileNotFoundException;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;


public class JeopardDriver 
{
	public static void main(String[] args) throws FileNotFoundException {
	
		header();
		window();

	}
	
	public static void header()
	{
		System.out.println("Made by Alex Hu and Justin Chen");
		System.out.println("Jeopardy Project");
		System.out.println("12/18/18");
	}
	
	public static void window() throws FileNotFoundException
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame window = new JFrame();
		window.getContentPane().setBackground(Color.red); 
		window.setSize(1000,1000);
		window.setTitle("JEOPARDY");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Board myPanel = new Board();
		myPanel.setLayout(null);

		window.add(myPanel);
		
		window.setVisible(true);
		window.getContentPane().setBackground(Color.RED);
		

	}
	
	
}
