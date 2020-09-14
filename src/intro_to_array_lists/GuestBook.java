package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton one = new JButton();

	JButton two = new JButton();

	GuestBook() {
		JFrame window = new JFrame();
		window.setVisible(true);
		JPanel sheet = new JPanel();
		sheet.setVisible(true);
		JButton one = new JButton();
		one.setVisible(true);
		one.addMouseListener(null);

		window.setSize(300, 300);
		window.pack();

		JButton two = new JButton();
		two.setVisible(true);
		two.addMouseListener(null);

		sheet.add(one);
		sheet.add(two);
		window.add(sheet);
		window.pack();

		one.setText("Add Name");
		two.setText("View Names");
		window.setSize(500, 500);
		
		one.addActionListener(this);
		two.addActionListener(this);

		window.pack();

	

		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add that name to an ArrayList.fc
		 

		// When the "View Names" button is clicked, display a message dialog that
		// displays
		// all the names added to the list. Format the list as follows:


		

	}ArrayList<String> Narray = new ArrayList<String>();

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == one) {
		String nam =	JOptionPane.showInputDialog(null, "Add Guest's Name: ");
			Narray.add(nam);
		}
		if(e.getSource() == two) {	
			for (int i = 0; i < Narray.size(); i++) {
				String s = Narray.get(i);
				JOptionPane.showMessageDialog(null, "Guest #" + i + ": " + s);
			

			Narray.add("Bob Banders");
			Narray.add("Sandy Summers");
			Narray.add("Greg Ganders");
			Narray.add("Donny Doners");
		}
		
		}
		
	}
}

// Guest #1: Bob Banders
// Guest #2: Sandy Summers
// Guest #3: Greg Ganders
// Guest #4: Donny Doners
