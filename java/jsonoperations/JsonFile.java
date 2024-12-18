package jsonoperations;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class JsonFile {
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
//		JSONParser jsonparse = new JSONParser();

		// JSONObject jsonobject = (JSONObject) jsonparse.parse(new
		// FileReader("jsfile\\testdata.json"));
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("action", "input");
		jsonobject.put("xpath", "//input[@formcontrolname='username']");
		jsonobject.put("value", "riyaz@rabiyat.fusion");

		FileWriter filewriter = new FileWriter("testdata.json");

		filewriter.write(jsonobject.toJSONString());
		filewriter.close();

	}
}
