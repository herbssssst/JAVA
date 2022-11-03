package JTable;

import javax.swing.JButton;

public class MyButton extends JButton{
	int index;
	int count;
	String text;
	
	MyButton(int i, String title){
		super(title);
		index = i;
		count = 0;
		text = title;
	}
}
