import java.util.*;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;

        System.out.println("ChatBot: Hello! How can I help you?");

        while (true) {

            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("hello")) {

                System.out.println("ChatBot: Hi!");

            } else if (input.equals("how are you")) {

                System.out.println("ChatBot: I am fine.");

            } else if (input.equals("course")) {

                System.out.println("ChatBot: We provide Java, Python and AI courses.");

            } else if (input.equals("fees")) {

                System.out.println("ChatBot: Course fee is 5000 Rs.");

            } else if (input.equals("bye")) {

                System.out.println("ChatBot: Thank You!");
                break;

            } else {

                System.out.println("ChatBot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}




// # Main Concept of ChatBot

// A chatbot is a program that:

// * Takes user input
// * Checks the message
// * Gives predefined replies

// This chatbot uses:

// * `Scanner` for input
// * `if-else` conditions for responses
// * `while` loop for continuous chatting

// ---

// # Main Points of Code

// ---

// # 1. Import Package

// ```java id="yv1tw9"
// import java.util.*;
// ```

// Used for:

// * `Scanner`

// ---

// # 2. Create Scanner Object

// ```java id="6occt5"
// Scanner sc = new Scanner(System.in);
// ```

// Takes input from keyboard.

// ---

// # 3. Greeting Message

// ```java id="6j3mvd"
// System.out.println("ChatBot: Hello! How can I help you?");
// ```

// Displays welcome message.

// ---

// # 4. Infinite Loop

// ```java id="c1l5gh"
// while(true)
// ```

// Runs chatbot continuously until user types `"bye"`.

// ---

// # 5. Take User Input

// ```java id="0iv0ca"
// input = sc.nextLine().toLowerCase();
// ```

// * Reads sentence from user
// * Converts input to lowercase

// Example:

// ```text id="f56f38"
// HELLO → hello
// ```

// ---

// # 6. Check User Message

// ```java id="7cw1hq"
// if(input.equals("hello"))
// ```

// Checks exact user text.

// ---

// # 7. Predefined Responses

// Examples:

// ```java id="2b1rt7"
// hello → Hi!
// course → Java, Python and AI courses
// fees → 5000 Rs
// ```

// ---

// # 8. Exit Condition

// ```java id="kpxkri"
// else if(input.equals("bye"))
// ```

// Ends chatbot using:

// ```java id="5dd0b6"
// break;
// ```

// ---

// # 9. Unknown Input

// ```java id="zcwtx7"
// Sorry, I don't understand.
// ```

// Runs when input does not match any condition.

// ---

// # 10. Close Scanner

// ```java id="ee9a8o"
// sc.close();
// ```

// Releases memory/resources.

// ---

// # Sample Output

// ```text id="4f2v67"
// ChatBot: Hello! How can I help you?

// You: hello
// ChatBot: Hi!

// You: course
// ChatBot: We provide Java, Python and AI courses.

// You: bye
// ChatBot: Thank You!
// ```

// ---

// # Concepts Used

// | Concept        | Purpose         |
// | -------------- | --------------- |
// | Scanner        | Input           |
// | while loop     | Continuous chat |
// | if-else        | Decision making |
// | String methods | Compare text    |
// | break          | Stop program    |
