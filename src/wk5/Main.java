package wk5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

    }
    static void regex1(){

        /*
        regular expression
            advance search for text

            []
                one of these options
                [abc] either a or b or c
            {}
                repeated text
                {3} exactly 3
                {3,5} between 3 and 5
                {2,} at least 2
            |
                cat|dog|mouse
                not just single character
            .
                any character
            +
                frequency: one or many times
            ?
               zero or one time
            *
                zero or many

                .+ any character at least one time
                on.+
                    one
                    only

                on.?
                    one
                    oni
                    ons
                    on
            ^
            at start of text
                ^hello
                    "a hello world" not good cus doesnt start with hello
                    "hello world" good

            $
            at end of text
            oposite of ^

           \d digit 0-9
           \D non-digit
           \s whitespace
           \S non-whitespace aka word


         */
    }
    static void regex2(){

        String textToSearch, patternToMatch;
        textToSearch = "I love working with regular expressions. They are cool";
        patternToMatch = "\\S{3,5}";

        //pattern object creates regex pattern and the flags
        // matcher object  create the matches/hits

        Pattern pattern = Pattern.compile(patternToMatch, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textToSearch);

        //determine if there is a match
        boolean result1 = matcher.find();
        String matchText1 = matcher.group();
        boolean result2 = matcher.find();
        String matchText2 = matcher.group();

        System.out.println(result1);
        System.out.println(matchText1);

        System.out.println(result2);
        System.out.println(matchText2);
    }
    static void regex3(){

        //create a regex that will extract all digits from a text
        String regex ="\\d";
        String text = "My number 1 restaurant is located at 246 98th avenue";

        //using pattern and matcher output all of the digits in the string
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(text);

        while(matcher.find()){
            String hit = matcher.group();
            System.out.printf("The digit '%s' was found at index %d of the text '%s'%n",
                    hit, text.indexOf(hit), text );
            //the digit '1' was found at index of 10 of the text 'my number 1 rest...."
        }
    }
    static void regex4(){
        String text = "i like eating pizza and wings";
        String regex = "pizza|wings";
        String updatedText = text.replaceAll(regex, "salad");
        System.out.println(text);
        System.out.println(updatedText);
    }
}
