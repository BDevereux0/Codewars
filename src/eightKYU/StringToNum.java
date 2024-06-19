package eightKYU;
//Create a function that transforms a string into a number
public class StringToNum {
    public static int stringToNum(String str) {

        Integer test = Integer.parseInt(str);

        return test;
    }

    public static void main(String[] args) {
        System.out.println( StringToNum.stringToNum("0123456789"));
    }
}
