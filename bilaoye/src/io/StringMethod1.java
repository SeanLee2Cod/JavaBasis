package io;

public class StringMethod1 {

    public static void main(String[] args) {
     String str="23 9 -4 18 100 7";
     String[] strs=str.split(" ");
     int[] a=new int[strs.length];
     StringBuilder sb=new StringBuilder();
     for (int i = 0; i < a.length; i++) {
        a[i]=Integer.parseInt(strs[i]);
     }    
     for (int i = 0; i < a.length-1; i++) {
        for (int j = i+1; j < a.length; j++) {
            int temp=0;
            if(a[i]>a[j]){
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
        }
        }
        }
     for (int j = 0; j < a.length; j++) {
        sb.append(" ");
        sb.append(a[j]);
     }   
     System.out.println(sb.toString());
    }
    }

