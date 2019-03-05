package parseJson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJson_Jackson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Person user = new Person();
		ObjectMapper mapper = new ObjectMapper();
		user = mapper.readValue("{\"name\": \"John\"}", Person.class);
		System.out.println(user.name); // John
	}

}

class Person {
	public String name;

	public Person(String name) {
		this.name = name;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}