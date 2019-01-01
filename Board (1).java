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
	JLabel p1 = new JLabel("PLAYER 1");
	JLabel p1score = new JLabel("0");
	JLabel p2 = new JLabel("PLAYER 2");
	JLabel p2score = new JLabel("0");
	public  String qAnswer = "";
	public int qPoints = 0;
	private static int sCount = 0;
	public int x = 0;
	int hold = 0;
	int hold2 = 0;
	Player player1;
	Player player2;
	private static int y = 0;
	
	
		public Board() throws FileNotFoundException
		{
			setBackground(Color.gray);
			//labels

			this.add(cs);	
			cs.setBounds(100,0,100,100);	
			
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
			p1.setBounds(725,100,100,50);
			p1score.setBounds(750,200,50,50);
			p2.setBounds(875,100,100,50);
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
					qPoints = csOne.getPoints();
					cs1.setVisible(false);
					y++;
			}
		});
			cs2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csTwo.getQuestion());	
					qAnswer = csTwo.getAnswer();
					qPoints = csTwo.getPoints();
					cs2.setVisible(false);
					y++;
			}
		});
			cs3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csThree.getQuestion());
					qPoints = csThree.getPoints();
					qAnswer = csThree.getAnswer();
					cs3.setVisible(false);
					y++;
			}
		});
			cs4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csFour.getQuestion());	
					qPoints = csFour.getPoints();
					qAnswer = csFour.getAnswer();
					cs4.setVisible(false);
					y++;
			}
		});
			cs5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(csFive.getQuestion());	
					qPoints = csFive.getPoints();
					qAnswer = csFive.getAnswer();
					cs5.setVisible(false);
					y++;
			}
		});
			c1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cOne.getQuestion());	
					qPoints = cOne.getPoints();
					qAnswer = cOne.getAnswer();
					c1.setVisible(false);
					y++;
			}
		});
			c2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cTwo.getQuestion());	
					qPoints = cTwo.getPoints();
					qAnswer = cTwo.getAnswer();
					c2.setVisible(false);
					y++;
			}
		});
			c3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cThree.getQuestion());	
					qPoints = cThree.getPoints();
					qAnswer = cThree.getAnswer();
					c3.setVisible(false);
					y++;
			}
		});
			c4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cFour.getQuestion());	
					qPoints = cFour.getPoints();
					qAnswer = cFour.getAnswer();
					c4.setVisible(false);
					y++;
			}
		});
			c5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(cFive.getQuestion());	
					qPoints = cFive.getPoints();
					qAnswer = cFive.getAnswer();
					c5.setVisible(false);
					y++;
			}
		});
			m1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mOne.getQuestion());	
					qPoints = mOne.getPoints();
					qAnswer = mOne.getAnswer();
					m1.setVisible(false);
					y++;
			}
		});
			m2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mTwo.getQuestion());
					qPoints = mTwo.getPoints();
					qAnswer = mTwo.getAnswer();
					m2.setVisible(false);
					y++;
			}
		});
			m3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mThree.getQuestion());	
					qPoints = mThree.getPoints();
					qAnswer = mThree.getAnswer();
					m3.setVisible(false);
					y++;
			}
		});
			m4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mFour.getQuestion());		
					qPoints = mFour.getPoints();
					qAnswer = mFour.getAnswer();
					m4.setVisible(false);
					y++;
			}
		});
			m5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(mFive.getQuestion());	
					qPoints = mFive.getPoints();
					qAnswer = mFive.getAnswer();
					m5.setVisible(false);
					y++;
			}
		});
			g1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gOne.getQuestion());		
					qPoints = gOne.getPoints();
					qAnswer = gOne.getAnswer();
					g1.setVisible(false);
					y++;
			}
		});
			g2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gTwo.getQuestion());	
					qPoints = gTwo.getPoints();
					qAnswer = gTwo.getAnswer();
					g2.setVisible(false);
					y++;
			}
		});
			g3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gThree.getQuestion());		
					qPoints = gThree.getPoints();
					qAnswer = gThree.getAnswer();
					g3.setVisible(false);
					y++;
			}
		});
			g4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gFour.getQuestion());		
					qPoints = gFour.getPoints();
					qAnswer = gFour.getAnswer();
					g4.setVisible(false);
					y++;
			}
		});
			g5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					question.setText(gFive.getQuestion());
					qPoints = gFive.getPoints();
					qAnswer = gFive.getAnswer();
					g5.setVisible(false);
					y++;
					
			}
		});
			enter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {	
					
					if (x == 0) {
						player1 = new Player(input.getText(),0);
						question.setText("Player Two, enter your name");
						p1.setText(player1.getName());
						input.setText("");
						x++;
					}
					else if(x == 1) {
						player2 = new Player(input.getText(),0);
						p2.setText(player2.getName());
						question.setText(player1.getName() + " click on the question you would like");
						input.setText("");
						x++;
					}
					else
						readText();
			}
		});
			cs1.setOpaque(true);
			cs1.setBackground(Color.black);
			cs2.setOpaque(true);
			cs2.setBackground(Color.black);
			cs3.setOpaque(true);
			cs3.setBackground(Color.black);
			cs4.setOpaque(true);
			cs4.setBackground(Color.black);
			cs5.setOpaque(true);
			cs5.setBackground(Color.black);
			c1.setOpaque(true);
			c1.setBackground(Color.black);
			c2.setOpaque(true);
			c2.setBackground(Color.black);
			c3.setOpaque(true);
			c3.setBackground(Color.black);
			c4.setOpaque(true);
			c4.setBackground(Color.black);
			c5.setOpaque(true);
			c5.setBackground(Color.black);
			m1.setOpaque(true);
			m1.setBackground(Color.black);
			m2.setOpaque(true);
			m2.setBackground(Color.black);
			m3.setOpaque(true);
			m3.setBackground(Color.black);
			m4.setOpaque(true);
			m4.setBackground(Color.black);
			m5.setOpaque(true);
			m5.setBackground(Color.black);
			g1.setOpaque(true);
			g1.setBackground(Color.black);
			g2.setOpaque(true);
			g2.setBackground(Color.black);
			g3.setOpaque(true);
			g3.setBackground(Color.black);
			g4.setOpaque(true);
			g4.setBackground(Color.black);
			g5.setOpaque(true);
			g5.setBackground(Color.black);
			enter.setOpaque(true);
			enter.setBackground(Color.black);
			
			cs.setFont(new Font("Arial", Font.BOLD, 15)); 
			china.setFont(new Font("Arial", Font.BOLD, 15)); 
			meme.setFont(new Font("Arial", Font.BOLD, 15)); 
			game.setFont(new Font("Arial", Font.BOLD, 15)); 
			cs1.setFont(new Font("Arial", Font.BOLD, 30)); 
			cs2.setFont(new Font("Arial", Font.BOLD, 30)); 
			cs3.setFont(new Font("Arial", Font.BOLD, 30)); 
			cs4.setFont(new Font("Arial", Font.BOLD, 30)); 
			cs5.setFont(new Font("Arial", Font.BOLD, 30)); 
			c1.setFont(new Font("Arial", Font.BOLD, 30)); 
			c2.setFont(new Font("Arial", Font.BOLD, 30)); 
			c3.setFont(new Font("Arial", Font.BOLD, 30)); 
			c4.setFont(new Font("Arial", Font.BOLD, 30)); 
			c5.setFont(new Font("Arial", Font.BOLD, 30)); 
			m1.setFont(new Font("Arial", Font.BOLD, 30)); 
			m2.setFont(new Font("Arial", Font.BOLD, 30)); 
			m3.setFont(new Font("Arial", Font.BOLD, 30)); 
			m4.setFont(new Font("Arial", Font.BOLD, 30)); 
			m5.setFont(new Font("Arial", Font.BOLD, 30)); 
			g1.setFont(new Font("Arial", Font.BOLD, 30)); 
			g2.setFont(new Font("Arial", Font.BOLD, 30)); 
			g3.setFont(new Font("Arial", Font.BOLD, 30)); 
			g4.setFont(new Font("Arial", Font.BOLD, 30)); 
			g5.setFont(new Font("Arial", Font.BOLD, 30)); 
			enter.setFont(new Font("Arial", Font.BOLD, 15)); 
			question.setFont(new Font("Arial", Font.PLAIN, 13)); 
			p1.setFont(new Font("Arial", Font.BOLD, 15)); 
			p1score.setFont(new Font("Arial", Font.BOLD, 30)); 
			p2.setFont(new Font("Arial", Font.BOLD, 15)); 
			p2score.setFont(new Font("Arial", Font.BOLD, 30)); 

			 cs1.setText("<html><font color=\"white\">100</font></html>");
			 cs2.setText("<html><font color=\"white\">200</font></html>");
			 cs3.setText("<html><font color=\"white\">300</font></html>");
			 cs4.setText("<html><font color=\"white\">400</font></html>");
			 cs5.setText("<html><font color=\"white\">500</font></html>");
			 c1.setText("<html><font color=\"white\">100</font></html>");
			 c2.setText("<html><font color=\"white\">200</font></html>");
			 c3.setText("<html><font color=\"white\">300</font></html>");
			 c4.setText("<html><font color=\"white\">400</font></html>");
			 c5.setText("<html><font color=\"white\">500</font></html>");
			 m1.setText("<html><font color=\"white\">100</font></html>");
			 m2.setText("<html><font color=\"white\">200</font></html>");
			 m3.setText("<html><font color=\"white\">300</font></html>");
			 m4.setText("<html><font color=\"white\">400</font></html>");
			 m5.setText("<html><font color=\"white\">500</font></html>");
			 g1.setText("<html><font color=\"white\">100</font></html>");
			 g2.setText("<html><font color=\"white\">200</font></html>");
			 g3.setText("<html><font color=\"white\">300</font></html>");
			 g4.setText("<html><font color=\"white\">400</font></html>");
			 g5.setText("<html><font color=\"white\">500</font></html>");
			 enter.setText("<html><font color=\"white\">ANSWER</font></html>");



		}
			public void readText() {
				
				String answer;
				answer = input.getText();
				
				
				if (answer.toUpperCase().contains(qAnswer.toUpperCase())) {
					
					question.setText("Correct, your turn again");
					if (sCount % 2 == 0) {
						hold += qPoints;
						p1score.setText(String.valueOf(hold));
						input.setText("");
					}
					else {
					hold2 += qPoints;
					p2score.setText(String.valueOf(hold2));
					input.setText("");
					}
				}
				else {
					question.setText("Incorrect, next player"); 
					input.setText("");
					sCount++;
				}
				if (y == 20)
				{
					if (hold > hold2)
						question.setText(player1.getName() + " WON!");
						
					if (hold < hold2)
						question.setText(player2.getName() + " WON!");
						
					if (hold == hold2)
						question.setText(player1.getName() + " and " + player1.getName() + " TIED!");
				}
				

			}
}
