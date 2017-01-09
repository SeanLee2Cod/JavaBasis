package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyToText {

    public static void main(String[] args) {
      BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bfw=null;
      try {
        bfw=new BufferedWriter(new FileWriter("tempfile/keyToText.txt"));
        String len=null;
        while((len=bfr.readLine())!=null){
            if(len.equals("over")) break;
            bfw.write(len);
            bfw.newLine();
            bfw.flush();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        if(bfr!=null){
            try {
                bfr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
