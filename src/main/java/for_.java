//public class for_ {
//    public static void main(String args[]) {
////        int x = 10;
////        while (x < 20) {
////            System.out.print("value of x : " + x);
////            x++;
////            System.out.print("\n");
////        }
//
//
////        do {
////            System.out.print("value of x : " + x);
////            x++;
////            System.out.print("\n");
////        } while (x < 20);
//
//        for (int x = 10; x < 20; x++) {
//            System.out.print("value of x : " + x);
//            System.out.print("\n");
//        }
//    }
//}
//
//
//

public class for_ {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            // x 等于 30 时跳出循环
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
