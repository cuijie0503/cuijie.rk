package com.cuijie.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.cuijie.utils.AssertUtils;

public class AssertUtilsTest {

	@Test
	public void testIsTrue() {
		String s1="123";
		String s2="13";
		
		AssertUtils.isTrue(s1.equals(s2), "两次不一致");
		
	}

	@Test
	public void testIsFalse() {
		AssertUtils.isFalse(0>1, "这是真的");
	}

	@Test
	public void testIsNotNull() {
		AssertUtils.isNotNull(new String("123"), "为空");
	}

	@Test
	public void testIsNull() {
		
		AssertUtils.isNull(new String("123"), "不为空");
		
	}

	@Test
	public void testIsNotEmpty() {
		
		ArrayList<Object> list = new ArrayList<>();
		AssertUtils.isNotEmpty(list, "为空");
	}

	@Test
	public void testIsEmpty() {
		HashMap<Object,Object> map = new HashMap<>();
		
		AssertUtils.isEmpty(map, "为空");
	}

	@Test
	public void testHasText() {
		String string ="";
		AssertUtils.hasText(string, "为空字符串");
		
		
	}

	@Test
	public void testIsPost() {
		/*AssertUtils.isPost("1", "不是正整数");*/
		String  str="dsa";
		System.out.println(str.length());
}
	
	@Test
	public void testDouble () {
		double x=66.77;
		double y=100;
		System.out.println(x*y);
	
		BigDecimal b = new BigDecimal("66.77");
		BigDecimal b2 = new BigDecimal("100");
		System.out.println(b.multiply(b2));
		System.out.println(b.add(b2));
		System.out.println(b.divide(b2));
		System.out.println(b.subtract(b2));
	}

}
