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
			cs.setBounds(100,0,100,100);
			
			JLabel china = new JLabel("COMSCI A");
			this.add(china);	
			china.setBounds(250,0,100,100);
			
			JLabel meme = new JLabel("COMSCI A");
			this.add(meme);	
			meme.setBounds(400,0,100,100);
			
			JLabel game = new JLabel("COMSCI A");
			this.add(game);	
			game.setBounds(550,0,100,100);
			
			//cs
			
			
			JButton cs1 = new JButton("100");
			cs1.setLayout(null);

			
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
			
			JButton cs6 = new JButton("100");
			cs6.setBounds(250,100,100,100);
			
			//china
			
			JButton c1 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(c1);
			JButton c2 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(c2);
			JButton c3 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(c3);
			cs5.setBounds(100,700,100,100);
			JButton c4 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(c4);
			JButton c5 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(c5);
			
			//meme
			
			JButton m1 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(m1);
			JButton m2 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(m2);
			JButton m3 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(m3);
			cs5.setBounds(100,700,100,100);
			JButton m4 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(m4);
			JButton m5 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(m5);
			
			//games
			
			JButton g1 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(g1);
			JButton g2 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(g2);
			JButton g3 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(g3);
			cs5.setBounds(100,700,100,100);
			JButton g4 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(g4);
			JButton g5 = new JButton("");
			cs5.setBounds(100,700,100,100);
			this.add(g5);
			
			
		}

}
