package views;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class usersDates {
	
	
	private String 	name ="";
	private String 	username=" ";
	private String intents="";
	private String time="";
	private String points="";
	private String state="";
	public usersDates(String name , String username ,String intents ,String time , String points,String state) {
		
		this.name	    =name;
		this.username	=username;
		this.intents	=intents;
		this.time		=time;
		this.points		=points;
		this.state		=state;
		
		Resume();
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	




	public String getIntents() {
		return intents;
	}



	public void setIntents(String intents) {
		this.intents = intents;
	}
	
	

	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}
  

	
	public String getPoints() {
		return points;
	}



	public void setPoints(String points) {
		this.points = points;
	}
	
	public void Resume() {
		
	      JOptionPane.showMessageDialog(null, "\n"+ "Your game summary"+"\n"+"Player name"+" "+this.name+"\n"+"Player Usernname"+" "+this.username+"\n"+"Movements"+" "+this.intents+"\n"+"Minutes"+" "+this.time+"\n"+"Total points"+" "+this.points);
			
			

		}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}

}

