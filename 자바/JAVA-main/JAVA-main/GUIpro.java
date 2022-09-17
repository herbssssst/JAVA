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
        setTitle("이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JButton b1=new JButton("노란색");
        panel=new JPanel();
        b1=new JButton("노란색");
        b2=new JButton("초록색");
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