import java.util.Scanner;

public class expressions {
        public static void main(String[] args) {

            /**
             *  Expressions Homework
             */

            // Part 1: Order Of Operations
            // ---------------------------
            //PEMDAS aka Please Excuse My Dear Aunt Sally
            //aka paren, multiply, division, addition, subtraction
            //is that what was meant?

            // Part 2: Operators
            // ---------------------------
            //Add 42 to 1
            int sum = 42 + 1;
            System.out.println(sum);

            //Multiple 0 by 981 and then add 68 times 8
            int product = (0 * 981) + (68 * 8);
            System.out.println(product);

            //Add 3.14 to 0.09 and then remove 12 from the total
            double difference = (0.09 + 3.14) - 12;
            System.out.println(difference);

            //Divide 89 by 4 to show only the remainder
            int modulo = 89 % 4;
            System.out.println(modulo);

            //Subtract 5.16 from 66.7128 and divide the results by 5
            double quotient = (66.7128 - 5.16) / 5;
            System.out.println(quotient);

            // Part 3: Formulae
            // ---------------------------

            //Express how to find the area of a circle as an expression
            //Area(circle) = pi * radius^2
            int radius = 2;
            double area = 3.14 * (radius * radius);
            System.out.println("Area of circle with radius " + radius + " is " + area);

            //Express the pythagorean theorum as an expression
            int a = 3;
            int b = 4;
            double hypoteneuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("Length of hypoteneuse of right triangle with sides " + a + " and " + b + " is " + hypoteneuse);

            //Express how to find the area of a triangle as an expression
            int base = 33;
            int height = 9;
            double area2 = .5 * (base * height);
            System.out.println("Area of triangle with base 33 and height 9 is " + area2);

            //Express how discover the volume of a cube
            int side = 4;
            double volume = Math.pow(side, 3);
            System.out.println("Volume of cube with side 4 is " + volume);

            //Express how to find out how manyn milliseconds are in 14 minutes
            int minutes = 14;
            int milliseconds = minutes * 60 * 1000;
            System.out.println(milliseconds + " milliseconds in 14 minutes.");

            // Part 4: Bonus
            // ---------------------------

            //Express how to calculate if a number equal in value to one third of another number
            int a1 = 3;
            int b1 = 9;
            if ((a1 * 3 == b1) || (b1 % 3 == a1)) {
                System.out.println("One number is a third of the other.");
            } else {
                System.out.println("Neither number is a third of the other.");
            }
            
            //Express two linear equations that are equal to each other
            //y = mx + b2 equivalent to 2y= 0.5x + 2b2

            //Express how to discover the slope of a line
            float y = 3;
            float x = 2;
            float yIntercept = 5;

            double m = ((y - yIntercept) / x);

            System.out.println("Slope of line with y value 3, x value 2, and yIntercept 5 is " + m);

        }


}

