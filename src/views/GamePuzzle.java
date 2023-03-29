package views;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.*;



@SuppressWarnings("deprecation")
public class GamePuzzle extends JFrame   implements ActionListener  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static ArrayList<usersDates>lista = new ArrayList<usersDates>();
	
		static int 	cont;
	    static int Firsthour ; 
	    static int Firstminute;
	    static int Firstsegundos;
	    static int initialTemp;
	    static int Finalhour;
	    static int Finalminute;
	    static int Finalsegundos;
	    static int finalMinutes;
	    static int points;
	 
          
	    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16 ,contador, fin ;	
	

	public GamePuzzle() {
		
		InitialHour();
		
		 		int[] randomComplete = IntStream.rangeClosed(1, 15).toArray();
		 		Random r = new Random();
		 		for (int i = randomComplete.length; i > 0; i--) {
		 		int pos = r.nextInt(i);                                                    //This array randomized the numbers              
		 		int tmp = randomComplete[i-1];
		 		randomComplete[i - 1] = randomComplete[pos];
		 		randomComplete[pos] = tmp;
		 		}
		
		 
		 		
  
		 		JLabel name = new JLabel();
		 		name.setBounds(450, 10,100, 200);
		 		name.setText("Actual player:"+" "+Register.usernames[Login.LocalID]);
		 		
	   
		 		JLabel attemps = new JLabel("Attemps");
		 		attemps.setBounds(520, 180,100, 100);
		 		attemps.setText("Attemps");
	  
	    
		 		contador= new JButton(String.valueOf(cont));
		 		contador.setBounds(400, 250, 300, 100);
	    
	   
		 
		 		b1=new JButton(String.valueOf(randomComplete[0]));  
		 		b1.setBounds(0,50,100,100);  
		 		b1.setBackground(Color.WHITE);
		 		b1.setFont(new Font("cooper black",0,40));
		 		
		 		
		 		b2=new JButton(String.valueOf(randomComplete[1]));  
		 		b2.setBounds(100,50,100,100);  
		 		b2.setBackground(Color.WHITE);
		 		b2.setFont(new Font("cooper black",0,40));
		 		b3=new JButton(String.valueOf(randomComplete[2]));  
		 		b3.setBounds(200,50,100,100); 
		 		b3.setBackground(Color.WHITE);
		 		b3.setFont(new Font("cooper black",0,40));
		 		
		 		b4=new JButton(String.valueOf(randomComplete[3]));  
		 		b4.setBounds(300,50,100,100);  
		 		b4.setBackground(Color.WHITE);
		 		b4.setFont(new Font("cooper black",0,40));
	    
	    
		 		b5=new JButton(String.valueOf(randomComplete[4]));  
		 		b5.setBounds(0,150,100,100);  
		 		b5.setBackground(Color.WHITE);
		 		b5.setFont(new Font("cooper black",0,40));
		 		
		 		b6=new JButton(String.valueOf(randomComplete[5]));  
		 		b6.setBounds(100,150,100,100);  
		 		b6.setBackground(Color.WHITE);
		 		b6.setFont(new Font("cooper black",0,40));
		 		
		 		b7=new JButton(String.valueOf(randomComplete[6]));  
		 		b7.setBounds(200,150,100,100);  
		 		b7.setBackground(Color.WHITE);
		 		b7.setFont(new Font("cooper black",0,40));
		 		
		 		b8=new JButton(String.valueOf(randomComplete[7]));  
		 		b8.setBounds(300,150,100,100); 
		 		b8.setBackground(Color.WHITE);
		 		b8.setFont(new Font("cooper black",0,40));
	    
		 		b9=new JButton(String.valueOf(randomComplete[8]));  
		 		b9.setBounds(0,250,100,100);  
		 		b9.setBackground(Color.WHITE);
		 		b9.setFont(new Font("cooper black",0,40));
		 		
		 		b10=new JButton(String.valueOf(randomComplete[9]));  
		 		b10.setBounds(100,250,100,100);     
		 		b10.setBackground(Color.WHITE);
		 		b10.setFont(new Font("cooper black",0,40));
		 		
		 		b11=new JButton(String.valueOf(randomComplete[10]));  
		 		b11.setBounds(200,250,100,100);
		 		b11.setBackground(Color.WHITE);
		 		b11.setFont(new Font("cooper black",0,40));
		 		
		 		b12=new JButton(String.valueOf(randomComplete[11]));  
		 		b12.setBounds(300,250,100,100);
		 		b12.setBackground(Color.WHITE);
		 		b12.setFont(new Font("cooper black",0,40));
		 		
		 		b13=new JButton(String.valueOf(randomComplete[12]));  
		 		b13.setBounds(0,350,100,100);
		 		b13.setBackground(Color.WHITE);
		 		b13.setFont(new Font("cooper black",0,40));
		 		
		 		b14=new JButton(String.valueOf(randomComplete[13]));  
		 		b14.setBounds(100,350,100,100);
		 		b14.setBackground(Color.WHITE);
		 		b14.setFont(new Font("cooper black",0,40));
		 		
		 		b15=new JButton(String.valueOf(randomComplete[14]));  
		 		b15.setBounds(200,350,100,100);
		 		b15.setBackground(Color.WHITE);
		 		
		 		b15.setFont(new Font("cooper black",0,40));
		 		b16=new JButton("");
		 		b16.setBounds(300, 350, 100, 100);
		 		b16.setBackground(Color.WHITE);
		 		b16.setFont(new Font("cooper black",0,40));
	    
	    
		 		fin=new JButton("I give up :(");
		 		fin.setBounds(400, 350, 300, 100);
	    
	 
	    

		 		b1.addActionListener(this);  
		 		b2.addActionListener(this);  
		 		b3.addActionListener(this);  
		 		b4.addActionListener(this);  
		 		b5.addActionListener(this);                               //Add actionListener for all buttons
		 		b6.addActionListener(this);  
		 		b7.addActionListener(this);  
		 		b8.addActionListener(this);  
		 		b9.addActionListener(this);  
		 		b10.addActionListener(this);
		 		b11.addActionListener(this);
		 		b12.addActionListener(this);
		 		b13.addActionListener(this);
		 		b14.addActionListener(this);
		 		b15.addActionListener(this);
		 		b16.addActionListener(this);
		 		fin.addActionListener(this);
		 		contador.addActionListener(this);
	      
		add(contador);add(fin) ; add(b16);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);add(b15); 
		
	    setSize(700,480);  
	    	setLayout(null);  
	    		setVisible(true); 
	    			this.setResizable(false);
	    				add(name);
	    					add(attemps);
	    					
	}
	    				

		
	    					public void actionPerformed(ActionEvent e){
          //Received the button`clicks
		
	    
		
		if(e.getSource()==fin && PersonalWindow.option==1 ) {
			 FinalHour();
			 CalculatePoints();
			usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes+":00"),"5","Se rindio");
			lista.add(data);
			b1.setLabel("1");b2.setLabel("2");b3.setLabel("3");b4.setLabel("4");b5.setLabel("5");b6.setLabel("6");b7.setLabel("7");b8.setLabel("8");
			b9.setLabel("9");b10.setLabel("10");b11.setLabel("11");b12.setLabel("12");b13.setLabel("13");b14.setLabel("14");b15.setLabel("15");b16.setLabel("");
			JOptionPane.showMessageDialog(this,"Solution");
			PersonalWindow c = new PersonalWindow();
			dispose();
			 
			cont=0;
			
			//this if receives as a parameter the button "I give up" and shows the solution of the previously chosen sorting method
		}
		
		
		
		if(e.getSource()==fin && PersonalWindow.option==2 ) {
			 FinalHour();
			usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),"5","Se rindio");
			lista.add(data);
			b1.setLabel("");b2.setLabel("15");b3.setLabel("14");b4.setLabel("13");b5.setLabel("12");b6.setLabel("11");b7.setLabel("10");b8.setLabel("9");
			b9.setLabel("8");b10.setLabel("7");b11.setLabel("6");b12.setLabel("5");b13.setLabel("4");b14.setLabel("3");b15.setLabel("2");b16.setLabel("1");
			JOptionPane.showMessageDialog(this,"Solution");
			PersonalWindow c = new PersonalWindow();
			dispose();
			 
			cont=0;
			
             //this if receives as a parameter the button "I give up" and shows the solution of the previously chosen sorting method
		}
		
		
		
		if(e.getSource()==fin && PersonalWindow.option==3 ) {
			 FinalHour();
			usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),"5","Se rindio");
			lista.add(data);
			b1.setLabel("1");b2.setLabel("5");b3.setLabel("9");b4.setLabel("13");b5.setLabel("2");b6.setLabel("6");b7.setLabel("10");b8.setLabel("14");
			b9.setLabel("3");b10.setLabel("7");b11.setLabel("11");b12.setLabel("15");b13.setLabel("4");b14.setLabel("8");b15.setLabel("12");b16.setLabel("");
			JOptionPane.showMessageDialog(this, "Solution");
			PersonalWindow c = new PersonalWindow();
			dispose();
			
			cont=0;
			
	       //this if receives as a parameter the button "I give up" and shows the solution of the previously chosen sorting method
			
		}
		
		
		
		if(e.getSource()==fin && PersonalWindow.option==4 ) {
			 FinalHour();
			usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),"5","Se rindio");
			lista.add(data);
			b1.setLabel("");b2.setLabel("12");b3.setLabel("8");b4.setLabel("4");b5.setLabel("15");b6.setLabel("11");b7.setLabel("7");b8.setLabel("3");
			b9.setLabel("14");b10.setLabel("10");b11.setLabel("6");b12.setLabel("2");b13.setLabel("13");b14.setLabel("9");b15.setLabel("5");b16.setLabel("1");
			        
			JOptionPane.showMessageDialog(this, "Solution");
			PersonalWindow c = new PersonalWindow();
			dispose();
			cont=0;
			
			
			//this if receives as a parameter the button "I give up" and shows the solution of the previously chosen sorting method
		}
		
		
		
		if(e.getSource()==b1){  
	        String label=b1.getLabel();  
	        if(b2.getLabel().equals("")){  
	            b2.setLabel(label);  
	          b1.setLabel("");                  //1
	          cont++; 
	        contador.setLabel(String.valueOf(cont));
	        
	        }  
	        
	        
	        if(b5.getLabel().equals("")){  
	            b5.setLabel(label);  
	            b1.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	    }
		
		
		
		if(e.getSource()==b2){  
	        String label=b2.getLabel();  
	        if(b1.getLabel().equals("")){  
	            b1.setLabel(label);  
	            b2.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        if(b3.getLabel().equals("")){    //2
	            b3.setLabel(label);  
	            b2.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        if(b6.getLabel().equals("")){  
	            b6.setLabel(label);  
	            b2.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	    }
		
		
		
		
		
		
	    if(e.getSource()==b3){  
	        String label=b3.getLabel();  
	        if(b2.getLabel().equals("")){  
	            b2.setLabel(label);  
	            b3.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b4.getLabel().equals("")){    //3 
	            b4.setLabel(label);  
	            b3.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b7.getLabel().equals("")){  
	            b7.setLabel(label);  
	            b3.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	    }  
	    
	    
	    
	    
	    
	    
	    if(e.getSource()==b4){  
	        String label=b4.getLabel();  
	        if(b3.getLabel().equals("")){  
	            b3.setLabel(label);  
	            b4.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }                                    //4
	        if(b8.getLabel().equals("")){  
	            b8.setLabel(label);  
	            b4.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	    }
	    
	    
	    
	    
	    
	    
	    if(e.getSource()==b5){  
	        String label=b5.getLabel();  
	        if(b1.getLabel().equals("")){  
	            b1.setLabel(label);  
	            b5.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b6.getLabel().equals("")){     //5
	            b6.setLabel(label);  
	            b5.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b9.getLabel().equals("")){  
	            b9.setLabel(label);  
	            b5.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	    }
	    
	    
	    
	    
	    if(e.getSource()==b6){  
	        String label=b6.getLabel();  
	        if(b2.getLabel().equals("")){  
	            b2.setLabel(label);  
	            b6.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b5.getLabel().equals("")){     //6
	            b5.setLabel(label);  
	            b6.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b7.getLabel().equals("")){  
	            b7.setLabel(label);  
	            b6.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b10.getLabel().equals("")){  
	            b10.setLabel(label);  
	            b6.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        
	        
	        
	    }  
	    
	    
	    
	    if(e.getSource()==b7){  
	        String label=b7.getLabel();  
	        if(b6.getLabel().equals("")){  
	            b6.setLabel(label);  
	            b7.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b3.getLabel().equals("")){  
	            b3.setLabel(label);                  //7
	            b7.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b8.getLabel().equals("")){  
	            b8.setLabel(label);  
	            b7.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	        
	        if(b11.getLabel().equals("")){  
	            b11.setLabel(label);  
	            b7.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	    }
	    
	    
	    
	    
	    
	    if(e.getSource()==b8){  
	        String label=b8.getLabel();  
	        if(b4.getLabel().equals("")){  
	            b4.setLabel(label);  
	            b8.setLabel("");              //8
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b7.getLabel().equals("")){  
	            b7.setLabel(label);  
	            b8.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        
	        if(b12.getLabel().equals("")){  
	            b12.setLabel(label);  
	            b8.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	    }  
	    
	    
	    
	    
	    
	    
	    
	    if(e.getSource()==b9){  
	        String label=b9.getLabel();  
	        if(b5.getLabel().equals("")){  
	            b5.setLabel(label);  
	            b9.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b10.getLabel().equals("")){     //9
	            b10.setLabel(label);  
	            b9.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b13.getLabel().equals("")){  
	            b13.setLabel(label);  
	            b9.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	    }  
	    
	    
	    
	    
	    
	    
	    if(e.getSource()==b10){  
	        String label=b10.getLabel();  
	        if(b6.getLabel().equals("")){  
	            b6.setLabel(label);  
	            b10.setLabel("");                   //10
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b9.getLabel().equals("")){  
	            b9.setLabel(label);  
	            b10.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        if(b11.getLabel().equals("")){  
	            b11.setLabel(label);  
	            b10.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	        

	        if(b14.getLabel().equals("")){  
	            b14.setLabel(label);  
	            b10.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	    }  
	    
	    
	    
	    
	    
	    
	    
	    if(e.getSource()==b11){  
	        String label=b11.getLabel();  
	        if(b7.getLabel().equals("")){  
	            b7.setLabel(label);  
	            b11.setLabel("");                 //11
	            
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b10.getLabel().equals("")){  
	            b10.setLabel(label);  
	            b11.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        
	        if(b15.getLabel().equals("")){  
	            b15.setLabel(label);  
	            b11.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	        
	        if(b12.getLabel().equals("")){  
	            b12.setLabel(label);  
	            b11.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	    }
	    
	    
	    
	    if(e.getSource()==b12){  
	        String label=b12.getLabel();  
	        if(b8.getLabel().equals("")){  
	            b8.setLabel(label);  
	            b12.setLabel("");                 //12
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b11.getLabel().equals("")){  
	            b11.setLabel(label);  
	            b12.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        
	        if(b16.getLabel().equals("")){  
	            b16.setLabel(label);  
	            b12.setLabel("");  
	            
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }
	        
	       
	    }
	    
	    
	    
	    
	    
	    if(e.getSource()==b13){  
	        String label=b13.getLabel();  
	        if(b9.getLabel().equals("")){  
	            b9.setLabel(label);  
	            b13.setLabel("");                 //13
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b14.getLabel().equals("")){  
	            b14.setLabel(label);  
	            b13.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        
	        
	    }
	  
	    
	      
	    
	    
	    if(e.getSource()==b14){  
	        String label=b14.getLabel();  
	        if(b13.getLabel().equals("")){  
	            b13.setLabel(label);  
	            b14.setLabel("");                 //14
	            
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b10.getLabel().equals("")){  
	            b10.setLabel(label);  
	            b14.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        if(b15.getLabel().equals("")){  
	            b15.setLabel(label);  
	            b14.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        } 
	        
	        
	       
	    }
	    
	    
	    if(e.getSource()==b15){  
	        String label=b15.getLabel();  
	        if(b14.getLabel().equals("")){  
	            b14.setLabel(label);  
	            b15.setLabel("");                 //15
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b11.getLabel().equals("")){  
	            b11.setLabel(label);  
	            b15.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        if(b16.getLabel().equals("")){  
	            b16.setLabel(label);  
	            b15.setLabel("");
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        } 
	        
	       
	    }
	    
	    if(e.getSource()==b16){  
	        String label=b16.getLabel();  
	        if(b15.getLabel().equals("")){  
	            b15.setLabel(label);  
	            b16.setLabel("");                 //16
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        if(b12.getLabel().equals("")){  
	            b12.setLabel(label);  
	            b16.setLabel("");  
	            cont++;
	            contador.setLabel(String.valueOf(cont));
	        }  
	        
	        
	       
	    }
	    
	   
	    
	    
	    
	   

	    
	    if (PersonalWindow.option==1&&e.getSource()!=fin) {
	    	       
	    	
	    	 if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
	 	            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
	 	            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
	 	            .equals("8")&&b16.getLabel().equals("")&&b10.getLabel().equals("10")&&b11.getLabel().equals("11")&&b12.getLabel().equals("12")&&b13.getLabel().equals("13")&&b14.getLabel().equals("14")&&b15.getLabel().equals("15")){     
	 	            JOptionPane.showMessageDialog(this,"Congratulations! You won.");   
	 	             FinalHour();
	 				 CalculatePoints();
	 	           usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),String.valueOf(points),"Partida limpia");
	 	           lista.add(data);
	 				
	 	           PersonalWindow c = new PersonalWindow();
	 				dispose();
	 				
	 				cont=0;
	 	    }
			
		}
	    
	    
	    
	    if (PersonalWindow.option==2&&e.getSource()!=fin) {
	    	
	    	 if(b1.getLabel().equals("")&&b2.getLabel().equals("15")&&b3.getLabel()    
	 	            .equals("14")&&b4.getLabel().equals("13")&&b5.getLabel().equals("12")    
	 	            &&b6.getLabel().equals("11")&&b7.getLabel().equals("10")&&b8.getLabel()    
	 	            .equals("9")&&b16.getLabel().equals("1")&&b10.getLabel().equals("7")&&b11.getLabel().equals("6")&&b12.getLabel().equals("5")&&b13.getLabel().equals("4")&&b14.getLabel().equals("3")&&b15.getLabel().equals("2")&&b9.getLabel().equals("8")){     
	 	            JOptionPane.showMessageDialog(this,"Congratulations! You won.");
	 	             FinalHour();
	 				 CalculatePoints();
	 	           usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),String.valueOf(points),"Partida limpia");
	 				lista.add(data);
	 				
	 	           PersonalWindow c = new PersonalWindow();
	 				dispose();
	 				cont=0;
	 	    }
			
		}
	    
	    
	    if (PersonalWindow.option==3&&e.getSource()!=fin) {
	    	
	    	
	    	 if(b1.getLabel().equals("1")&&b2.getLabel().equals("5")&&b3.getLabel()    
	 	            .equals("9")&&b4.getLabel().equals("13")&&b5.getLabel().equals("2")    
	 	            &&b6.getLabel().equals("6")&&b7.getLabel().equals("10")&&b8.getLabel()    
	 	            .equals("14")&&b10.getLabel().equals("7")&&b11.getLabel().equals("11")&&b12.getLabel().equals("15")&&b13.getLabel().equals("4")&&b14.getLabel().equals("8")&&b15.getLabel().equals("12")&&b16.getLabel().equals("")&&b9.getLabel().equals("3")){     
	 	            JOptionPane.showMessageDialog(this,"Congratulations! You won.");  
	 	             FinalHour();
	 				 CalculatePoints();
	 	           usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),String.valueOf(points),"Partida limpia");
	 				lista.add(data);
	 	           PersonalWindow c = new PersonalWindow();
	 				dispose();
	 				cont=0;
	 	    }
			
		}
	    
	    
	    if (PersonalWindow.option==4&&e.getSource()!=fin) {
	    	
	    	
	    	 if(b1.getLabel().equals("")&&b2.getLabel().equals("12")&&b3.getLabel()    
	 	            .equals("8")&&b4.getLabel().equals("4")&&b5.getLabel().equals("15")    
	 	            &&b6.getLabel().equals("11")&&b7.getLabel().equals("7")&&b8.getLabel()    
	 	            .equals("3")&&b16.getLabel().equals("1")&&b10.getLabel().equals("10")&&b11.getLabel().equals("6")&&b12.getLabel().equals("2")&&b13.getLabel().equals("13")&&b14.getLabel().equals("9")&&b15.getLabel().equals("5")&&b9.getLabel().equals("14")){     
	 	            JOptionPane.showMessageDialog(this,"Congratulations! You won.");   
	 	           FinalHour();
	 			   CalculatePoints();
	 	           PersonalWindow  c = new PersonalWindow();
	 	          usersDates data = new usersDates(Register.Names[Login.LocalID], Register.usernames[Login.LocalID],String.valueOf(GamePuzzle.cont),String.valueOf(finalMinutes),String.valueOf(points),"Partida limpia");
	 				lista.add(data);
	 				dispose();
	 				cont=0;
	 	    }
	    	 
	    	 
	    	
	    }	
		}
	
	   

	
	private int InitialHour() {
		
 		  Calendar calendario = new GregorianCalendar();
        
	       Firsthour =calendario.get(Calendar.HOUR_OF_DAY);
	       Firstminute = calendario.get(Calendar.MINUTE);
	       Firstsegundos = calendario.get(Calendar.SECOND);
	       
	       System.out.println(Firsthour + ":" + Firstminute + ":" + Firstsegundos);
		 
		     
	        initialTemp= Firstminute;
	       
	       return initialTemp ;
	 	
	  }
 
	
	private int FinalHour() {
		
		
	    	
           Calendar calendario = new GregorianCalendar();
        
	       Finalhour =calendario.get(Calendar.HOUR_OF_DAY);
	       Finalminute = calendario.get(Calendar.MINUTE);
	       Finalsegundos = calendario.get(Calendar.SECOND);
	       System.out.println(Finalhour + ":" + Finalminute + ":" + Finalsegundos);
	        
	        
	 
	        finalMinutes= Finalminute-initialTemp;
	        
	        System.out.println(finalMinutes);
	       
	        
	        return finalMinutes;
	}
	
	
	public int CalculatePoints() {
		 
		System.out.println(cont);
	
		System.out.println(finalMinutes);
		
		          if (finalMinutes<=3) {
		        	  
		        	  System.out.println("Menor a 3 minutos");
                  
		        	  points=10;      	  
				   }
		          
		          if (finalMinutes<=4&&finalMinutes>3&&finalMinutes<5) {
		        	  System.out.println("Menor a 4 minutos");
		        	  points=9;      	  
				   }
		              
		          
		           if (finalMinutes<=5&&finalMinutes>4&&finalMinutes<6) {
		        	   System.out.println("Menor a 5 minutos");
	                  
		        	  points=8;      	  
				   }
		          
		           if (finalMinutes<=6&&finalMinutes>5&&finalMinutes<7) {
		        	   System.out.println("Menor a 6 minutos");
	                  
		        	  points=7;      	  
				   }
		          
                    
		            if (finalMinutes<=7&&finalMinutes>6&&finalMinutes<7) {
	                  
		            	  System.out.println("Menor a 7 minutos");
		        	  points=6;      	  
				   }
		           
		           if (finalMinutes<=8&&finalMinutes>7&&finalMinutes<9) {
		        	   System.out.println("Menor a 8 minutos");
			        	  points=5;      	  
					   }
		           
		           if (finalMinutes<=9&&finalMinutes>10&&finalMinutes<8&&finalMinutes<10) {
		        	   System.out.println("Menor a 9 minutos");
		                  
			        	  points=4;      	  
					   }
			    
		            if (finalMinutes<=10&&finalMinutes>9&&finalMinutes<11) {
		            	  System.out.println("Menor a 10 minutos");
		                  
			        	  points=3;      	  
					   }
		           
		            if (finalMinutes<=11&&finalMinutes>10&&finalMinutes<12) {
		            	  System.out.println("Menor a 11 minutos");
		                  
			        	  points=2;      	  
					   }
		           
		           if (finalMinutes>=12) {
		                  
		        	   System.out.println("Menor a 12 minutos");
			        	  points=1;      	  
					   }
		           
		           
		           
		           
		           
		           
		           
		           if (cont<=50) {
		        	   points= points+10;
		        	   System.out.println("Menor a 50 movimientos");
					
				}
		           
		           
		           if (cont<=60&&cont>=51) {
		        	   points= points+9;
		        	   
		        	   System.out.println("Menor a 60 movimientos");
					
				}
		           
		           
		           if (cont<=70&&cont>=61) {
		        	   points= points+8;
		        	   System.out.println("Menor a 70 movimientos");
					
				}
		           
		           
		           if (cont<=80&&cont>=71) {
		        	   points= points+7;
		        	   System.out.println("Menor a 80 movimientos");
					
				}
		           
		           
		           if (cont<=90&&cont>=81) {
		        	   points= points+6;
		        	   System.out.println("Menor a 90 movimientos");
					
				}
		           
		           
		           if (cont<=100&&cont>=91) {
		        	   points= points+5;
		        	   System.out.println("Menor a 100 movimientos");
					
				}
		           
		           
		           if (cont<=110&&cont>=101) {
		        	   points= points+4;
					
		        	   System.out.println("Menor a 110 movimientos");
				}
		           
		           
		           if (cont<=120&&cont>=111) {
		        	   points= points+3;
		        	   System.out.println("Menor a 120 movimientos");
				}
		           
		           
		           if (cont<=130&&cont>=121) {
		        	   points= points+2;
		        	   System.out.println("Menor a 130 movimientos");
				}
		           
		           if (cont<=140&&cont>=131) {
		        	   points= points+1;
					
		        	   System.out.println("Menor a 140 movimientos");
				}
			    
			    
			    
			  
		    
		
		
		return points;
		
		
		
		
	}
  
                              





	
	
	
	
}




