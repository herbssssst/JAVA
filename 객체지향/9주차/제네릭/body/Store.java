package body;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Store {
	static Manager<BodyItem> bodyMgr = new Manager();
	Manager<Order> orderMgr = new Manager();
	
    void run() {
        bodyMgr.readAll("body.txt", new Factory<BodyItem>() {
        	public BodyItem create() {
        		return new BodyItem();
        	}
        });
        bodyMgr.printAll();
        orderMgr.readAll("order.txt", new Factory<Order>() {
        	public Order create() {
        		return new Order();
        	}
        });
        serviceAllCustomers();
		System.out.println("========== 판매 현황 =============");
		orderMgr.printAll();
		search();
    }
    
    private void search() {
		// TODO Auto-generated method stub
		System.out.println("=========== 검색 메뉴 ============");
		while (true) {
			System.out.print("(1) 제품   (2) 주문   => ");
			int menu = Manager.sc.nextInt();
			if (menu == 1) bodyMgr.search();
			else if (menu == 2) orderMgr.search();
			else break;
		}
	}
	void serviceAllCustomers() {
		for (Order m: orderMgr.mList) {
			Order o = m;
			o.service();
		}
    }
    
    public static void main(String[] args) {
		Store store = new Store();
		store.run();
	}
}