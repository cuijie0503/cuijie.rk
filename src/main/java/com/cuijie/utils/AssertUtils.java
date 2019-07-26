package com.cuijie.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class AssertUtils {
	/**
	 * 
	 * @Title: isTrue
	 * @Description: 断言为真
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isTrue(boolean exp, String message) {

		if (!exp) {

			throw new CMSException(message);

		}

	}

	/**
	 * 
	 * @Title: isFalse
	 * @Description: 断言为假
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean exp, String message) {
		if (exp) {
			throw new CMSException(message);
		}

	}

	/**
	 * 
	 * @Title: isNotNull
	 * @Description: 断言不为空
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNotNull(Object obj, String message) {
		if (obj == null) {
			throw new CMSException(message);
		}
	}

	/**
	 * 
	 * @Title: isNull
	 * @Description: 断言为空
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj, String message) {
		if (obj != null) {
			throw new CMSException(message);
		}
	}

	/**
	 * 
	 * @Title: isNotEmpty
	 * @Description: 断言 List 或 Set 集合不为空，没有元素也算空；
	 * @param c
	 * @param message
	 * @return: void
	 */
	public static void isNotEmpty(Collection c, String message) {
		if (c == null || c.size() == 0) {
			throw new CMSException(message);
		}
	}

	/**
	 * 
	 * @Title: isEmpty
	 * @Description: /**断言 Map 集合不为空，没有元素也算空；
	 * @param map
	 * @param message
	 * @return: void
	 */
	public static void isEmpty(Map map, String message) {
		if (map.isEmpty() || map == null) {
			throw new CMSException(message);
		}

	}

	/**
	 * 
	 * @Title: hasText
	 * @Description: 断言字符串必须有值，去掉空格后，长度必须大于 0
	 * @param str
	 * @param message
	 * @return: void
	 */
	public static void hasText(String str, String message) {
		if (str == null || str.trim().length() <= 0) {
			throw new CMSException(message);
		}
	}

	/**
	 * 
	 * @Title: isPost
	 * @Description: 断言值必须是正数(值大于 0)；
	 * @param exp
	 * @param message
	 * @return: void
	 */
	/*
	 * public static void isPost(boolean exp,String message) { if(!exp) { throw new
	 * CMSException(message);
	 * 
	 * } }
	 */

	public static void isPost(String str, String message) {

		if ((Integer.valueOf(str) <= 0)) {
			throw new CMSException(message);

		}
	}
}
