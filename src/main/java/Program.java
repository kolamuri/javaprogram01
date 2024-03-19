package com.qualizeal.javaapp.mainprogram;

import com.qualizeal.javaapp.mathematics.Addition;
import com.qualizeal.javaapp.mathematics.Division;
import com.qualizeal.javaapp.mathematics.Multiplication;
import com.qualizeal.javaapp.mathematics.Subtraction;
import com.qualizeal.javaapp.mathematics.geometry.Triangle;
import com.qualizeal.javaapp.ecommerce.Order;
import com.qualizeal.javaapp.ecommerce.Cart;

public class Program {
	public static void main(String[] args) {
		Addition addition=new Addition();
		addition.operation1();
		Division division=new Division();
		division.operation1();
		Multiplication multiplication=new Multiplication();
		multiplication.operation1();
		Subtraction subtraction=new Subtraction();
		subtraction.operation1();
		Triangle triangle=new Triangle();
		triangle.operation1();
		Order order=new Order();
		order.operation1();
		Cart cart=new Cart();
		cart.operation1();
	}
}