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

      
    }
}
// This code demonstrates the creation and manipulation of a multi-dimensional array in Java.