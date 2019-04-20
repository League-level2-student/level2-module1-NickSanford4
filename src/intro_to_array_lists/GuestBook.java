package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton buttonAdd = new JButton();
	JButton buttonView = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
	GuestBook book = new GuestBook();
	book.setup();
	}
	void setup() {
		JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	frame.add(panel);
	panel.add(buttonAdd);
	panel.add(buttonView);
	buttonAdd.setText("Add Name");
	buttonView.setText("View Names");
	frame.setVisible(true);
	frame.setSize(120, 95);
	buttonAdd.addActionListener(this);
	buttonView.addActionListener(this);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		if (clicked == buttonAdd) {
	String inputName = JOptionPane.showInputDialog("Enter a Name");
	names.add(inputName);
		}
		 if (clicked == buttonView) {
			for (int i = 0; i < names.size(); i++) {
	JOptionPane.showMessageDialog(null, "Guest #"+(i+1)+": "+names.get(i));
		}
}
	}
}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	

