package com.nt.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ConcurrentModificationException {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (String item : list) {
            if (item.equals("Two")) {
                list.remove(item); // 🚨 Modifying the list while iterating
            }
        }
    }

}
