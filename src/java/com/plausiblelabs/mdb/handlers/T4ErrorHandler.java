package com.plausiblelabs.mdb.handlers;

import java.io.IOException;

import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.ErrorHandler;
import com.healthmarketscience.jackcess.Table.RowState;

public class T4ErrorHandler implements ErrorHandler {
	
	public static final Object REPLACEMENT_VALUE = null;

	@Override
	public Object handleRowError(Column column, byte[] columnData,
			RowState rowState, Exception error) throws IOException {
		
		System.out.println("ERROR Reading Row---------------------------------");
		System.out.println(column.toString());
		System.out.println("BYTE Data: " + columnData);
		
		// returning the default value
		return REPLACEMENT_VALUE;
	}

}
