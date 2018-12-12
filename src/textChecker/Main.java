package textChecker;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("e:\\Java\\text.txt");
            TextChecker.ReadText(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
