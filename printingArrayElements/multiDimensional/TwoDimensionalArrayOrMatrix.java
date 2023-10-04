package printingArrayElements.multiDimensional;

public class TwoDimensionalArrayOrMatrix {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {5,6,7,8}};

//        Using foEach loop
        for(int[] x: arr) {
            for(int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println("----------");

//        Using for loop

        int[][] arr2 = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for(int x = 0; x < arr2.length; x++) {
            for(int y = 0; y < arr2[x].length; y++) {
                System.out.print(arr2[x][y] + " ");
            }
            System.out.println();
        }



        int[][] twoDArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println("----------");

        // Iterate through the columns (outer loop)
        for (int j = 0; j < twoDArray[0].length; j++) {
            // Iterate through the rows (inner loop)
            for (int i = 0; i < twoDArray.length; i++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each column
        }

    }
}
