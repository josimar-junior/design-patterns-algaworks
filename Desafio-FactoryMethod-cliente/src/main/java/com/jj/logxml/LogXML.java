package com.jj.logxml;

import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.swing.JOptionPane;

import com.jj.gerarlog.ImprimirLog;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LogXML implements ImprimirLog {

	@Override
	public void log(String mensagem) {

		XStream xml = new XStream(new DomDriver());
		OutputStream out;

		try {
			String file = "./LogXML.xml";
			out = new FileOutputStream(file);
			xml.toXML(mensagem, out);
			JOptionPane.showMessageDialog(null, "O arquivo "+ file +" foi gerado com sucesso! \n Pressione F5 no projeto!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
