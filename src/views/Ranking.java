package views;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Ranking  extends JFrame{

	public Ranking() {
		
		 
		
		
		JTable table = new JTable();
		
		
		
		  this.add(new JScrollPane(table));
	         
	        this.setTitle("Ranking");
	        this.pack();
	        this.setVisible(true);
		
	        
	        DefaultTableModel modelo = new DefaultTableModel();
	        modelo.addColumn("Name");
	        modelo.addColumn("Username");
	        modelo.addColumn("Movements");
	        modelo.addColumn("Minutes in game");
	        modelo.addColumn("Total points");
	        modelo.addColumn("Game details");
	        
	       

	        for (usersDates pers : GamePuzzle.lista) {
	            Object[] fila = new Object[6];
	            fila[0] = pers.getName();
	            fila[1] = pers.getUsername();
	            fila[2] = pers.getIntents();
	            fila[3]= pers.getTime();
	            fila[4]= pers.getPoints();
	            fila[5]= pers.getState();
	                    
	            modelo.addRow(fila);
	        }
	        table.setModel(modelo); 
	        
	        
	        
		
	}

}
