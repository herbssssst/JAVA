import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

class Event01 extends JFrame implements ActionListener
{
    private JButton b1,b2;
    private JPanel panel;

    public Event01(){
        setSize(300,200);
        setTitle("�̺�Ʈ ����");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JButton b1=new JButton("�����");
        panel=new JPanel();
        b1=new JButton("�����");
        b2=new JButton("�ʷϻ�");
        panel.add(b1);
        panel.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(panel);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            panel.setBackground(Color.yellow);
        if(e.getSource()==b2)
            panel.setBackground(Color.green);
    }
}


public class GUIpro {

    public static void main(String[] args) {
        Event01 e1=new Event01();
    }
}