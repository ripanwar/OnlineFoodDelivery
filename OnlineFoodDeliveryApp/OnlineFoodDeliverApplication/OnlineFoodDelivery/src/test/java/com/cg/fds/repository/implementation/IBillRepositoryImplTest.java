package com.cg.fds.repository.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Address;
import com.cg.fds.entities.Bill;
import com.cg.fds.entities.Customer;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.service.implement.IBillServiceImpl;

class IBillRepositoryImplTest {
	
	Bill bill = null;
	OrderDetails order;
	IBillRepositoryImpl ibr;
	ArrayList<Bill> billlist;
	
	
	@Before
	public void setup()
	{
		bill=new Bill();
		bill.setBillId(1);
		bill.setTotalItem(3);
		order.setOrderId(2);
		order.setOrderStatus("Delivered");
		bill.setOrder(order);
		bill.setTotalCost(400);
		ibr=new IBillRepositoryImpl();
		 billlist = new ArrayList<Bill>();
		 billlist.add(bill);
		
	}

	@Test
	void testAddBill() {
		assertEquals(bill.getBillId(),ibr.addBill(bill).getBillId());
		assertEquals(bill.getTotalItem(),ibr.addBill(bill).getTotalItem());
		assertEquals(bill.getOrder(),ibr.addBill(bill).getOrder());
		
		
	}

	@Test
	void testUpdateBill() {
		assertEquals(bill.getBillId(),ibr.updateBill(bill).getBillId());
	}

	@Test
	void testRemoveBill() {
		assertEquals(bill.getBillId(),ibr.removeBill(bill).getBillId());
	}

	@Test
	void testViewBill() {
		assertEquals(bill.getBillId(),ibr.viewBill(bill).getBillId());
	}

	@Test
	void testViewBillsLocalDateLocalDate() {
		
	}

	@Test
	void testViewBillsString() {
		Address add = new Address("22","NULL","MOdel-Town","12","rewari","Haryana","India","123401");
		Customer cust = new Customer("1","hitesh","munjal","Male","21","777777777",add,"hh@gmail.com");
		assertEquals(billlist,ibr.viewBills(cust.getCustomerId()));
		
	}

}
