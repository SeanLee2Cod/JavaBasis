package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest {

    private static final String LINE_SEPERATOR = System.lineSeparator();

    public static void main(String[] args)  {
       File file=new File("E:\\ls\\xiaolee.txt");
       FileOutputStream fos=null;
    try {
        fos = new FileOutputStream(file);
       byte[]b="I am a college student!".getBytes();
        if(fos!=null)
        fos.write(b);
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
       try {
        if(fos!=null)
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    FileOutputStream fos2=null;
    try {
         fos2=new FileOutputStream(file,true);
         String str=LINE_SEPERATOR+"I work hard in my major!";
         fos2.write(str.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        try {
            if(fos!=null)
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
  }
}
