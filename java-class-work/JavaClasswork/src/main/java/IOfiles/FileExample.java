package IOfiles;
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Learner_9ZH3Z113\\Desktop\\2024-RTT-62-Cameron\\java-class-work\\JavaClasswork\\src\\main\\java\\IOfiles\\file1.java");
        if (file.exists()){
            System.out.println(1);
        }

        file.createNewFile();
    }
/* File: This class represents a file on the filesystem.
FileInputStream: This class is used to read data from a file.
FileOutputStream: This class is used to write data to a file.
RandomAccessFile: This class is used to read and write data to a file in a random order.

InputStream: This class is used to read data from a stream.
OutputStream: This class is used to write data to a stream.
FileReader: This class is used to read data from a file.
FileWriter: This class is used to write data to a file.
BufferedReader: This class is used to read data from a character-input stream.
BufferedWriter: This class is used to write data to a character-output stream.
PrintWriter: This class is used to print formatted output to a stream.
 */
}
