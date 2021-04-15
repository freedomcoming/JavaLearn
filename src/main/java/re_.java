import java.util.regex.Matcher;
import java.util.regex.Pattern;

class re_ {
    public static void main(String[] args) {
        String content = "I am noob " +
                "from noob.com.";

        String pattern = ".*runoob.*";

        // 也可以先 Pattern.compile 编译好

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'noob' 子字符串? " + isMatch);


        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex)); // true
        System.out.println("2100".matches(regex)); // false


        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            System.out.println(g1);
            System.out.println(g2);
        } else {
            System.out.println("匹配失败!");
        }

        /* 贪婪匹配和非贪婪
        Pattern pattern = Pattern.compile("(\\d+)(0*)");
        Matcher matcher = pattern.matcher("1230000");
        if (matcher.matches()) {
            System.out.println("group1=" + matcher.group(1)); // "1230000"
            System.out.println("group2=" + matcher.group(2)); // ""
        }
         */


    }
}