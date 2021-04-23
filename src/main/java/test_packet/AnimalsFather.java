package test_packet;

public class AnimalsFather {
    private String name;
    private int id;

    public AnimalsFather(String myName, int animalId) {
        name = myName;
        id = animalId;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void eat(int id) {
        System.out.println(name + "正在吃"+id);
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}
