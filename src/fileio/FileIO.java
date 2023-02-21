package fileio;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
     /**
     * Takes FilePath as Input and Writes in a File
     * @return  None
     */
    public static void createFile(String filePath){
        File file = new File(filePath);

        try {
            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }

    /**
     * Takes FilePath, data and Append File as Input
     * If appendFlag is True, it will append to new line or it will overwrite the file
     * @return  None
     */
    public static void writeOrAppendInFile(String filePath,String data,boolean appendFlag){
        try{
            FileWriter Writer = new FileWriter(filePath,appendFlag);
            Writer.write(data);
            Writer.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    /**
     * Takes FilePath as Input and Reads from a File
     * @return  None
     */
    public static void readFile(String filePath){
        try{
            File Obj = new File(filePath);

            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    /**
     * Takes FilePath as Input and Deletes it.
     * @return  None
     */
    public static void deleteAFile(String filePath){
        // creates a file object
        File file = new File(filePath);

        // deletes the file
        boolean value = file.delete();
        if(value) {
            System.out.println("The File is deleted.");
        }
        else {
            System.out.println("The File is not deleted.");
        }
    }

    /**
     * Takes FilePath, data and index as input and Updates at particular index
     * @return  None
     */
    public static void updateLineInFile(String filePath,String data,int index){
        try{
            File file = new File(filePath);

            Scanner dataReader = new Scanner(file);

            ArrayList<String> old_data =new ArrayList<>();

            while (dataReader.hasNextLine()) {
                old_data.add(dataReader.nextLine());
            }

            if(index<old_data.size())
            {
                old_data.set(index,data);
                StringBuilder newData = new StringBuilder();
                for(String i:old_data)
                {
                    newData.append(i+"\n");
                }
                FileWriter file_writer = new FileWriter(filePath);

                file_writer.write(String.valueOf(newData));
                file_writer.close();
            }
            else{
                System.out.println("Out of Range");
            }
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
