package com.jj.logtxt;

import com.jj.gerarlog.GerarLogs;
import com.jj.gerarlog.ImprimirLog;

public class GerarLogTXT extends GerarLogs{

	@Override
	protected ImprimirLog imprimirLog() {
		return new LogTXT();
	}

}
