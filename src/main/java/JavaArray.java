//
// import java.util.Arrays;
//
// public class JavaArray {
//     public static void main(String[] args) {
//         // 数组大小
//         int size = 10;
//         // 定义数组
//         double[] myList = new double[size];
//
//         myList[0] = 5.6;
//         myList[1] = 4.5;
//         myList[2] = 3.3;
//         myList[3] = 13.2;
//         myList[4] = 4.0;
//         myList[5] = 34.33;
//         myList[6] = 34.0;
//         myList[7] = 45.45;
//         myList[8] = 99.993;
//         myList[9] = 11123;
//         // 计算所有元素的总和
//         System.out.println(myList);
//         Arrays.sort(myList);
//         System.out.println(myList);
//         double total = 0;
//         for (int i = 0; i < size; i++) {
//             total += myList[i];
//         }
//         System.out.println("总和为： " + total);
//     }
// }


// 数组排序
// import java.util.Arrays;
//
// public class JavaArray {
//     public static void main(String[] args) {
//         int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
//         Arrays.sort(ns);
//         System.out.println(Arrays.toString(ns));
//     }
// }

// 多维数组

public class JavaArray {
    public static void main(String[] args) {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(ns.length); // 3
    }
}
