package br.com.estudos.teste;

import java.io.PrintStream;
import java.io.PrintWriter;

public class EscritaPrintTeste {

	public static void main(String[] args) throws Exception {
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println("esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat ");
		
		ps.close();
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.println("sdasdkaçdkalçskdlasç");
		pw.println();
		pw.println();
		pw.println("adfsdfklçkdfla ");
		
		pw.close();
	}

}
