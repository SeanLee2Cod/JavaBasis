package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiletest {

    public static void main(String[] args) {
        FileInputStream srcFile=null;
        FileOutputStream outFile=null;
        try {
         srcFile=new FileInputStream("E:ls/资料/java视频/java基础毕向东/毕向东_Java基础课堂笔记Java_Note.pdf");
         outFile=new FileOutputStream("E:ls/资料/java视频/java基础毕向东/Copy_毕向东_Java基础课堂笔记Java_Note.pdf");
        byte[]b=new byte[512];
        int len=0;
        while((len=srcFile.read(b))!=-1){
            outFile.write(b,0,len);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        try {
            srcFile.close();
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      
    }

}
