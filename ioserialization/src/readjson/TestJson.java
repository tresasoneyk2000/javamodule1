package readjson;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		JSONObject employeeDetails = new JSONObject();
				employeeDetails.put("firstName","Anil");
				employeeDetails.put("lastName","Sunny");
				 employeeDetails.put("website", "javaport.in");
		         
			        JSONObject employeeObject = new JSONObject(); 
			        employeeObject.put("employee", employeeDetails);
			        // second employee
				JSONObject employeeDetails2 = new JSONObject();
				employeeDetails2.put("firstName","Ani");
				employeeDetails2.put("lastName","Sharath");
				 employeeDetails2.put("website", "example.com");
				 
				 JSONObject employeeObject2 = new JSONObject(); 
			        employeeObject2.put("employee", employeeDetails2);
			         
			        //Add employees to list
			        JSONArray employeeList = new JSONArray();
			        employeeList.add(employeeObject);
			        employeeList.add(employeeObject2);

			        // write JSON file
			        try(FileWriter file=// try with resource ,java 1.7 feature
			        		new FileWriter("employees.json")){
			        		// we can write any JSONARRAY OR JSONoBJECT
			        		file.write(employeeList.toJSONString());
			        		file.flush();
				
			        }catch(IOException e) {
			        	e.printStackTrace();
			        	
			        }
		

	}

}
