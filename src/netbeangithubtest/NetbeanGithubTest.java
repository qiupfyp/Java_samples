/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeangithubtest;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;


public class NetbeanGithubTest {
     public static void main(String[] args) {
      System.out.println("Hell,World");
      getFruits();
      
    }
    
     public static void getFruits()
     {
      List<String> fruits =Arrays.asList("Durian", "Banana","Rambutan", "Mango", "Jack Fruit", "Longgan");
      fruits.stream()
                .sorted()
                .forEach(System.out::println);
     }
}
