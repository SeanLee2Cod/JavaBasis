package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StrToText {

    public static void main(String[] args) {
      String str="You are my destiny!";
      BufferedWriter bfw=null;
      try {
         bfw=new BufferedWriter(new FileWriter("tempfile/strToText.txt"));
         bfw.write(str);
         bfw.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        if(bfw!=null){
            try {
                bfw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
