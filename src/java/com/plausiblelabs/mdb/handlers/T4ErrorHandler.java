package com.plausiblelabs.mdb.handlers;

import java.io.IOException;

import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.ErrorHandler;
import com.healthmarketscience.jackcess.Table.RowState;

public class T4ErrorHandler implements ErrorHandler {
	
	public static final Object REPLACEMENT_VALUE = "--- ERROR ---";

	@Override
	public Object handleRowError(Column column, byte[] columnData,
			RowState rowState, Exception error) throws IOException {
		
		System.out.println("--------------------------- START FOO ERROR HANDLER");
		System.out.println("TABLE NAME: " + rowState.getTable().getName());
		System.out.println("COLUMN NAME: " + column.getName());
		System.out.println("COLUMN TYPE: " + column.getType());
		System.out.println("--------------------------- END FOO ERROR HANDLER");
		
		// returning the default value
		return REPLACEMENT_VALUE;
	}

}
