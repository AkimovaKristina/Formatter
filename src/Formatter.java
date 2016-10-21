/**
 * Created by akimova on 21.10.16.
 */
import java.io.*;
import java.io.IOException;
public class Formatter {

    public static void main(String[] args) {

        String text = "class{public main{for(){system.out.println();}}}";
        Analyser(text);
        System.out.println("Thank you for your attention!!!");
    }

    public static void Analyser(String text) {
        int space = 0;
        int length =text.length();

        for (int i = 0; i < text.length(); i++) {

            char literal = text.charAt(i);


            if ((literal != '{') && (literal != '}') && (literal != ';')) {

                System.out.print(literal);

            } else if (literal == ';') {

                System.out.println(literal);
                for (int j = 0; j < space - 4; j++) {
                    System.out.print(" ");
                }
            }else if (literal == '{') {

                System.out.println(literal);
                space = space + 4;
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");

                }
            } else {
                space = space - 8;
                System.out.println(literal);
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");

                }

            }
        }
    }
}


