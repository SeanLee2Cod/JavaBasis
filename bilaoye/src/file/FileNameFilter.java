package file;

import java.io.File;
import java.io.FileFilter;

public class FileNameFilter implements FileFilter {
    static long FILELENGTH=102400;
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }

}
