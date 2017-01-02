package com.jay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {



		   public static void main(String[] args) {
			   
			   String [][] flights= new String [][] {{"BOM","CAL"},{"BAN","HYD"},{"HYD","DEL"},{"CAL","BAN"}};
			   
		      HashMap<String,String> mp=new HashMap();
		      mp.put("a", "1");
		      mp.put("a", "3");
		      mp.put("a", "4");
		      mp.put("b", "5");
		      
		      for(int i =0; i<flights.length-1 ; i++)
		      {
		    	  for(int j =0; j<i ; j++)
			      {
//		    		  mp.put(flights[i][j], flights[i][j]);
		    		  if( flights[i][j].equals(flights[j][i]) == true)
		    		  {
		    			  mp.put(flights[i][j], flights[i][j]);
		    		  }else
		    			  System.out.println("Unique flights : " + flights[i][j]);
//		    			  mp.put(flights[i][j], flights[i][j]);
			      }
			    	  
		      }
		      
		      
		      
		      System.out.println("--Printing Key Set ");

		      Set set = mp.keySet();
		      Iterator i = set.iterator();
		      while(i.hasNext()) {
		         Map.Entry me = (Map.Entry)i.next();
		         System.out.println(me.getKey()+": value :"+me.getValue());
		         
//		         for(int j=0;j<mp.size();j++)
//		         {
//		          System.out.println(me.getKey()+": value :"+mp.get(j));
//		         }
		      }
		   }
		
}
