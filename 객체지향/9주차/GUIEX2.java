import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;

public class GUIEX2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		Container container = frame.getContentPane();
		container.add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
		container.add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
		JButton button = new JButton();
		container.add(new JButton("LINE_START"), BorderLayout.LINE_START);
		container.add(new JButton("LINE_END"), BorderLayout.LINE_END);
		container.add(new JButton("CENTER"), BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
