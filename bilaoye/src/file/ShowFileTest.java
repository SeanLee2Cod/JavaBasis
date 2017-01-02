package file;

import java.io.File;

public class ShowFileTest {

    public static void main(String[] args){
      File file=new File("E:\\");
      showAllFile(file);
    }

    public static void showAllFile(File file) {
      File[]files=file.listFiles(/*new FileTypeFilter()*/); 
      if(files!=null){
      for (File file2 : files) {
        if(file2.exists()){
        if(file2.isDirectory())   showAllFile(file2);
        else
        {   
            if(file2.getName().endsWith(".avi"))
            System.out.println(file2.getName());
        }   
        }
       }
      }
    }

}
