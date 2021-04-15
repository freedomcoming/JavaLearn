// 引入 LinkedList 类
//与 ArrayList 相比，LinkedList 的增加和删除对操作效率更高，而查找和修改的操作效率较低。
//
//        以下情况使用 ArrayList :
//
//        频繁访问列表中的某一个元素。
//        只需要在列表末尾进行添加和删除元素操作。
//        以下情况使用 LinkedList :
//
//        你需要通过循环迭代来访问列表中的某些元素。
//        需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
//        LinkedList 继承了 AbstractSequentialList 类。
//
//        LinkedList 实现了 Queue 接口，可作为队列使用。
//
//        LinkedList 实现了 List 接口，可进行列表的相关操作。
//
//        LinkedList 实现了 Deque 接口，可作为队列使用。
//
//        LinkedList 实现了 Cloneable 接口，可实现克隆。
//
//        LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        // addlast 尾部添加
        sites.addLast("wiki2");
        // removeFirst 移除头部
        // removeLast 移除尾部
        System.out.println(sites);
    }
}