
interface InterfaceStruct {
    void genetic_func();
    default void default_func(){
        System.out.println("default func");

    }

    static void static_func(){
        System.out.println("static func");
    }
}

public class InterfaceUse implements InterfaceStruct{
    public static void main(String[] args) {
        InterfaceStruct.static_func();
        InterfaceUse a = new InterfaceUse();
        a.default_func();
        a.genetic_func();

    }

    @Override
    public void genetic_func() {
        System.out.println("genetic func");
    }
}
