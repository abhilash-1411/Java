class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array
        System.out.println("Element at (0, 0): " + matrix[0][0]);
        System.out.println("Element at (1, 1): " + matrix[1][1]);
        System.out.println("Element at (2, 2): " + matrix[2][2]);

        // Modify an element in the 2D array
        matrix[1][1] = 100;
        System.out.println("Modified element at (1, 1): " + matrix[1][1]);

        // Print the entire 2D array
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

          //jagged array example
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};
        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {      
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        //#-- Example of a 3D array
        int[][][] threeDArray = new int[2][2][2];
        threeDArray[0][0][0] = 1;
        threeDArray[0][0][1] = 2;
        threeDArray[0][1][0] = 3;
        threeDArray[0][1][1] = 4;
        threeDArray[1][0][0] = 5;
        threeDArray[1][0][1] = 6;
        threeDArray[1][1][0] = 7;
        threeDArray[1][1][1] = 8;
        
        System.out.println("3D Array elements:");

        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
// This code demonstrates the creation and manipulation of a multi-dimensional array in Java.