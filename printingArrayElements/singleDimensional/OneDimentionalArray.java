package printingArrayElements.singleDimensional;

import java.util.Arrays;

public class OneDimentionalArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

//        Using foEach loop
        for (int element: array) {
            System.out.println(element);
        }
        System.out.println("----------");

//        Using for loop
        for(int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------");

//        Using standard library Arrays
        System.out.println(Arrays.toString(array));
    }
}
