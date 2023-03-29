package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class MainWindow extends JFrame {

	public MainWindow () {
		
		PrincipalWindow();
		 
	}
	
	
	 public void PrincipalWindow() {
	
		JButton login = new JButton("Login");
		login.setBounds(100, 500, 200, 100);
	
	    JButton register= new JButton("Register now");
	    register.setBounds(400, 500, 200, 100);
		this.setSize(700, 700);
		this.setLayout(null);
		this.setTitle("puzzle game by Kristopher principal window");
		this.setLocationRelativeTo(null);
		 getContentPane().add(register);
		 getContentPane().add(login);
	    
		 register.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				  Register x = new Register();
				   dispose();
			}
			});
		 
		 login.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				   Login x = new Login();
				   dispose();
			}
			});

	}


}
