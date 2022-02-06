import java.util.ArrayList;
import java.util.Collections;  // 引入 Collections 类

public class arrayList {
    public static void main(String[] args) {
//        E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
//        ArrayList<String> sites = new ArrayList<String>();

        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");


        for (String a : sites) {
            System.out.println(a);

        }

        System.out.println(sites.get(1));
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        // sites.remove(3); // 删除第四个元素
        sites.add(1,"test");
        System.out.println(sites);
        System.out.println(sites.size()); // 输出大小
        System.out.println(sites.indexOf("Google"));
        Collections.sort(sites);
        System.out.println(sites);
    }
}