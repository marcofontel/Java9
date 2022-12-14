package org.arca.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestTryCatch {

	public static void main(String[] args) throws IOException {
		lerArquivoTrycRecurso("exemplo.txt");
	}
	
	public static void lerArquivoTrycRecurso(String file) throws IOException {
		String linha="";
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		try(br){
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		}
	}
}
