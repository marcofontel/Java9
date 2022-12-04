package org.arca.classinteranonim;

public class TestClassAnonimas {
	
	public static void main(String[] args) {
		
		SomaTudo<String> somaString = new SomaTudo<String>() {
			
			@Override
			public String soma(String a, String b) {
				
				return a + b;
			}
			
		};
		System.out.println(somaString.soma("Oi ", "Maria Maxwell, Marlon, Marcelo, Marcio"));
	}
	
}