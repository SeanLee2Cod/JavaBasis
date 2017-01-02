package file;

import java.io.File;
import java.io.FileFilter;

public class FileTypeFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory()||pathname.getName().endsWith(".avi");
    }

}
