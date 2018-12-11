package jeopardy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board extends JPanel
{
	
	JLabel cs = new JLabel("COMPSCI A");
	JLabel china = new JLabel("CHINA");
	JLabel meme = new JLabel("MEMES");
	JLabel game = new JLabel("GAMES");
	JButton cs1 = new JButton("100");
	JButton cs2 = new JButton("200");
	JButton cs3 = new JButton("300");
	JButton cs4 = new JButton("400");
	JButton cs5 = new JButton("500");
	JButton c1 = new JButton("100");
	JButton c2 = new JButton("200");
	JButton c3 = new JButton("300");
	JButton c4 = new JButton("400");
	JButton c5 = new JButton("500");
	JButton m1 = new JButton("100");
	JButton m2 = new JButton("200");
	JButton m3 = new JButton("300");
	JButton m4 = new JButton("400");
	JButton m5 = new JButton("500");
	JButton g1 = new JButton("100");
	JButton g2 = new JButton("200");
	JButton g3 = new JButton("300");
	JButton g4 = new JButton("400");
	JButton g5 = new JButton("500");
	JTextField input = new JTextField("",20);
	JLabel question = new JLabel("(Question will appear here)");
	
	
		public Board() throws FileNotFoundException
		{
			//labels

			this.add(cs);	
			cs.setBounds(125,0,100,100);	
			
			this.add(china);	
			china.setBounds(275,0,100,100);
			
			this.add(meme);	
			meme.setBounds(425,0,100,100);			
			
			this.add(game);	
			game.setBounds(575,0,100,100);
			

		  //  b1.setEnabled(false);

			
			//cs
		
			cs1.setBounds(100,100,100,100);
			this.add(cs1);

			cs2.setBounds(100,250,100,100);
			this.add(cs2);
			
			cs3.setBounds(100,400,100,100);	
			this.add(cs3);
			
			cs4.setBounds(100,550,100,100);		
			this.add(cs4);			
			
			cs5.setBounds(100,700,100,100);			
			this.add(cs5);
			
			

			//china			

			c1.setBounds(250,100,100,100);
			this.add(c1);			
			
			c2.setBounds(250,250,100,100);
			this.add(c2);		
			
			c3.setBounds(250,400,100,100);
			this.add(c3);			
			
			c4.setBounds(250,550,100,100);
			this.add(c4);		
			
			c5.setBounds(250,700,100,100);
			this.add(c5);
			
			//meme		
			
			m1.setBounds(400,100,100,100);
			this.add(m1);
			
			m2.setBounds(400,250,100,100);
			this.add(m2);
			
			m3.setBounds(400,400,100,100);
			this.add(m3);
			
			m4.setBounds(400,550,100,100);
			this.add(m4);
			
			m5.setBounds(400,700,100,100);
			this.add(m5);
			
			//games		
			
			g1.setBounds(550,100,100,100);
			this.add(g1);
			
			g2.setBounds(550,250,100,100);
			this.add(g2);
			
			g3.setBounds(550,400,100,100);
			this.add(g3);
		
			g4.setBounds(550,550,100,100);
			this.add(g4);
			
			g5.setBounds(550,700,100,100);
			this.add(g5);

			//type


			this.add(input);
			input.setBounds(100,900,550,50);
			this.add(question);		
			question.setBounds(100,850,550,25);

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
			
			cs1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(q[0][0].getQuestion());				
			}
		});
		}
			public void readText(java.awt.event.ActionEvent evt)
			{
				String answer;
				answer = input.getText();
				JTextField question = new JTextField(answer);
				
				question.setVisible(true);

				
			
			    
			
			}

}
