package jeopardy;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel
{

		public Board()
		{
			//labels
			
			JLabel cs = new JLabel("COMSCI A");
			this.add(cs);	
			cs.setBounds(125,0,100,100);
			
			JLabel china = new JLabel("CHINA");
			this.add(china);	
			china.setBounds(275,0,100,100);
			
			JLabel meme = new JLabel("MEMES");
			this.add(meme);	
			meme.setBounds(425,0,100,100);
			
			JLabel game = new JLabel("GAMES");
			this.add(game);	
			game.setBounds(575,0,100,100);
			
			//cs
			
			
			JButton cs1 = new JButton("100");
			

			
			cs1.setBounds(100,100,100,100);
			this.add(cs1);
			
			
			JButton cs2 = new JButton("200");
			
			cs2.setBounds(100,250,100,100);

			
			this.add(cs2);
			
			JButton cs3 = new JButton("300");
			cs3.setBounds(100,400,100,100);
			
			this.add(cs3);
			
			JButton cs4 = new JButton("400");
			cs4.setBounds(100,550,100,100);
			
			this.add(cs4);
			
			JButton cs5 = new JButton("500");
			cs5.setBounds(100,700,100,100);
			
			this.add(cs5);

			//china
			
			JButton c1 = new JButton("100");
			c1.setBounds(250,100,100,100);
			this.add(c1);
			
			JButton c2 = new JButton("200");
			c2.setBounds(250,250,100,100);
			this.add(c2);
			
			JButton c3 = new JButton("300");
			c3.setBounds(250,400,100,100);
			this.add(c3);
			
			JButton c4 = new JButton("400");
			c4.setBounds(250,550,100,100);
			this.add(c4);
			
			JButton c5 = new JButton("500");
			c5.setBounds(250,700,100,100);
			this.add(c5);
			
			//meme
			
			JButton m1 = new JButton("100");
			m1.setBounds(400,100,100,100);
			this.add(m1);
			JButton m2 = new JButton("200");
			m2.setBounds(400,250,100,100);
			this.add(m2);
			JButton m3 = new JButton("300");
			m3.setBounds(400,400,100,100);
			this.add(m3);
			JButton m4 = new JButton("400");
			m4.setBounds(400,550,100,100);
			this.add(m4);
			JButton m5 = new JButton("500");
			m5.setBounds(400,700,100,100);
			this.add(m5);
			
			//games
			
			JButton g1 = new JButton("100");
			g1.setBounds(550,100,100,100);
			this.add(g1);
			JButton g2 = new JButton("200");
			g2.setBounds(550,250,100,100);
			this.add(g2);
			JButton g3 = new JButton("300");
			g3.setBounds(550,400,100,100);
			this.add(g3);
			JButton g4 = new JButton("400");
			g4.setBounds(550,550,100,100);
			this.add(g4);
			JButton g5 = new JButton("500");
			g5.setBounds(550,700,100,100);
			this.add(g5);
			
			//type
			
			JTextField input = new JTextField("",20);
			this.add(input);
			input.setBounds(100,850,550,50);
			String answer = input.getText();
			System.out.println(answer);
			
		}

}
