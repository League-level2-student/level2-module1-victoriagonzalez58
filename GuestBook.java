package intro_to_array_lists;

import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook<Jbutton>{
	

	

	public void mouseClicked(MouseEvent e){
		System.out.println("Mouse clicked");
		JButton click = (JButton) e.getSource();
	}
	static JButton click = new JButton();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setVisible(true); 
		JPanel sheet = new JPanel();
		sheet.setVisible(true);
		JButton one = new JButton();
		one.setVisible(true);
		
		one.addMouseListener(null);
		JButton two = new JButton();
		two.setVisible(true);
		two.addMouseListener(null);
		
		sheet.add(one);
		sheet.add(two);
		window.add(sheet);
	    window.pack();
		
	    one.setText("Add Name");
	    two.setText("View Names");
	    window.setSize(500,500);
	   ArrayList<String> Narray = new ArrayList<String>();
	   Narray.add("Bob Banders"); 
	   Narray.add("Sandy Summers");
	   Narray.add("Greg Ganders");
	   Narray.add("Donny Doners");

	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. 
	  
	   Event mousePressed = null;
	if(one.action(mousePressed, true)){
	    	String knew = (JOptionPane.showInputDialog(null, "Enter Name"));
	    	Narray.add(knew);
	    }
		
	
	//When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	if(two.action(mousePressed, true)){
		JOptionPane.showMessageDialog(null, Narray);
	}
			
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
}



	