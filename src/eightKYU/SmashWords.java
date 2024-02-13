package eightKYU;
/*
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
Be careful, there shouldn't be a space at the beginning or the end of the sentence!

Example:
['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */
public class SmashWords {
    public static String smash(String... words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words){
            builder.append(word+ " ");
        }
        return builder.toString().trim();
    }

    //another way to do this
    public static String smash1(String... words){
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(smash("hello", "world", "this", "is", "great"));
        System.out.println(smash1("hello", "world", "this", "is", "great"));
    }
}
