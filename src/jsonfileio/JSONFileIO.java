package jsonfileio;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.PrintWriter;

public class JSONFileIO {

    /**
         * Takes JSON Object and FilePath as Input and Writes in a JSON File
         * @return  None
    */
    public static void writeJsonInFile(JSONObject obj, String filePath){
        try{
            PrintWriter pw = new PrintWriter(filePath);
            pw.write(obj.toJSONString());

            pw.flush();
            pw.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    /**
     * Reads from a Json file when provided the path
     * @return  None
     */
    public static void ReadJsonFile(String filePath){
        try{
            FileReader file = new FileReader(filePath);

            Object obj = new JSONParser().parse(file);

            // typecasting obj to JSONObject
            JSONObject jsonObj = (JSONObject) obj;

            // getting firstName and lastName
            String name = (String) jsonObj.get("name");
            String age = (String) jsonObj.get("age");

            System.out.println("name: "+name);
            System.out.println("age: "+age);
        }
        catch (Exception e){
            e.getStackTrace();
        }

    }
}
