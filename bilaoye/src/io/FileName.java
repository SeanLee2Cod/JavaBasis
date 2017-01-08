package io;

import java.io.File;

public class FileName {

    public static void main(String[] args) {
      File file=new File("E:/ls/×ÊÁÏ");
      File[] files=file.listFiles(new FileNameFilter());
      for (File file2 : files) {
        System.out.println(file2.getName());
    }
      
    }

}
