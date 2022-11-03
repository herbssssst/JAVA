package JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutDemo implements MouseListener {
	 private static void createAndShowGUI() {
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentsToPane(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	 public static void addComponentsToPane(Container pane) {
		 JButton button = new JButton("Button 1 (PAGE_START)");
		 pane.add(button, BorderLayout.PAGE_START);
		 button = new JButton("Button 2 (CENTER)");
		 button.setPreferredSize(new Dimension(200, 100));
		 pane.add(button, BorderLayout.CENTER);
		
		 button = new JButton("Button 3 (LINE_START)");
		 pane.add(button, BorderLayout.LINE_START);
	 }
	 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
		String btnText = btn.getText();
		int index = btnText.indexOf("-");
		int count = 0;
		count = Integer.parseInt(btnText.substring(0, index)) + 1;
		btn.setText(count+" " + btnText.substring(index));
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
