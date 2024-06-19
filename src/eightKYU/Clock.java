package eightKYU;

//Write a function that returns the time since midnight in milliseconds

public class Clock {

    public static int Past(int h, int m, int s){
        double ms = .001;

        int computedSeconds = (int) ( s /ms);
        int computedMinutes = (int) ((m * 60) / ms);
        int computerHours = (int) (((h * 60) * 60) / ms);

        return computedSeconds + computedMinutes + computerHours;
    }

    public static void main(String[] args) {
        System.out.println( Clock.Past(0,1,1));
    }
}
