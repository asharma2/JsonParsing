package com.parse.reader;

import org.junit.Test;

import com.parse.reader.impl.HttpReader;
import com.parse.reader.impl.JsonParserImpl;

public class TestHttpReader {

	@Test
	public void httpReader() throws Exception {
		String url = "http://128.199.164.72/coupon/";
		Reader reader = new HttpReader(url);
		JsonParserImpl parser = new JsonParserImpl(reader.read());
		parser.parse();
	}
}
