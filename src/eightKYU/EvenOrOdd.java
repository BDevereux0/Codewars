package eightKYU;
/*
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */
public class EvenOrOdd {
    public static String evenOrOdd(int number){
        if (number % 2 ==0){
            return "Even";
        }else
            return "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(0));
        System.out.println(evenOrOdd(1));
        System.out.println(evenOrOdd(2));
    }
}
