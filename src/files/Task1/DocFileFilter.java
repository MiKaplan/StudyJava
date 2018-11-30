package files.Task1;

import java.io.File;
import java.io.FileFilter;

public class DocFileFilter implements FileFilter {
    private String docx = "docx";

@Override
    public boolean accept(File pathname){
    int pointerIndex = pathname.getName().lastIndexOf(".");
    if (pointerIndex == -1){
        return false;
    }
    String ext = pathname.getName().substring(pointerIndex + 1).toLowerCase();
    return docx.equals(ext);
}
}
