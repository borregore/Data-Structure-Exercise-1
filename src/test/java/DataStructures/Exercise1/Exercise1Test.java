package DataStructures.Exercise1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {

    @Test
    public void testSolution(){
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] output = {{3,6,9},{2,5,8},{1,4,7}};
        int[][] output2 = {{4,8,12,16},{3,7,11,15},{2,6,10,14},{1,5,9,13}};

        Exercise1 exercise = new Exercise1();

        Assert.assertArrayEquals(output,exercise.Solution(5,array));
        Assert.assertArrayEquals(output2,exercise.Solution(1,array2));
    }

    @Test
    public void testRotateMatrixLeft(){
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] output = {{3,6,9},{2,5,8},{1,4,7}};
        int[][] output2 = {{4,8,12,16},{3,7,11,15},{2,6,10,14},{1,5,9,13}};

        Exercise1 exercise = new Exercise1();

        Assert.assertArrayEquals(output, exercise.rotateMatrixLeft(array));
        Assert.assertArrayEquals(output2, exercise.rotateMatrixLeft(array2));

    }

}