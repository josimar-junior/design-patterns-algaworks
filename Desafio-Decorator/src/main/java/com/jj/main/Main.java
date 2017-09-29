package com.jj.main;

import javax.swing.JOptionPane;

import com.jj.dao.AgendaDAO;
import com.jj.dao.CacheAgendaDAO;
import com.jj.model.Agenda;
import com.jj.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		boolean escolha = true;
		Agenda agenda = new CacheAgendaDAO(new AgendaDAO());
		Contato contato;
		while(escolha) {
			int escolhaFuncao = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir \n 2 - Buscar \n 3 - Sair"));
			switch (escolhaFuncao) {
			case 1:
				Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
				String nome = JOptionPane.showInputDialog("Digite o nome");
				String telefone = JOptionPane.showInputDialog("Digite o telefone");
				contato = new Contato(codigo, nome, telefone);
				agenda.inserir(contato);
				JOptionPane.showMessageDialog(null, "Contato salvo!");
				break;
			case 2:
				Integer codigoPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
				JOptionPane.showMessageDialog(null, agenda.buscar(codigoPesquisa));
				break;
			case 3:
				escolha = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite um número válido!","Alerta", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}

	}

}
