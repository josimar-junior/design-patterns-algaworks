package com.jj.logtxt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.jj.gerarlog.ImprimirLog;

public class LogTXT implements ImprimirLog {

	@Override
	public void log(String mensagem) {

		try {
			FileWriter file = new FileWriter("./LogTXT.txt");
			PrintWriter print = new PrintWriter(file);
			print.print(mensagem);
			file.close();
			JOptionPane.showMessageDialog(null, "O arquivo LogTXT.txt foi gerado com sucesso! \n Pressione F5 no projeto!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
