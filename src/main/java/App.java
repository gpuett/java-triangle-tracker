import models.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Please enter side one of your triangle");
            int userSide1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please enter side two of your triangle");
            int userSide2 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please enter side three of your triangle");
            int userSide3 = Integer.parseInt(bufferedReader.readLine());


            if (userSide1 == userSide2 && userSide2 == userSide3){
                System.out.println("Your triangle is equilateral!");
            } else if(userSide1 == userSide2 || userSide1 == userSide3 || userSide2 == userSide3) {
                System.out.println("Your triangle is isosceles!");
            } else if (userSide1 != userSide2 && userSide2 != userSide3 && userSide1 != userSide3 && userSide1 + userSide2 > userSide3 && userSide2 + userSide3 > userSide1 && userSide1 + userSide3 > userSide2) {
                System.out.println("Your triangle is scalene!");
            } else {
                System.out.println("That is not a triangle!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
