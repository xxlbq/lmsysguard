package com.live;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LoadPropertis {
	private Properties properties = null;

	private Map<String, String> saveValueMap = new HashMap<String, String>();

	public LoadPropertis(String fileName) {
		properties = new Properties();

		ClassLoader loader = LoadPropertis.class.getClassLoader();
		InputStream is = loader.getResourceAsStream(fileName);
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List getProperties(String key) {
		List<String> result = new ArrayList<String>();
		Enumeration keys = properties.keys();
		String wholeKey = null;
		while (keys.hasMoreElements()) {
			wholeKey = (String) keys.nextElement();
			if (wholeKey.startsWith(key)) {
				result.add(getProperty(wholeKey));
			}
		}
		return result;
	}

	public String getProperty(String key) {
		String result = (String) saveValueMap.get(key);
		if ((result == null) || (result.equals(""))) {
			result = properties.getProperty(key);
			saveValueMap.put(key, result);
		}
		return result.trim();
	}
}
