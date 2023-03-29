package views;

import javax.swing.*;

public class RUD extends JFrame {

	public RUD() {
		 myRUD();
		
		
	}
	
	

	public void myRUD() {
		   JOptionPane.showMessageDialog(null, "RUD Window");
		    this.setLayout(null);
		    this.setSize(700,700);
		    this.setTitle("My RUD");
		 
		    ButtonGroup dispose = new  ButtonGroup();
			
			JButton view = new JButton("View My Dates");
			view.setBounds(200, 10, 200, 100);
			
			JButton update = new JButton("Update my dates");
			update.setBounds(200, 200, 200, 100);
			
			JButton delete = new JButton("Delete my account");
			delete.setBounds(200, 390, 200, 100);
			
			JButton mywindow = new JButton("return to personal window");
			mywindow.setBounds(200, 500, 200, 100);

			
			JLabel ActualPlayer = new JLabel("Actual player real name:"+" "+Register.Names[Login.LocalID]);
			ActualPlayer.setBounds(100, 100, 500, 40);
			
			
			JLabel Actualusername = new JLabel("Actual  username:"+" "+Register.usernames[Login.LocalID]);
			Actualusername.setBounds(100, 50, 400, 40);
			
	
			 getContentPane().add(view); 
			 getContentPane().add(update);  
			 getContentPane().add(delete); 
			 getContentPane().add(mywindow); 
			 
			 this.setVisible(true);
			 
			 
		
			 view.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {

		        	JOptionPane.showMessageDialog(null, "Your name is : "+" "+Register.Names[Login.LocalID]+" \n"+"Your username is : "+" "+Register.usernames[Login.LocalID]+"\n "+" Your password is : "+" "+Register.Userpasswords[Login.LocalID]);
		        	 
		        	 
		         }
		     });
			 
			 update.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	
		        	 Register.Names[Login.LocalID]= JOptionPane.showInputDialog("Please insert a new name or press OK \r\n"
		        	 		+ "to keep the same name", Register.Names[Login.LocalID]);
		        	 
		        	 Register.usernames[Login.LocalID]= JOptionPane.showInputDialog("Please insert a new Username or press OK \r\n"
			        	 		+ "to keep the same Username", Register.usernames[Login.LocalID]);
		        	 
		        	 Register.Userpasswords[Login.LocalID]= JOptionPane.showInputDialog("Please insert a new password or press OK \r\n"
			        	 		+ "to keep the same password", Register.Userpasswords[Login.LocalID]);
		        	 
		         }
		     });
			 
			 mywindow.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {

		       PersonalWindow x = new PersonalWindow();
		       dispose();
		        	 
		        	 
		         }
		     });
			 
			 delete.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	
		        	 Register.Names[Login.LocalID]= null;
		        	 
		        	 Register.usernames[Login.LocalID]= null;
		        	 
		        	 Register.Userpasswords[Login.LocalID]= null;
		        	 
		        	 JOptionPane.showMessageDialog(null, " You account has been successfully deleted");
		        	 JOptionPane.showMessageDialog(null, " You cannot continue, because you do not have an account, please register");
		        	 
		        	 Register x = new Register();
		        	 
		        	 dispose();
			        	 		
		        	 
		         }
		     });
			 
		
		
	}

}
