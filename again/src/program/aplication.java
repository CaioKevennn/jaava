package program;

import java.util.Scanner;
import entities.Product;

class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data:");
		System.out.println("Name");
		String name = sc.next();
		System.out.println("Price");
		double price = sc.nextDouble();
		System.out.println("Quantity");
		int quantaty = sc.nextInt();

		Product product1 = new Product(name, price, quantaty);
	
		
		sc.close();

	}

}
