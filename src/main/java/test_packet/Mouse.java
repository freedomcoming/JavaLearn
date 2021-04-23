package test_packet;

public class Mouse extends AnimalsFather {
    public Mouse(String myName, int animalId) {
        super(myName, animalId);
    }

    public static void main(String[] args) {
        Mouse m = new Mouse("mm", 1);
        m.eat();
        m.eat(10);
        m.sleep();
        m.introduction();
    }
}
