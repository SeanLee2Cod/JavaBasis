package io;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    //需要一个字符流对象从硬盘上读取数据
    private Reader r;
    //定义一个缓冲字符数组
    char[]bufferArray=new char[1024];
    //由于在调用read()方法时读取的最小单位是一个字符，就涉及到对缓冲数组的某个角标的值的操作
    int index;
    //定义另一个整型数用于记录缓冲区内剩余的字符数
    int count;
    //定义构造函数，获取流对象
    public MyBufferedReader(Reader r){
        this.r=r;
    }
    //定义read（）方法，一次读一个字符
    public char read() throws IOException{
        //判断缓冲区中是否还有数据
        if(count==0){
            //调用流对象的read(char[])方法，从硬盘上读取数据
            count=r.read(bufferArray);
            //从头开始读取数据
            index=0;
        }
        //硬盘文件中已经没有数据可读
        if(count==-1){
            return (char) -1;
        }
        else{
            char cha=bufferArray[index++];
            //缓冲区中的未读的数据减少一个
            count--;
            return cha;
        }
        
    }
    
    
    
    
    
    
}
