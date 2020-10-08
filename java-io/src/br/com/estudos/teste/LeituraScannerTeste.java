package br.com.estudos.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class LeituraScannerTeste {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(new File("contas.csv"));
		
		while (s.hasNextLine()) {	
			String linha = s.nextLine();
			
			//System.out.println(linha);
			
			/*
			String[] valores = linha.split(",");
			System.out.println(Arrays.toString(valores));
			*/
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			Integer valor2 = linhaScanner.nextInt();
			Integer valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"), "%s | %04d-%08d | %20s | %08.2f %n", valor1, valor2, valor3, valor4, valor5);			
			
			linhaScanner.close();
		}		
		s.close();
	}
}