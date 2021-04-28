import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @Test

    public void firstTest() {


        System.out.println("Hello, corona!");
        String firstName = "Dmitro";
        String lastName = "Coronovich";
        String email = "best@corona.lv";
        int age = 34;

        System.out.println( "FirstName: " + firstName  + "\nLast name: " + lastName);

        int commentCount = 36;
        int newComments = 24;

        String stringCommentCount = "36";
        String stringNewComments = "22";

        System.out.println(commentCount  + newComments );
        System.out.println(stringCommentCount + stringNewComments);
    }

     private void printSum(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);

         System.out.println(first + second);
        }
    }

