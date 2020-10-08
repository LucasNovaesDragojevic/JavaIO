package br.com.estudos.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoTeste {

	public static void main(String[] args) throws Exception {
		
		String nome = "Lucas Novaes";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
		oos.writeObject(nome);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
		String nomeArmazenado = (String) ois.readObject();
		ois.close();
		
		System.out.println(nomeArmazenado);
	}

}
