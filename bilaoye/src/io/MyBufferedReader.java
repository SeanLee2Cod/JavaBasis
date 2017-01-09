package io;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    //��Ҫһ���ַ��������Ӳ���϶�ȡ����
    private Reader r;
    //����һ�������ַ�����
    char[]bufferArray=new char[1024];
    //�����ڵ���read()����ʱ��ȡ����С��λ��һ���ַ������漰���Ի��������ĳ���Ǳ��ֵ�Ĳ���
    int index;
    //������һ�����������ڼ�¼��������ʣ����ַ���
    int count;
    //���幹�캯������ȡ������
    public MyBufferedReader(Reader r){
        this.r=r;
    }
    //����read����������һ�ζ�һ���ַ�
    public int read() throws IOException{
        //�жϻ��������Ƿ�������
        if(count==0){
            //�����������read(char[])��������Ӳ���϶�ȡ����
            count=r.read(bufferArray);
            //��ͷ��ʼ��ȡ����
            index=0;
        }
        //Ӳ���ļ����Ѿ�û�����ݿɶ�
        if(count==-1){
            return  -1;
        }
        else{
            char cha=bufferArray[index++];
            //�������е�δ�������ݼ���һ��
            count--;
            return cha;
        }
        
    }
   /*
    *һ�ζ�ȡ�ļ��е�һ������ 
    */
    public String readline() throws IOException{
        StringBuilder sb=new StringBuilder();
        int temp;
        while((temp=this.read())!=-1){
            if(temp=='\r'){
                continue;
            }
            if(temp=='\n'){
                return sb.toString();
            }
            sb.append((char)temp);
        }
        //���ǵ�����ÿһ���ı��ĵ������Ի��з����������Զ��������ܻ��в��������һ���ַ���
       if(sb.length()!=0)
           return sb.toString();
        return null;
    }
    public void close() throws IOException{
        r.close();
    }
}
