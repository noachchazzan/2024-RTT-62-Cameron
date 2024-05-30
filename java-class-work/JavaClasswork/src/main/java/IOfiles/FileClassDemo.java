package IOfiles;

import java.io. * ;
public class FileClassDemo {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Learner_9ZH3Z113\\Desktop\\2024-RTT-62-Cameron\\java-class-work\\JavaClasswork\\src\\main\\java\\IOfiles\\newfile.txt");
            if (f.createNewFile()) {
                System.out.println("New File created!");
            } else {
                System.out.println("The file already exists.");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
