package sevenKYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
public class OnesAndZeroes {

    public static int ConvertBinaryArrayToInt(List <Integer> binary){
        int result = 0;
        int baseNumber = 2;
        int exponent = binary.size()-1;
        //fix list and exponent
        for (int i =0; i < binary.size(); i++) {
            result += (int) (binary.get(i) * Math.pow(baseNumber, exponent));
            exponent--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));

    }
}
