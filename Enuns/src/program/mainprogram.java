package program;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class mainprogram {

	public static void main(String[] args) {
		Order order = new Order(5,new Date(),OrderStatus.ENVIADO);
		System.out.println(order.toString());
	}}
	