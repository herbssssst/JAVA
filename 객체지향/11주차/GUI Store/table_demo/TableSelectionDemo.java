package table_demo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import facade.DataEngineInterface;
import facade.UIData;

/*
 * ���̺��� ������ �гη� ���̺�� ���̺���� �����Ͽ� �ʱ�ȭ�ϰ�(init) 
 * �Ŵ������� �����͸� �޾ƿ� ���̺� ���� �߰��ϴ� ���(loadData)��
 * ���� ���õǾ��� �� �ʿ��� ���� �ϴ� ���(valueChanged)�� ������.
 */
public class TableSelectionDemo extends JPanel implements ListSelectionListener {
    private static final long serialVersionUID = 1L;
    JTable table;
    DefaultTableModel tableModel;
    int selectedIndex = -1;   // ���̺��� ���õ� ���� �ε����� ���� ����
    String tableTitle = null;
    DataEngineInterface dataMgr;  // ���� ���� �����͸� �����ϴ� �Ŵ��� �Ļ�� �������̽�
    public TableSelectionDemo() {
    	super(new BorderLayout());
    }
    // ���̺��� �����Ͽ� �ʱ�ȭ�ϰ� ��ũ�� �ٿ��� �гο� add�Ѵ�
    void addComponentsToPane(DataEngineInterface mgr) {
     	init(mgr);
    	JScrollPane center = new JScrollPane(table);   	
    	add(center, BorderLayout.CENTER);
    }
    // ���̺��� �⺻ ������ �ϴ� �κ� (���̺� ���� �����ϰ� �ʱ� ������ �ҷ�����
    // ���̺� �ʿ��� ������ �ʱ�ȭ�Ѵ�
    // ��ٱ��� ���̺��� �������̵��Ͽ� ������ �ֹ���ȣ�� ������ �� ���� ȣ��
    @SuppressWarnings("serial")
	void init(DataEngineInterface mgr) {
    	dataMgr = mgr;
    	tableModel = new DefaultTableModel(mgr.getColumnNames(), 0){  
    		 // �� ���� ���ϰ� �ϴ� �κ�
    		 public boolean isCellEditable(int row, int column){
    			    return false;
    		 }
    	};
    	loadData("");
    	
    	table = new JTable(tableModel);
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(this);
        table.setPreferredScrollableViewportSize(new Dimension(500, 220));
        table.setFillsViewportHeight(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    }
    // �Ŵ������� �˻��� ��ü���� ���̺� �����ش�. kwd�� ""�� ��� ���
    void loadData(String kwd) {
    	List<?> result = dataMgr.search(kwd); // �Ŵ������� �˻������ ������
    	tableModel.setRowCount(0);  // ���� �����͸��� ���� ��� �����
    	for (Object m : result)     // �� �྿ �߰���
    		tableModel.addRow(((UIData)m).getUiTexts());
    }
    // ������ �гο��� �󼼺��� ��ư�� ������ �� ����Ǵ� �޼ҵ�
    void showDetail() {
    	if (selectedIndex < 0)
    		return;
        String[] rowTexts = new String[tableModel.getColumnCount()];
        for (int i = 0; i < rowTexts.length; i++)
        	rowTexts[i] = (String)tableModel.getValueAt(selectedIndex, i);
    	DetailDialog dlg = new DetailDialog(rowTexts);
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    // ���õ� ���� ����Ǹ� �� ������ ����â���� ����
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
        if (!lsm.isSelectionEmpty()) {
        	selectedIndex = lsm.getMinSelectionIndex();
        	String name = (String)tableModel.getValueAt(selectedIndex, 1);
        	// ������ ���̺��� Ŭ���� �ؽ�Ʈ �ʵ忡 ���� �����ְ�
        	// �ֹ� ���̺��� Ŭ���� ��ٱ����� ���� �ٲ۴�
        	if (tableTitle.equals("item")) {
        		GUIMain.getInstance().itemTop.kwdTextField.setText(name);
        	} else if (tableTitle.equals("order")) {
        		GUIMain.getInstance().basketTable.loadData(""+selectedIndex);
        	}
        }
    }
}