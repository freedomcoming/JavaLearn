package com.cry;
import java.lang.reflect.Field;
interface I1 {
}
interface I2 {
}
class Cell{
    public int mCellPublic;
}
class Animal extends  Cell{
    private int mAnimalPrivate;
    protected int mAnimalProtected;
    int mAnimalDefault;
    public int mAnimalPublic;
    private static int sAnimalPrivate;
    protected static int sAnimalProtected;
    static int sAnimalDefault;
    public static int sAnimalPublic;
}
class Dog extends Animal implements I1, I2 {
    private int mDogPrivate;
    public int mDogPublic;
    protected int mDogProtected;
    private int mDogDefault;
    private static int sDogPrivate;
    protected static int sDogProtected;
    static int sDogDefault;
    public static int sDogPublic;

    public  void sayHi(){
        System.out.println("say hello");
    }
}
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {



//        Class<Dog> dog = Dog.class;
        Class dog = Dog.class;
//        dog.newInstance()
        //类名打印
        System.out.println(dog.getName()); //com.cry.Dog
        System.out.println(dog.getSimpleName()); //Dog
        System.out.println(dog.getCanonicalName());//com.cry.Dog

        // forName

        System.out.println(Class.forName("com.cry.I1")); // interface com.cry.I1
        System.out.println(Class.forName("com.cry.Dog")); // class com.cry.Dog
        System.out.println(Class.forName("com.cry.Animal")); // class com.cry.Animal
        System.out.println(Class.forName("com.cry.Test")); // class com.cry.Test

        //接口
        System.out.println(dog.isInterface()); //false
        for (Class iI : dog.getInterfaces()) {
            System.out.println(iI);
        }
         /*
          interface com.cry.I1
          interface com.cry.I2
         */

        //父类
        System.out.println(dog.getSuperclass());//class com.cry.Animal
        //创建对象
        Dog d = (Dog) dog.newInstance();
        d.mAnimalDefault = 1;
        d.sayHi();

        Dog d2 = (Dog) Class.forName("com.cry.Dog").newInstance();

        d2.sayHi();


        System.out.println(d.mAnimalDefault);
        //字段
        for (Field f : dog.getFields()) {
            System.out.println(f.getName());
        }
        /*
            mDogPublic
            sDogPublic
            mAnimalPublic
            sAnimalPublic
            mCellPublic  //父类的父类的公共字段也打印出来了
         */
        // test
        System.out.println("---------");
        for (Field f : dog.getDeclaredFields()) {
            System.out.println(f.getName());
        }
        /** 只有自己类声明的字段
         mDogPrivate
         mDogPublic
         mDogProtected
         mDogDefault
         sDogPrivate
         sDogProtected
         sDogDefault
         sDogPublic
         */
    }
}
