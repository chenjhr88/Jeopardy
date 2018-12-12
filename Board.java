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
	JButton enter = new JButton("ANSWER");
	JTextField input = new JTextField("",20);
	JLabel question = new JLabel("Player One, enter your name");
	JLabel p1 = new JLabel("PLAYER 1 SCORE");
	JLabel p1score = new JLabel("0");
	JLabel p2 = new JLabel("PLAYER 2 SCORE");
	JLabel p2score = new JLabel("0");
	public  String qAnswer = "";
	
	
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

			this.add(enter);
			enter.setBounds(550,900,100,50);
			this.add(input);
			input.setBounds(100,900,450,50);
			this.add(question);		
			question.setBounds(100,850,550,25);
			
			this.add(p1);
			this.add(p1score);
			this.add(p2);
			this.add(p2score);
			p1.setBounds(700,100,100,50);
			p1score.setBounds(750,200,50,50);
			p2.setBounds(850,100,100,50);
			p2score.setBounds(900,200,50,50);

			Scanner inF = new Scanner(new File("jeopardyQuestions.txt"));
			Questions[][] q = new Questions[4][5];
			Questions csOne = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions csTwo = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions csThree = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions csFour = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions csFive = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions cOne = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions cTwo = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions cThree = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions cFour = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions cFive = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions mOne = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions mTwo = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions mThree = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions mFour = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions mFive = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions gOne = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions gTwo = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions gThree = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions gFour = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			inF.nextLine();
			Questions gFive = new Questions(inF.nextLine(), inF.nextLine(), inF.nextInt());
			
			
			
			cs1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csOne.getQuestion());
					qAnswer = csOne.getAnswer();
			}
		});
			cs2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csTwo.getQuestion());				
			}
		});
			cs3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csThree.getQuestion());				
			}
		});
			cs4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csFour.getQuestion());				
			}
		});
			cs5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csFive.getQuestion());				
			}
		});
			c1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cOne.getQuestion());				
			}
		});
			c2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cTwo.getQuestion());				
			}
		});
			c3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cThree.getQuestion());				
			}
		});
			c4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cFour.getQuestion());				
			}
		});
			c5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cFive.getQuestion());				
			}
		});
			m1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mOne.getQuestion());				
			}
		});
			m2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mTwo.getQuestion());				
			}
		});
			m3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mThree.getQuestion());				
			}
		});
			m4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mFour.getQuestion());				
			}
		});
			m5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mFive.getQuestion());				
			}
		});
			g1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gOne.getQuestion());				
			}
		});
			g2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gTwo.getQuestion());				
			}
		});
			g3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gThree.getQuestion());				
			}
		});
			g4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gFour.getQuestion());				
			}
		});
			g5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gFive.getQuestion());
					
			}
		});
			enter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {	
					int x = 0;
					if (x == 0) {
						Player player1 = new Player(input.getText(),0);
						x++;
						question.setText("Player Two, enter your name");
						
					}
					else if(x == 1) {
						Player player1 = new Player(input.getText(),0);
						x++;
						question.setText("Player One, click on the question you would like");
					}
					else
						readText();
			}
		});

		}
			public void readText() {
				
				String answer;
				answer = input.getText();
				if (answer.contains(qAnswer)) {
					
					question.setText("Correct, your turn again");
				}
				else 
					question.setText("Incorrect, next player"); 
				

				
			
			    
			
			}

}
