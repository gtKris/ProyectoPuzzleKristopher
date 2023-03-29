package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;



public class Register extends JFrame {
	
	static String[] 	Names = new String[100];
	static String[] 	usernames = new String[100];                  //Arrays for storing information
	static String[]	    Userpasswords = new String[100];
	
	static int 	cont;
	static int 	namescont;
	static int 	Ussnamescont;
	static int	 passscont;

	
	
	
	private  JTextField Fieldname;
	private  JPasswordField Fieldpassword;
	private JTextField Fieldusername;
	
	
	


	public Register () {
		
		RegisterWindow();
		 
	}
	
	
	 public void RegisterWindow() {
		 
		    	this.setLayout(null);
		    	this.setSize(700,700);
		    	this.setTitle("Register Window");
		    	this.setLocationRelativeTo(null);
		    	this.setResizable(false);
		
			
			JButton btnmain = new JButton("Return to login window");
			btnmain.setBounds(200, 550, 200, 100);
			
			JButton btnsave = new JButton(" Save data");
			btnsave.setBounds(200, 400, 200, 100);
			
			JLabel btnRealname = new JLabel("Name");
			btnRealname.setBounds(200, 50, 500, 40);
			
			JTextField Fieldname = new JTextField();
			Fieldname.setBounds(200, 100, 200, 40);
			
			
			JLabel username1 = new JLabel("UserName");
			username1.setBounds(200, 150, 500, 40);
			
			JTextField Fieldusername = new JTextField();
			Fieldusername.setBounds(200,200, 200, 40);
			
			JLabel pass = new JLabel("Password");
			pass.setBounds(200, 250, 500, 40);
			JPasswordField Fieldpassword = new JPasswordField();
			Fieldpassword.setBounds(200, 300, 200, 40);
	    
			 getContentPane().add(Fieldpassword); 
			 getContentPane().add(pass); 
			 
			 getContentPane().add(Fieldusername); 
			 getContentPane().add(username1); 
			 
			 getContentPane().add(btnsave); 
			 getContentPane().add(Fieldname); 
			 getContentPane().add(btnRealname); 
			 getContentPane().add(btnmain); 
			 this.setVisible(true);
			 this.setResizable(false);
			 
			 
			 btnsave.addActionListener(new java.awt.event.ActionListener() {
		         @SuppressWarnings("deprecation")
				public void actionPerformed(java.awt.event.ActionEvent e ) {
		        	 
		
					  
					  if(Fieldname.getText().length()==0||Fieldusername.getText().length()==0||Fieldpassword.getText().length()==0){
						     JOptionPane.showMessageDialog(null,"Please insert all dates ");
						}
						else{
						 	 
			                     Names[namescont]=Fieldname.getText();
				        		 namescont++;
				        
				        		
					        		 
					        		 usernames[Ussnamescont]=Fieldusername.getText();
					        		 Ussnamescont++;
					       
				        		 
				        		  
							        	  Userpasswords[passscont]=Fieldpassword.getText();
							        	  passscont++;
							        
							        	  
							        	  
							        	  cont++;
							        	  
							        	  
								           JOptionPane.showMessageDialog(null,"Your ID is"+"-->"+" "+(cont-1)  +"\n"+" your name is"+"-->"+" "+Fieldname.getText()+"\n"+"your username is "+Fieldusername.getText()+"\n"+"your password is "+ Fieldpassword.getText());
								          
								      	 
										  
										  JOptionPane.showMessageDialog(null, "\r\n"
										  		+ "your account has been created successfully!!!!!");
										  
										  Fieldname.setText("");
										  Fieldusername.setText("");
										  Fieldpassword.setText("");
										
									
							}
				        	 
				        	
				        
					      
					          
					         
						
					
			           
		         }
		     });
			 
			 
			 btnmain.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		           Login x = new Login();
		           dispose();
		           
		         }
		     });
	
			 
			 
			 
			 Fieldname.addKeyListener((KeyListener) new KeyAdapter()
			 {
			    public void keyTyped(KeyEvent e)
			    {
			    	int key=e.getKeyChar();
			    	
			    	    boolean mayusculas = key >= 65 && key <= 90;
			    	    boolean minusculas = key >= 97 && key <= 122;              //This method validate letters in this JTextField
			    	    boolean espacio = key == 32;
			    
			    	    
			            
			    	     if (!(minusculas || mayusculas || espacio))
			    	    {
			    	    	 JOptionPane.showMessageDialog(null,"Only letters are accepted!!!!");
			    	        e.consume();
			    	    }
                      
			    	     
			 
			      
			    }
			 });
              
			 
			
	}
     
	

    
     

}
