package com.afd.taglib;

import org.apache.commons.lang.ArrayUtils;

import com.afd.common.util.RandomUtils;

public class MyFunctionTag {
	public static String random(String[] arr) {
		return ArrayUtils.isEmpty(arr) ? null : arr[RandomUtils.randomInt(0,
				arr.length - 1)];
	}
}
