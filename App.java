import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws IOException 
    {
		System.out.println("creating objectmapper");
		ObjectMapper om = new ObjectMapper();
		om.enableDefaultTyping();
		
		MyValue i = om.readValue(Files.readAllBytes(Paths.get("C:\\Users\\NA\\OneDrive\\Documents\\NetBeansProjects\\WebApplication1\\src\\java\\a.json")), MyValue.class);
		System.out.println("done");
    }
}

class MyValue {
@JsonTypeInfo(use = Id.CLASS)
public Object name;
public int age;
}