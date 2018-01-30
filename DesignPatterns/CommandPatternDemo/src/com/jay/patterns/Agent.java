package com.jay.patterns;

import java.util.ArrayList;

//Invoker.
class Agent {
 private ArrayList<Order> m_ordersQueue = new ArrayList();

 public Agent() {
 }
 
 void placeOrder(Order order) {
	 m_ordersQueue.add(order);
     order.execute();
     getFirstAndRemove();
 }
 
 private void getFirstAndRemove(){
//	 Order order = null;
	 if(m_ordersQueue.size() > 0){
		   m_ordersQueue.get(0);
		  //
		  m_ordersQueue.remove(0);
	 }
//	 return order;
 }
}
