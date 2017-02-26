package com.bsoft.test;

import com.bsoft.domain.GyYgdm;

public class Test {
	public static void main(String args[]) {
		GyYgdm gyYgdm = new GyYgdm();
		gyYgdm.setBzxx("111");
		System.out.println(gyYgdm);
		gyYgdm = new GyYgdm();
		gyYgdm.setBzxx("11111");
		System.out.println(gyYgdm);
	}
	
}
