package com.parse.reader;

import com.parse.exception.ParseException;

public interface Reader {

	String read() throws ParseException;

	boolean hasNext();
}
