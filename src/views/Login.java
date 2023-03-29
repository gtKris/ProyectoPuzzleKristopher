package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;




public class Login extends JFrame {
	static int LocalID;

	public Login () {
		
		LoginWindow();
		
	}
	
	
	 public void LoginWindow() {
		    this.setLayout(null);
		    this.setSize(700,700);
		    this.setTitle("Register Window");
		    this.setLocationRelativeTo(null);
		    
			
			JButton RegButtom = new JButton("Dont have account? , register now!!");
			RegButtom.setBounds(200, 550, 250, 100);
		    
		    
			JButton Log = new JButton("Get into your account");
			Log.setBounds(200, 400, 200, 100);
			
			JLabel ID = new JLabel("ID");
			ID.setBounds(200, 50, 500, 40);
			
			JTextField LoginID = new JTextField(2);
			LoginID.setBounds(200, 100, 200, 40);
			
			
			
			JLabel username1 = new JLabel("UserName");
			username1.setBounds(200, 150, 500, 40);
			JTextField Loginusername = new JTextField();
			Loginusername.setBounds(200,200, 200, 40);
			
			JLabel pass = new JLabel("Password");
			pass.setBounds(200, 250, 500, 40);
			JPasswordField Loginpassword = new JPasswordField();
			Loginpassword.setBounds(200, 300, 200, 40);
	    
			 getContentPane().add(Loginpassword); 
			 getContentPane().add(pass); 
			 
			 getContentPane().add(Loginusername); 
			 getContentPane().add(username1); 
			 
			 getContentPane().add(Log); 
			 getContentPane().add(LoginID); 
			 getContentPane().add(ID); 
			 getContentPane().add(RegButtom);
			 this.setVisible(true);
			 
			 
			 
			 LoginID.addKeyListener((KeyListener) new KeyAdapter()
			 {
			    public void keyTyped(KeyEvent e)
			    {
			       char caracter = e.getKeyChar();

			 
			       if(((caracter < '0') ||
			          (caracter > '9')) &&
			          (caracter != '\b' ))
			       {
			          e.consume();
			       }
			    }
			 });
			 
			 
			 RegButtom.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	   
		        	 Register x = new Register();
		        	 dispose();
		        	
		           
		         }
		     });
			 
			 
			 Log.addActionListener(new java.awt.event.ActionListener() {
		         @SuppressWarnings("deprecation")
				public void actionPerformed(java.awt.event.ActionEvent e ) {
		        	 
		        	 
		       
		        	  
					  
					  if(LoginID.getText().length()==0||Loginusername.getText().length()==0||Loginpassword.getText().length()==0){
						     JOptionPane.showMessageDialog(null,"Please insert all dates ");
						     
						    
						} 
					  
					  
					  LocalID=Integer.parseInt(LoginID.getText());
				
							
						    if (Loginpassword.getText().equals(Register.Userpasswords[LocalID])&&Loginusername.getText().equals(Register.usernames[LocalID])) {
						    	PersonalWindow x = new PersonalWindow();
								
						    
								
								dispose();
								
							
						}
						    
						    
						    else {
						    	JOptionPane.showMessageDialog(null, "Wrong dates ,empty spaces, or you dont have an account!!!");
						    }
					
				
							
						}
							
							
							
						 
						
						
					
			           
		         
		     });

	}


}
