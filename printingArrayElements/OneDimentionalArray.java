package printingArrayElements;

public class OneDimentionalArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

//        Using foEach loop
        for (int element: array) {
            System.out.println(element);
        }

//        Using for loop
        for(int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
    }
}
