//  我们已经知道，HashMap是一种以空间换时间的映射表，它的实现原理决定了内部的Key是无序的，即遍历HashMap的Key时，其顺序是不可预测的（但每个Key都会遍历一次且仅遍历一次）。
//
//  还有一种Map，它在内部会对Key进行排序，这种Map就是SortedMap。注意到SortedMap是接口，它的实现类是TreeMap。

import java.util.*;

public class tree_map {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
        // apple, orange, pear
    }
}
