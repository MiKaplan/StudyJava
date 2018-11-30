package files.Task1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File in = new File("src/files/Task1/Files1/");
        File out = new File("src/files/Task1/Files2/");
        try {
            FilesCopy.filesCopy(in, out);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
