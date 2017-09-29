package com.jj.enviador;

import java.util.Map;

import com.jj.model.EnviadorEmail;

public class EnviadorEmailMandrill implements EnviadorEmail{

	private Map<String, String> emails;
	
	public EnviadorEmailMandrill(Map<String, String> emails) {
		this.emails = emails;
	}
	
	@Override
	public void enviar(String mensagem) {
		for(String email : emails.keySet()) {
			System.out.println("------------------------------------");
			System.out.println("De: junior@jj.com   Para: " + email);
			System.out.println("Mensagem: " + mensagem);
			System.out.println("Prezado (a): " + emails.get(email));
			System.out.println("------------------------------------");
		}
		
	}

	@Override
	public String buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
