package com.jj.enviador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jj.contatos.ContatosXML;
import com.jj.model.Contato;
import com.jj.model.Contatos;
import com.jj.model.EnviadorEmail;

public class EnviadorEmailProxy implements EnviadorEmail {

	private String arquivo1, arquivo2;
	private EnviadorEmailMandrill enviadorEmailMandrill;

	public EnviadorEmailProxy(String arquivo1, String arquivo2) {
		this.arquivo1 = arquivo1;
		this.arquivo2 = arquivo2;
	}

	public void enviar(String mensagem) {
		
		Map<String, String> emailsValidos = getEmailsValidos();
		enviadorEmailMandrill = new EnviadorEmailMandrill(emailsValidos);
		enviadorEmailMandrill.enviar(mensagem);

	}

	private Map<String, String> getEmailsValidos() {
		Map<String, String> emails = new HashMap<>();
		Contatos contatos = new ContatosXML();

		List<Contato> contatosValidos = contatos.recuperarContatos(arquivo1);
		List<Contato> contatosInvalidos = contatos.recuperarContatos(arquivo2);

		for (Contato contato : contatosValidos) {
			boolean emailIgual = false;
			for (Contato con : contatosInvalidos) {
				if (contato.getEmail().equals(con.getEmail())) {
					emailIgual = true;
					break;
				}
			}
			if (!emailIgual) {
				emails.put(contato.getEmail(), contato.getNome());
			}
		}

		return emails;
	}
	
	@Override
	public String buscarPorEmail(String email) {
		return getEmailsValidos().get(email);
	}

}
