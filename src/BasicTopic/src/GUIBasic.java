import javax.swing.JOptionPane; //this class must need to import to show dialog box
public class GUIBasic {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Your name is: "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your age is: "+ age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your height is: "+ height);
		
		//here JOptionPane is a class for Graphical user interface (GUI)

	}

}
