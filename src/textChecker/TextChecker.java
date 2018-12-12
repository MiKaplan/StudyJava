package textChecker;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextChecker {
    public static void ReadText(File textFile)throws IOException{
        String text = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));

                text = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] charArray = text.toCharArray();
        Arrays.sort(charArray);

        Map<Character, Integer> charList = new HashMap<>();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j <charArray.length; j++) {
                if (charArray[i] == charArray[j]){
                    count++;
                    charList.put(charArray[i], count);
                } else {
                    count = 0;
                }
            }

        }
        System.out.println(charList);

    }
}
