package T_type;

class Point<T>{         // 此处可以随便写标识符号，T是type的简称
    private T var ;     // var的类型由T指定，即：由外部指定
    public T getVar(){  // 返回值的类型由外部决定
        return var ;
    }
    public void setVar(T var){  // 设置的类型也由外部决定
        this.var = var ;
    }
}
public class GenericsClass{
    public static void main(String args[]){
        Point<String> p = new Point<>() ;     // 里面的var类型为String类型
        p.setVar("it1") ;                            // 设置字符串
        System.out.println(p.getVar().length()) ;   // 取得字符串的长度

//        int 类型

        Point<Integer> p2 = new Point<>();
        p2.setVar(100);
        System.out.println(p2.getVar());

    }
}

