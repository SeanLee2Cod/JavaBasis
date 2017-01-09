package io;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {

    public static void main(String[] args) {
        MyBufferedReader mbr=null;
        try {
         mbr=new MyBufferedReader(new FileReader("tempfile/day25.txt"));
         String str;
         while((str=mbr.readline())!=null){
           System.out.println(str);  
         }
    } catch (IOException e) {
        e.printStackTrace();
    } finally{
        if(mbr!=null){
            try {
                mbr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }

}
