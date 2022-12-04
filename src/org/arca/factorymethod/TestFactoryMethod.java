package org.arca.factorymethod;

import java.util.List;

public class TestFactoryMethod {

	public static void main(String[] args) {
		List<String> lista = List.of("Banana, Maçã, Pera");
		
		for(String a: lista) {
			System.out.println(a);
		}
		 
	}
}
