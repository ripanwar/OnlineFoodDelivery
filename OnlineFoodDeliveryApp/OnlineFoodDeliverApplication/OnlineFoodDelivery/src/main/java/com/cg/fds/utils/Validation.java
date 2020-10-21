package com.cg.fds.utils;

import com.cg.fds.entities.Item;

public class Validation {
	public static void validateItem(Object item) {
		if(item==null) {
			throw new NullPointerException();
		}
	}

}
