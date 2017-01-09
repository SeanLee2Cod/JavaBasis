package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyKeyInputDemo {

    public static void main(String[] args) {
      BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bwr=null;
      try {
         bwr=new BufferedWriter(new FileWriter("tempfile/day26.txt"));
         /*String line=null;
         while((line=bfr.readLine())!=null){
             if(line.equals("over")){
                 break;
             }
             bwr.write(line);
             bwr.newLine();
             bwr.flush();
         }*/
         int read=0;
         while((read=bfr.read())!=-1){
             if((char)read=='0'){
                 break;
             }
             bwr.write((char)read);
             bwr.flush();
         }
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        if(bwr!=null){
            try {
                bwr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
      
    
    }

}
