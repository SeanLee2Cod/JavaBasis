package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException  {
      File file=new File("E:\\ls\\xiaolee.txt");
      FileInputStream fis=null;
      try {
         fis=new FileInputStream(file);
         
         int ch=0;
         while((ch=fis.read())!=-1){
           System.out.print((char)ch);
         }
         System.out.println();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        fis.close();
      } catch (IOException e) {
          e.printStackTrace();
      }  
    FileInputStream fis2=null;
     fis2=new FileInputStream(file);
    byte[] buf=new byte[2];
    int len=0;
    while((len=fis2.read(buf))!=-1){
        System.out.print(new String(buf,0,len));
    }
    fis2.close();
    }

}
