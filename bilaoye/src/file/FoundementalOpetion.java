package file;

import java.io.File;
import java.io.IOException;

public class FoundementalOpetion {

    public static void main(String[] args) throws IOException {
       File file=new File("E:/ls/资料/java视频/java基础毕向东/01_毕向东Java基础班光碟高清完整拷贝版/毕向东Java基础视频教程光碟01/day24_字符流综合使用/IO流/11-IO流-字符流-字节流读取字符的问题");
       /* boolean b=file.createNewFile();
       System.out.println(b);
       boolean c=file.delete();
       System.out.println(c);
      */
      /* boolean b=file.mkdirs();
       System.out.println(b);*/
       /*System.out.println(file.isFile());
       System.out.println(file.isDirectory());*/
       String[]a=file.list();
       for (String string : a) {
        System.out.println(string);
    }
       File[]files=file.listFiles();
       for (int j = 0; j < files.length; j++) {
          System.out.println(files[j].getAbsolutePath());
       }
    }

}
