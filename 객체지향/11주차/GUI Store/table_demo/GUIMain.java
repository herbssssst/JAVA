package table_demo;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import store.ItemMgr;
import store.OrderMgr;
import store.OrderedItemMgr;
import store.Store;

public class GUIMain {
	// �̱��� ���� ���� �κ�
	private static GUIMain main = null;
	private GUIMain() {}
	public static GUIMain getInstance() {
		if (main == null)
			main = new GUIMain();
		return main;
	}
	// ������ �ν��Ͻ��� ���� ���� ������ �����Ѵ�
    static Store store = Store.getInstance();
    public static void main(String args[]) {
    	store.run();
    	startGUI();
    }
    public static void startGUI() {
        // �̺�Ʈ ó�� �����带 ����� 
        // �ű⼭ GUI�� �����ϰ� �����ش�.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIMain.getInstance().createAndShowGUI();
            }
        });
    }
    /**
     * GUI�� �����Ͽ� �����ش�. ������ ������ ���Ͽ�
     * �� �޼ҵ�� �̺�Ʈ ó�� �����忡�� �ҷ����� �Ѵ�.
     */
	static JFrame mainFrame = new JFrame("TableSelectionDemo");
    private void createAndShowGUI() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ���� �����ϰ� �ΰ� �г��� �߰��Ѵ�.
        JTabbedPane jtab = new JTabbedPane();
        
        setupItemPane();
        setupOrderPane();
        // ������ ����Ʈ �ǰ� �ֹ� �� �� ���� �г��� ������ �� �г�
        jtab.add("������", itemPane);
        jtab.add("�ֹ�", orderPane);
        mainFrame.getContentPane().add(jtab);
        //Display the window.
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    // ��ǰ�� �����ִ� �г� �κ� - ž�� JTable ����
    private JPanel itemPane;
    TableSelectionDemo itemTable = new TableSelectionDemo();
    ItemTopPanel itemTop = new ItemTopPanel();  // �˻��� �󼼺��� ��ư�� ���� �г�
    private void setupItemPane() {
    	itemPane = new JPanel(new BorderLayout());
        //Create and set up the content pane.
        itemTable.tableTitle = "item";
        itemTable.addComponentsToPane(ItemMgr.getInstance());  // �̱���
        itemTop.setupTopPane(itemTable);
        itemPane.add(itemTop, BorderLayout.NORTH);
        itemPane.add(itemTable, BorderLayout.CENTER);
    }
    // ��ǰ�� �����ִ� �г� �κ� - ������ �ֹ� JTable, �Ʒ� �г��� ��ٱ��Ͽ� ��ư
    private JPanel orderPane;
    TableSelectionDemo orderTable = new TableSelectionDemo();
    BasketTableDemo basketTable = new BasketTableDemo();
    private void setupOrderPane() {
    	orderPane = new JPanel(new BorderLayout());
        orderTable.tableTitle = "order";
        orderTable.addComponentsToPane(OrderMgr.getInstance());
        orderPane.add(orderTable, BorderLayout.CENTER);
        // �Ʒ����� ��ٱ��� ���̺�� �󺧷� ������ ���� �г� �߰�
        JPanel bottom = new JPanel();  // ����Ʈ �÷ο췹�̾ƿ�
        basketTable.tableTitle = "basket";
        basketTable.addComponentsToPane(OrderedItemMgr.getInstance());

        bottom.add(basketTable, BorderLayout.CENTER);
        // ���⿡ ���� ���� ��ư�� ���� �� ���� - ����, ���, �߰�, ���� ��
        bottom.add(new JLabel("��ٱ��� �׽�Ʈ"), BorderLayout.LINE_END);
        orderPane.add(bottom, BorderLayout.SOUTH);
    }
}