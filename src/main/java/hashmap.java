import java.util.HashMap;
/*
@author wxw
*/

public class hashmap {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Noob");
        Sites.put(3, "Taboo");
        Sites.put(4, "Zhihan");
        System.out.println(Sites.hashCode());
        System.out.println(Sites);
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for (String value : Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
}