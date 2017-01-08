package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndReaderTest {

    public static void main(String[] args)  {
        BufferedReader br=null;
        BufferedWriter bw=null;
        try {
        br=new BufferedReader(new FileReader("tempfile\\bag.java"));
        bw=new BufferedWriter(new FileWriter("tempfile\\bag_copy.java"));
        String cha=null;
        while((cha=br.readLine())!=null){
            bw.write(cha);
            bw.newLine();
            bw.flush();
        }
        } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw!=null) {
              try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
          
    }

}
