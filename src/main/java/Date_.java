//import java.util.Date;
//
//public class Date_ {
//    public static void main(String args[]) {
//        // 初始化 Date 对象
//        Date date = new Date();
//
//        // 使用 toString() 函数显示日期时间
//        System.out.println(date.toString());
//    }
//}

// 日期格式化

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String args[]) {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(ft);
        System.out.println("当前时间为: " + ft.format(dNow));
    }
}


/*

public class Main {
    public static void main(String[] args) {
        // 获取当前时间:
        Date date = new Date();
        System.out.println(date.getYear() + 1900); // 必须加上1900
        System.out.println(date.getMonth() + 1); // 0~11，必须加上1
        System.out.println(date.getDate()); // 1~31，不能加1
        // 转换为String:
        System.out.println(date.toString());
        // 转换为GMT时区:
        System.out.println(date.toGMTString());
        // 转换为本地时区:
        System.out.println(date.toLocaleString());
    }
}
 */