package br.com.estudos.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.estudos.modelo.Cliente;

public class SerializacaoClienteTeste {

	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("123.456.789-00");
		cliente.setNome("Tobias");
		cliente.setProfissao("Piloto de avião");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteArmazenado = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(clienteArmazenado.getCpf());
		System.out.println(clienteArmazenado.getNome());
		System.out.println(clienteArmazenado.getProfissao());
	}
}