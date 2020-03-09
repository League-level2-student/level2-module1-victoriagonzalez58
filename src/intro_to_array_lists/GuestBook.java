package intro_to_array_lists;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class GuestBook{
	JButton one = new JButton();

	JButton two = new JButton();
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

	    window.pack();
	    
	   ArrayList<String> Narray = new ArrayList<String>();
	
if(one==clicked){
	
}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. 
	   
	//When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:

	   Narray.add("Bob Banders"); 
	   Narray.add("Sandy Summers");
	   Narray.add("Greg Ganders");
	   Narray.add("Donny Doners");
	   
	   for(int i = 0; i < Narray.size(); i++){
			String s = Narray.get(i);
			JOptionPane.showMessageDialog(null,"Guest #" + i +": "+ s);
		}
	   
}
}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	




	