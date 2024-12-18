package jsonoperations;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader {
	public static JSONObject readJson(String filePath) {
		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(filePath);
			return (JSONObject) parser.parse(reader);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
