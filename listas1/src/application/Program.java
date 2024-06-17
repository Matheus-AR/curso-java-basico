package application;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		x.add(12);
		x.add(4);
		x.add(76);
		x.add(90);
		
		
		for (Integer integer : x) {
			System.out.println(integer);
		}
		
		System.out.println("-------");
		System.out.println("LinkedList");
		LinkedList<Integer> y = new LinkedList<Integer>();
		
		y.add(14);
		y.add(11);
		y.add(6);
		y.add(87);
		y.add(55);
		
		for (Integer integer : y) {
			System.out.println(integer);
		}
	}
}
