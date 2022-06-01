package com.te.dayassignment9;

import java.util.Iterator;
import java.util.Map;

public class UserMain1 {

	public static String getMaxKeyValue(Map<Integer, String> map) {
		
	    Iterator<Integer> itr=map.keySet().iterator();
	    int temp=0;
	    while(itr.hasNext()) {
		
	    	int key=itr.next();
	    	if(temp<key) {
	    		temp=key;
	    	}
	}
	    String value=map.get(temp);
	    return value;
	
}
}
