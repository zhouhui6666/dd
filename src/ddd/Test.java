package ddd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
		 List<String> names1 = new ArrayList<String>();
	      names1.add("Google ");
	      names1.add("Runoob ");
	      names1.add("Taobao ");
	      names1.add("Baidu ");
	      names1.add("Sina ");
	        
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Google ");
	      names2.add("Runoob ");
	      names2.add("Taobao ");
	      names2.add("Baidu ");
	      names2.add("Sina ");
	        
	      Java8Tester tester = new Java8Tester();
	      System.out.println("ʹ�� Java 7 �﷨: ");
	        
	      tester.sortUsingJava7(names1);
	      System.out.println(names1);
	      System.out.println("ʹ�� Java 8 �﷨: ");
	        
	      tester.sortUsingJava8(names2);
	      System.out.println(names2);
	   }
	   
	 
		}
