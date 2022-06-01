package com.te.day7.p5;

import java.util.ArrayList;
import java.util.List;

public class UserCode5 {
	public static List arrayListSubtractor(ArrayList<Integer>ref,ArrayList<Integer>ref1) {
		List ref3=new ArrayList();
		ref3.addAll(ref);
		ref.removeAll(ref1);
		ref.removeAll(ref3);
		ref1.addAll(ref);
		return ref1;
	}

}
