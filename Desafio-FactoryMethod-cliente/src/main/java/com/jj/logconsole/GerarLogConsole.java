package com.jj.logconsole;

import com.jj.gerarlog.GerarLogs;
import com.jj.gerarlog.ImprimirLog;

public class GerarLogConsole extends GerarLogs{

	@Override
	protected ImprimirLog imprimirLog() {
		return new LogConsole();
	}

}
