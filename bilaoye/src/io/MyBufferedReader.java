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
    public char read() throws IOException{
        //�жϻ��������Ƿ�������
        if(count==0){
            //�����������read(char[])��������Ӳ���϶�ȡ����
            count=r.read(bufferArray);
            //��ͷ��ʼ��ȡ����
            index=0;
        }
        //Ӳ���ļ����Ѿ�û�����ݿɶ�
        if(count==-1){
            return (char) -1;
        }
        else{
            char cha=bufferArray[index++];
            //�������е�δ�������ݼ���һ��
            count--;
            return cha;
        }
        
    }
    
    
    
    
    
    
}
