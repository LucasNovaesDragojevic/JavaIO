package br.com.estudos.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscritaFileWriterTeste {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		/*
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo ");
		fw.close();
		*/
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		bw.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo ");
		
		bw.close();
	}

}
