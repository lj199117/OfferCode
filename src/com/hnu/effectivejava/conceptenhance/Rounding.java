package com.hnu.effectivejava.conceptenhance;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a = new BigDecimal("2.485");
		System.out.println(a.setScale(2, RoundingMode.HALF_UP));
		BigDecimal b = new BigDecimal(2.485);
		System.out.println(b.setScale(2, RoundingMode.HALF_UP));
		BigDecimal c = new BigDecimal(2.4851);
		System.out.println(c.setScale(2, RoundingMode.HALF_UP));
	}

}
