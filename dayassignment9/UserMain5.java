package com.te.dayassignment9;

import java.util.HashMap;
import java.util.Map;

public class UserMain5 {
	static Map<String,String> getStateId(String[]st)
	{
		Map<String,String>map=new HashMap();
		String[] st1=new String[st.length];
		for (int i = 0; i < st1.length; i++) {
			st1[i]=st[i].substring(0,3).toUpperCase();
		}
		for (int i = 0; i < st1.length; i++) {
			map.put(st[i], st1[i]);
		}
		return map;
		
	}

}
