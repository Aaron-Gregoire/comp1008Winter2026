package wk6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week6 {

   public static void main(String[] args) {
     example8();
    }
    static void example2(){

       /*
       exception

        */
       //  int num = Integer.parseInt("abc");
        int num = Integer.parseInt("1");



    }

    static void example3(){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int num1 = sc.nextInt();
        System.out.println("enter another integer");
        int num2 = sc.nextInt();

        System.out.println(num1 / num2);


    }

    static void example4(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        try {
            int num1 = sc.nextInt();
            System.out.println("enter another integer");
            int num2 = sc.nextInt();

            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e){
            System.err.println("could not divide by 0");
        }
        catch (InputMismatchException e){
            System.err.println("invalid number inputted");
        }
        catch (Exception e){
            //serr tab
            System.err.println("error!");
        }

    }

    static void example5() {

         int num;
            try {
                // /ask user for even number
                Scanner sc = new Scanner(System.in);
                System.out.println("enter an even number");
                num = sc.nextInt();
                if (num % 2 == 1) {
                    throw new IllegalArgumentException("odd number inputted!");
                }
                else if(num ==0){
                    throw new ArithmeticException("cannot get the remainder of value");
                }
                else if (num < 0){
                    throw new ArithmeticException("negative number inputted");
                }

                System.out.println("you've inputted an even number");

            } catch (Exception e) {

                System.err.println(e.getClass().getName());
                System.err.println(e.getMessage());
            }finally {
                System.out.println("thank you for using our program");
            }

        }

    static void example7(){
       String text = "my number is 705-905-3169";

       Pattern pattern = Pattern.compile("[0-9]{2,}");
       Matcher matcher = pattern.matcher(text);

       while(matcher.find()){
           System.out.println(matcher.group());
        }
    }

    static void example8(){
       //write a regex that will validate a name in format first name last name
        //no middle names allowed
       String regex = "[A-Za-z]{2,}\s[A-Za-z]{3,}";
       String text = "Aaron Gregoire";

       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());



    }

    static void example1(){
        /*
        method is and action
            sleeping(where, duration)


            method overload
                allowing the user to use the method in various ways

         */

        Calculator c1 = new Calculator();
        int r1 = c1.add();
        int r2 = c1.add(1,2);
        double r3 = c1.add(3.3, 4.4);

        System.out.println(c1.getClass().getName());

        System.out.println(c1);

        /*
         override
         throw out the default method behavior and implement a new method behavior
         */



    }
}
