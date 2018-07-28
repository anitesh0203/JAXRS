package com.leet;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
       int nn=0;
    int n=1;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      //System.out.println(s);
      
      
    }
    
    int stairs=Integer.parseInt(s);
   
    for(int i=0;i<stairs;i++)
    {
        int temp=nn+n;
        nn=n;
        n=temp;
    }
          System.out.println(n);

  }
}
