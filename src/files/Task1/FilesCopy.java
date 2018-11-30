package files.Task1;

import java.io.*;

public class FilesCopy{

    public static void filesCopy(File in, File out) throws IOException{
        DocFileFilter filter = new DocFileFilter();
        File[] files = in.listFiles(filter);
        for (int i = 0; i <files.length ; i++) {
            try (FileInputStream fis = new FileInputStream(files[i]);
                 FileOutputStream fos = new FileOutputStream(out + "/" + files[i].getName())) {
                byte[] buffer = new byte[1024];
                int byteRead = 0;
                for (; (byteRead = fis.read(buffer)) > 0; ) {
                    fos.write(buffer, 0, byteRead);
                }
            } catch (IOException e){
                throw e;
            }
        }
    }
}
