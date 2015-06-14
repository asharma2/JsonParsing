package com.parse.reader.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.parse.exception.ParseException;
import com.parse.exception.ParseRuntimeException;
import com.parse.reader.Reader;

public class HttpReader implements Reader {

	private final String url;
	private boolean hasNext = false;
	private BufferedReader input;

	public HttpReader(String url) {
		this.url = url;
		try {
			this.input = new BufferedReader(new InputStreamReader(new URL(this.url).openStream(), "UTF-8"));
			this.hasNext = true;
		} catch (Exception e) {
			throw new ParseRuntimeException(e);
		}
	}

	public String read() throws ParseException {
		try {
			String line = null;
			while ((line = input.readLine()) != null) {
				this.hasNext = true;
				return line;
			}
			this.hasNext = false;
		} catch (Exception e) {
			throw new ParseException(e);
		}
		return null;
	}

	public boolean hasNext() {
		return hasNext;
	}

}
