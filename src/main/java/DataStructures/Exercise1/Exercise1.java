package DataStructures.Exercise1;

public class Exercise1 {

    public int[][] Solution(int times, int[][] matrix){

        for(int i = 0; i < times%4; i++){
            matrix = rotateMatrixLeft(matrix);
        }

        return matrix;
    }

    public int[][] rotateMatrixLeft(int[][] matrix){

        int arrayLength = matrix.length - 1;
        int halfOfArrayLength = arrayLength / 2;
        int remainderHalfArrayLength = arrayLength % 2;

        for (int i = halfOfArrayLength; i >= 0; i--) {
            for (int j = halfOfArrayLength - i; j < halfOfArrayLength + i + remainderHalfArrayLength; j++) {
                //swapping j'th corners
                int temp = matrix[halfOfArrayLength - i][j];
                matrix[halfOfArrayLength - i][j] = matrix[j][arrayLength - halfOfArrayLength + i];
                matrix[j][arrayLength - halfOfArrayLength + i] = matrix[arrayLength - halfOfArrayLength + i][arrayLength - j];
                matrix[arrayLength - halfOfArrayLength + i][arrayLength - j] = matrix[arrayLength - j][halfOfArrayLength - i];
                matrix[arrayLength - j][halfOfArrayLength - i] = temp;
            }
        }

        return matrix;

        //Big O notation is = 4*n/2*n%2 = 4n
    }
}
