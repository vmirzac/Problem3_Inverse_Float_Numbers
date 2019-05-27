import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//Given an array of floating point numbers, inverse the elements of the array

public class Inverse_Float_Numbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Float> array = new ArrayList<Float>();

        System.out.println("Please enter an array of float numbers, type in 0 when finished");
        float test = reader.nextFloat();

        while(test != 0){
            array.add(test);
            test = reader.nextFloat();
        }

        System.out.println("Before Reverse Order: " + array);
        Collections.reverse(array);
        System.out.println("After Reverse Order: " + array);
    }
}
