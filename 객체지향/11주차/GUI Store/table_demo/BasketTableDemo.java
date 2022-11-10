package table_demo;

import facade.DataEngineInterface;
import store.Order;
import store.OrderMgr;
import store.OrderedItemMgr;
/*
 * ��ٱ��� ���̺��� �ֹ����̺��� Ŭ���� ����� ������ �޶����� ��
 * TableSelectionDemo Ŭ�������� ����Ͽ�
 * ��ٱ��� ������ �ٽ� �ҷ����� �κ��� loadData�� ��� �߰���
 * ���õ� �ֹ��� 
 */
@SuppressWarnings("serial")
public class BasketTableDemo extends TableSelectionDemo {
	OrderedItemMgr basketMgr = OrderedItemMgr.getInstance();
	OrderMgr orderMgr = OrderMgr.getInstance();
    void init(DataEngineInterface mgr) {
        // ù��° �ֹ��� �������� �ϱ� ���� �ֹ���ȣ�� �����ϴ� �κ�
    	((OrderedItemMgr)mgr).setOrder(orderMgr.getOrder(0));
    	super.init(mgr);
    }
    // �θ� Ŭ������ ���̺� ������ �ε��ϴ� �κ��� �������̵��Ͽ�
    // ��ٱ����� ��� Ŭ���� �ֹ��� ��ȣ�� �̿��Ͽ� �ش� �ֹ��� ��ٱ��ϸ� ����������
    // �̸� ������ �� ������ loadData�� ȣ���Ѵ�.
	@Override
    void loadData(String kwd) {
		if (!kwd.equals("")) {
			Order o = orderMgr.getOrder(Integer.parseInt(kwd));
			basketMgr.setOrder(o);
		}
    	super.loadData("");
	}
}
