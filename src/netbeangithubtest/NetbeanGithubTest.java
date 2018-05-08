/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeangithubtest;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.*;
 
 


public class NetbeanGithubTest {
    public static Charset charset = Charset.forName("US-ASCII");
            
     public static void main(String[] args) {
      System.out.println("Hell, Dr. Noorul Hameed!");
      getFruits();
       
      System.out.println("ByteBuffer: "+ getContentString("This is ByteBuffer Demo call"));
    }
    
     public static void getFruits()
     {
      List<String> fruits =Arrays.asList("Durian", "Banana","Rambutan", "Mango", "Jack Fruit", "Longgan");
      fruits.stream()
                .sorted()
                .forEach(System.out::println);
     }
     
     public static String getContentString(String str)
     {
         String s;
        //default
        //ByteBuffer buf = ByteBuffer.wrap(str.getBytes());
         
        //allocateDirect - returns hasArray() false
       // ByteBuffer buf = ByteBuffer.allocateDirect(100);
        //buf.put(str.getBytes());
        //buf.position(0);
        
        //allocate() returns true 
         ByteBuffer buf = ByteBuffer.allocate(100);
         buf.put(str.getBytes());
         buf.position(0);
        
        
        if(buf.hasArray()){
        s= new String(buf.array(),charset);
        }else
            s="empty!";
        
        //second method
        CharBuffer cb = charset.decode(buf);
        System.out.println("CharBuffer: "+cb.toString());
        
        //3rd method
        buf.position(0);
        byte[] b = new byte[buf.remaining()];
        buf.get(b);
        String bs = new String(b,charset);
        System.out.println("ByteBuffer method 3: "+bs);
        
        return s;
     }
}
