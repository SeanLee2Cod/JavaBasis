package file;

import java.io.File;
import java.io.IOException;

public class FoundementalOpetion {

    public static void main(String[] args) throws IOException {
       File file=new File("E:/ls/����/java��Ƶ/java��������/01_����Java����������������������/����Java������Ƶ�̳̹��01/day24_�ַ����ۺ�ʹ��/IO��/11-IO��-�ַ���-�ֽ�����ȡ�ַ�������");
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
