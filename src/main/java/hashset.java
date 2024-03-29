/*
与 ArrayList 相比，LinkedList 的增加和删除对操作效率更高，而查找和修改的操作效率较低。

以下情况使用 ArrayList :

频繁访问列表中的某一个元素。
只需要在列表末尾进行添加和删除元素操作。
以下情况使用 LinkedList :

你需要通过循环迭代来访问列表中的某些元素。
需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
LinkedList 继承了 AbstractSequentialList 类。

LinkedList 实现了 Queue 接口，可作为队列使用。

LinkedList 实现了 List 接口，可进行列表的相关操作。

LinkedList 实现了 Deque 接口，可作为队列使用。

LinkedList 实现了 Cloneable 接口，可实现克隆。

LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。
 */
// 引入 HashSet 类

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加

        System.out.println(sites);
        System.out.println(sites instanceof Set);
        for(String s:sites){
            System.out.println(s);
        }
        System.out.println(sites.contains("Zhihu"));
    }
}
