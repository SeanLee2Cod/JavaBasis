package io;

public class CutStringByByte {

    public static void main(String[] args) {
      String str="sqd��ð�java";
      byte[] st=str.getBytes();
      for (int i = 1; i <=st.length; i++) {
          String cutStr=cutString(str,i);
          System.out.println("�ַ�������"+i+"���ֽں�Ϊ��"+cutStr);
    }
    }

    public static String cutString(String str, int i) {
        int count=0;
        int len=i;
        byte[]strByte=str.getBytes();
        for (int j = i-1; j>0; j--) {
            if(strByte[j]<0){
                count++;
            }
        }
        if(count%2==0){
          return new String(strByte,0,len);
        }else{
          return new String(strByte,0,len-1);
         }
    }

}
