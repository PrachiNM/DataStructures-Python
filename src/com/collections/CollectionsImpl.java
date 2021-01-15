package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsImpl {
    public static void main(String[] args) {
        String[] array = new String[]{"abc", "2", "10", "Abc", "1"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list);
        System.out.println(list);
        list.addAll(Arrays.asList(array));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
