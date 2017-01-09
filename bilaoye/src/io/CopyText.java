package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {

    public static void main(String[] args) {
        BufferedReader bfr=null;
        BufferedWriter bfw=null;
        try {
         bfr=new BufferedReader(new FileReader("tempfile/abc_copy.txt"));
         bfw=new BufferedWriter(new FileWriter("tempfile/copyText.txt"));
         String str=null;
         while((str=bfr.readLine())!=null){
           str=str.replace("NBA", "美国篮球职业联盟");
           bfw.write(str);
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
