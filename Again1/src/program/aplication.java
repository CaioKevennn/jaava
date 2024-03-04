package program;

import java.util.Scanner;

import entities.Product2;

public class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data:");
		System.out.println("Name");
		String name = sc.next();
		System.out.println("Price");
		double price = sc.nextDouble();
		System.out.println("Quantity");
		int quantaty = sc.nextInt();
		Product2 product  = new Product2 (name,price,quantaty);
		
		System.out.println(product.toString());
		System.out.println("Enter the number of products to be added in stock");
		quantaty = sc.nextInt();
		product.AddProducts(quantaty);
		System.out.println("Enter the number of products to be removed in stock");
		quantaty = sc.nextInt();
		product.RemoveProducts(quantaty);

		sc.close();
	}

}
