package com.parse.reader.impl;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import com.parse.reader.Parser;

public class JsonParserImpl implements Parser {

	private final String json;

	public JsonParserImpl(String json) {
		this.json = json;
	}

	public void parse() {
		try {
			//Read the json array
			JSONArray jsonArray = new JSONArray(json);
			int length = jsonArray.length();
			for (int i = 0; i < length; i++) {
				//Read the json object
				JSONObject objects = (JSONObject) jsonArray.get(i);
				Iterator<String> keys = objects.keys();
				while (keys.hasNext()) {
					String key = keys.next();
					if (objects.get(key) instanceof JSONObject) {
						JSONObject object2 = (JSONObject) objects.get(key);
						Set<String> keyss = object2.keySet();
						for (String k : keyss) {
							System.out.println(key + " -> " + object2.get(k));
						}
					} else if (objects.get(key) instanceof JSONArray) {
						JSONArray object2 = (JSONArray) objects.get(key);
						System.out.println(key + " -> " + object2);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
