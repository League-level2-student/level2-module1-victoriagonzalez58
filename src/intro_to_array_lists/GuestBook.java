package intro_to_array_lists;

import java.awt.Event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true); 
		window.setDefaultCloseOperation(800);
		JPanel sheet = new JPanel();
		window.add(sheet);
		
		JButton one = new JButton();
		one.setName("Add Name");
		one.addMouseListener(null);
		JButton two = new JButton();
		two.setName("View Names");
		two.addMouseListener(null);
		
		sheet.add(one);
		sheet.add(two);
	
		Event mousePressed;
		if(one.action(mousePressed, true)){
			JOptionPane.showInputDialog(one, "Enter a name");
		}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. 
	//When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:

			
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	}
	
}
