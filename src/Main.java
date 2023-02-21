import fileio.FileIO;
import  jsonfileio.JSONFileIO;

// importing from 3rd party (JSON Operations)
import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) {

        String filePathJson = "sample.json";
        String filePathTxt = "sample.txt";

        String data = "Text to be inserted:1234\nOLD\nNEW LINE";
        String newData = "NEW";


        //Creating a new file
        FileIO.createFile(filePathTxt);

        //Writing in a Text File
        FileIO.writeOrAppendInFile(filePathTxt,data,false);

        //Reading from a Text File
        FileIO.readFile(filePathTxt);

        //Update by line
        FileIO.updateLineInFile(filePathTxt,newData,1);

        //Deleting File
        FileIO.deleteAFile(filePathTxt);

        //JSON Operation

        //Creating a sample JSON Object
//        JSONObject obj = new JSONObject();
//
//        obj.put("name", "Shubh");
//        obj.put("age", "25");

        //Writing JSON in the file
//        JSONFileIO.writeJsonInFile(obj,filePathJson);

        //Reading JSON File
//        JSONFileIO.ReadJsonFile(filePathJson);


    }
}