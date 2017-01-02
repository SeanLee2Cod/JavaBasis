package file;

import java.io.File;
import java.util.LinkedList;


public class QueueTraversalFileTest {

    public static void main(String[] args) {
    File file=new File("E:\\");
    Queue<File> queue=new Queue<File>();
    listAllFiles(file,  queue);
    }

    public static void listAllFiles(File file, Queue<File> queue) {
      File[] files=file.listFiles(new FileTypeFilter());
      if(files!=null){
          for (File file2 : files) {
            if(file2.exists()){
                if(file2.isDirectory())  queue.enQueue(file2);
                else
                    System.out.println(file2.getName());
            }
        }
        while(!queue.isEmpty()){
          File subdir=queue.deQueue();
          File[] sundirs=subdir.listFiles(new FileTypeFilter());
          if(sundirs!=null){
              for (File file2 : sundirs) {
                if(file2.exists()){
                    if(file2.isDirectory())  queue.enQueue(file2);
                    else
                        System.out.println(file2.getName());
                }
            
        }
      }
    }

}
}
}

class Queue<E>{
    private LinkedList<E> link;
    public Queue(){
        link=new LinkedList<>();
    }
    public void enQueue(E e){
        link.addFirst(e);
    }
    
    public E deQueue(){
      return link.removeLast();  
    }
    
    public int size(){
       return link.size();
    }

    public boolean isEmpty(){
        return link.isEmpty();
    }
}
