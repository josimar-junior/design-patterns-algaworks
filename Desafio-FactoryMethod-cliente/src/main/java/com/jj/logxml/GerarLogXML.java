package com.jj.logxml;

import com.jj.gerarlog.GerarLogs;
import com.jj.gerarlog.ImprimirLog;

public class GerarLogXML extends GerarLogs{

	@Override
	protected ImprimirLog imprimirLog() {
		return new LogXML();
	}

}
