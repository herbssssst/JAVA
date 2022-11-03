package mycalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalc extends JFrame {
	private static final long serialVersionUID = 1L;
	void run() {
		setTitle("���� ���� ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container myCon = getContentPane();
		myCon.setLayout(new BorderLayout(5, 5));
		myCon.setBackground(Color.LIGHT_GRAY);
		
		//�Է� ���� ������� ��µǴ� �� �г� ���� �� �����̳ʿ� �߰�
		UpPanel up = new UpPanel();
		up.init();
		myCon.add(up, BorderLayout.EAST);
		//��ư�� ���� �Ʒ� �г� ���� �� �����̳ʿ� �߰�
		DownPanel dp = new DownPanel();
		dp.init(up);
		myCon.add(dp, BorderLayout.SOUTH);
		
		setSize(350, 560);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyCalc my = new MyCalc();
		my.run();
	}
}
