package org.arca.apistream;

import java.util.ArrayList;
import java.util.List;

public class TesteApiStream {

	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Geladeira");
		lista.add("Fogao");
		lista.add("Tv Samsung");
		lista.add("Armario");
		lista.add("Cadeira");
		lista.add("Janela");
		
		lista.stream()
		.filter(a->a.toString().contains("Geladeira"))
		.map(a -> a.toString())
		.forEach(a -> System.out.println(a));
	}
}
