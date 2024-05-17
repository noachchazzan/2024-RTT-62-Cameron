package IOfiles;
import java.util.*;
import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) throws Exception{
        try {
            File output = new File("output.txt");
            FileWriter fileWriter = new FileWriter(output, true);

            fileWriter.write("This is my first setnencer writting to a file.\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File input = new File("output.txt");
        FileReader reader = new FileReader(input);
        BufferedReader br = new BufferedReader(reader);

        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
    }
}
