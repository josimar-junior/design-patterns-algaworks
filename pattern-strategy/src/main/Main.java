package main;

import java.util.Scanner;

import model.Cliente;
import model.Sexo;
import model.TipoVeiculo;
import seguro.CalculadoraPremioSeguro;
import seguro.PropostaSeguro;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Digite o nome do cliente:");
			String nome = s.nextLine();
			System.out.println("Digite a idade do cliente:");
			int idade = s.nextInt();
			System.out.println("Digite 1 para Masculino e 2 para Feminino:");
			Sexo sexo = Sexo.values()[s.nextInt() - 1];

			Cliente cliente = new Cliente(nome, idade, sexo);

			boolean continua = true;

			while (continua) {
				System.out.println("Digite 1 para Carro ou 2 para Moto:");
				TipoVeiculo tipo = TipoVeiculo.values()[s.nextInt() - 1];

				System.out.println("Digite o valor do veículo:");
				double valorVeiculo = s.nextDouble();

				CalculadoraPremioSeguro calc = tipo.getCalculadoraPremioSeguro();

				PropostaSeguro propostaSeguro = new PropostaSeguro(cliente, valorVeiculo);
				propostaSeguro.setCalculadoraPremioSeguro(calc);

				System.out.println(propostaSeguro.gerar());

				System.out.println("Digite 1 para continuar ou 2 para sair");

				int esc = s.nextInt();

				continua = esc == 1 ? true : false;
			}
			
			System.out.println("------------------FIM-----------------");
		}
	}
}
