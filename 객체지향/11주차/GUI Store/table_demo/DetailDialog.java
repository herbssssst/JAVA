package table_demo;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JDialog;

public class DetailDialog extends javax.swing.JDialog {
	String[] itemDetails;
	JLabel details[] = new JLabel[5];
	DetailDialog(String[] texts) {
		super(GUIMain.mainFrame);
		itemDetails = texts;
	}
	void setup() {
		setTitle("��ǰ�󼼺���");
		JPanel pane = new JPanel(new BorderLayout());
		JPanel lpane = new JPanel(new GridLayout(3, 1));
		JLabel photo = new JLabel("   Photo   ");
		photo.setOpaque(true);  // JLabel�� �⺻�� ��� ����
		photo.setPreferredSize(new Dimension(150, 150));
		photo.setBackground(Color.YELLOW);
		details[0] = new JLabel("��ǰ�ڵ�: " + itemDetails[0]);
		details[1] = new JLabel("��ǰ��: " + itemDetails[1]);
		details[2] = new JLabel("����: " + itemDetails[2]);
		lpane.add(details[0]);
		lpane.add(details[1]);
		lpane.add(details[2]);
		pane.add(lpane, BorderLayout.CENTER);
		pane.add(photo, BorderLayout.LINE_END);
		this.setMinimumSize(new Dimension(400, 150));  // ��ȭ���� ũ�� ����
		setContentPane(pane);
	}
}
