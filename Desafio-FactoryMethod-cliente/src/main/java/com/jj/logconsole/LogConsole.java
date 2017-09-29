package com.jj.logconsole;

import javax.swing.JOptionPane;

import com.jj.gerarlog.ImprimirLog;

public class LogConsole implements ImprimirLog{

	public void log(String mensagem) {
		System.out.println(mensagem);
		JOptionPane.showMessageDialog(null, "O arquivo de console foi gerado com sucesso!");
	}

}
