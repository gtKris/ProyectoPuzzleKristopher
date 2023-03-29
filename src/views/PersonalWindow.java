package views;

import javax.swing.*;




public class PersonalWindow extends JFrame {
	
static int option;
static int hora;
static int minuto;
static int segundo;
static String time;


	public PersonalWindow () {
		
		MyWindow();
		 
	}
	
	private JButton rud , topTen ,play , op1 ,op2,op3 ,op4;
	
	 public void MyWindow() {
		 
		 
		    JOptionPane.showMessageDialog(null, "Welcome to the game");
		    this.setLayout(null);
		    this.setSize(700,700);
		    this.setTitle("Personal Window");
		    this.setLocationRelativeTo(null);
		    this.setResizable(false);
	
			
			JButton rud = new JButton("RUD");
			rud.setBounds(450, 05, 100, 50);
			
			JButton exit = new JButton("Exit game");
			exit.setBounds(350, 80, 100, 50);
			JButton topTen = new JButton("Top ten");
			topTen.setBounds(450, 80, 100, 50);
			
			JButton play = new JButton("Play now!!");
			play.setBounds(450, 160, 100, 50);
		    play.setVisible(false);
		    
		    JButton op1= new JButton("1");
		    op1.setBounds(250, 300, 80, 30);
		
		  
		    
		    
		    JButton op2= new JButton("2");
		    op2.setBounds(250, 500, 80, 30);
		    op2.setVisible(true);
		  
		    
		    JButton op3= new JButton("3");
		    op3.setBounds(580, 300, 80, 30);
		
		  
		    
		    
		    JButton op4= new JButton("4");
		    op4.setBounds(580, 500, 80, 30);
			
			
			JLabel ActualPlayer = new JLabel("Actual player real name:"+" "+Register.Names[Login.LocalID]);
			ActualPlayer.setBounds(100, 150, 500, 40);
			
			
			JLabel Actualusername = new JLabel("Actual  username:"+" "+Register.usernames[Login.LocalID]);
			Actualusername.setBounds(100, 50, 400, 40);
			
			JLabel mods = new JLabel("");
			mods.setIcon(new ImageIcon("C:\\Users\\grett\\Desktop\\MODS\\Mods.PNG"));
			mods.setBounds(10, 100, 720, 720);
		
			 getContentPane().add(Actualusername); 
			 getContentPane().add(topTen); 
			 getContentPane().add(rud); 
			 getContentPane().add(ActualPlayer); 
			 getContentPane().add(play); 
			 getContentPane().add(mods); 
			 getContentPane().add(op1);
			 getContentPane().add(op2);
			 getContentPane().add(op3);
			 getContentPane().add(op4);
			 getContentPane().add(exit);
			 this.setVisible(true);
			 
			 
			 rud.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 
		        	
		        	 RUD x = new RUD();
		        	 dispose();
		        	 
		        	 
		         }
		     });
			 
			 op1.addActionListener(new java.awt.event.ActionListener() {
				
		         public void actionPerformed(java.awt.event.ActionEvent e ) {
                   
		        	option=1;
		        	JOptionPane.showMessageDialog(null, "The sorting method selected is"+" "+option);
		        	play.setVisible(true);
		        	
		         }
		     });
			 
			 
			 op2.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 option=2;
		        	 JOptionPane.showMessageDialog(null, "The sorting method selected is"+" "+option);
		        	 play.setVisible(true);
		        	
		         }
		     });
			 
			 op3.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 option=3;
		        	 JOptionPane.showMessageDialog(null, "The sorting method selected is"+" "+option);
		        	 play.setVisible(true);
		        		
		        		
		         }
		     });
			 
			 op4.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 option=4;
		        	 JOptionPane.showMessageDialog(null, "The sorting method selected is"+" "+option);
		            play.setVisible(true);
		        	
		            
		       
		        
		         }
		     });

			 play.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 GamePuzzle x = new GamePuzzle();
		        	
		            dispose();
		       
		        
		         }
		     });
			 
			 
			 topTen.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		               
		        	 
		             Ranking x = new Ranking();
		             
		       
		         }
		     });
			 
			 
			 exit.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 
		        	
		        	 Register h = new Register();
		        	 dispose();
		        	 
		        	 
		         }
		     });
			 
	           
	}
	 
	

	 
}
