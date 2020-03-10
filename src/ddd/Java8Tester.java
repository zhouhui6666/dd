package ddd;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Tester {
	  // 使用 java 7 排序
	   public void sortUsingJava7(List<String> names){   
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   // 使用 java 8 排序
	   public void sortUsingJava8(List<String> names){
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }
}
