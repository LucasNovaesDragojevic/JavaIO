package br.com.estudos.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.estudos.modelo.Cliente;
import br.com.estudos.modelo.ContaCorrente;

public class SerializacaoHerancaTeste {

	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("123.456.789-00");
		cliente.setNome("Tobias");
		cliente.setProfissao("Piloto de avião");
		
		ContaCorrente cc = new ContaCorrente(1234, 5678);
		cc.setTitular(cliente);
		cc.deposita(100.00);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente ccArmazenado = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(ccArmazenado.toString());
		System.out.println(ccArmazenado.getTitular());

	}
}