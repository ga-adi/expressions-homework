/**
 *  Expressions Homework
 */
 
// Part 1: Order Of Operations
// ---------------------------

/* The mathematics Order of Operations:
        Multiply and divide from left to right.
        Add and subtract from left to right.
* /


// Part 2: Operators
// ---------------------------

/*
Summary of Operators

The following quick reference summarizes the operators supported by the Java programming language.

Simple Assignment Operator

=       Simple assignment operator
Arithmetic Operators

+       Additive operator (also used
        for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator
Unary Operators

+       Unary plus operator; indicates
        positive value (numbers are
        positive without this, however)
-       Unary minus operator; negates
        an expression
++      Increment operator; increments
        a value by 1
--      Decrement operator; decrements
        a value by 1
!       Logical complement operator;
        inverts the value of a boolean
Equality and Relational Operators

==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
<       Less than
<=      Less than or equal to
Conditional Operators

&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for
        if-then-else statement)
Type Comparison Operator

instanceof      Compares an object to
                a specified type
Bitwise and Bit Shift Operators

~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR
 *
 */






// Operators Warm-Up

// 1)   Add 42 + 1
        int result1 = (42 + 1);
        System.out.println(result);

// 2)   Multiply 0 by 981 and then add 68 times 8
        int result2 = (0 * 981) + (68 * 8);
        System.out.println(result2);

// 3)   Add 3.14 to 0.09 and then remove 12 from the total
        int result3 = (3.14 + 0.09) - 12;
        System.out.println(result3);


// 4)   Divide 89 by 4 to show only the remainder
        int result4 = (89 % 4);
        System.out.println(result4);

// 5)   Subtract 5.16 from 66.7128 and divide the results by 5
        int result5 = (66.7128 - 5.15) / 5;
        System.out.println(result5);



// Part 3: Formulae / Geometry
// ---------------------------

//      Express how to find the area of a circle as an expression
                area = (Math.PI * r * r);
                System.out.println(area);

//      Express the pythagorithm theorum as an expression - c is diagonal side of a right triangle
                (a*a) + (b*b) = (c*c)

//      Express how to find the area of a triangle as an expression, b = base; h = height
                int area = 1/2(bh);
                System.out.println(area);

//      Express how discover the volume of a cube, length = 2
                int vol = l*l*l;
                System.out.println(vol);


                //or wher n = 3....

                System.out.println("2 to the power of " + n + " = " + Math.pow(2, n));

//      Express how to find out how many milliseconds are in 14 minutes; 1 minute = 60000 milliseconds
                number = (14 * 60000);
                System.out.println(number);



// Part 4: Bonus
// ---------------------------


//Express how to calculate if a number equal in value to one third of another number

        If {
                number1 == (1/3) * number2
                }
        else {
                System.out.println(number1 + "is not equal to 1/3 of " + number2);
                }

//Express two linear equations that are equal to each other
        4x + 3 = y
                and y = 3 + 4x


//Express how to discover the slope of a line; slope = rise/run

                int slope = (y^​2 − y^​1) /  (x^​2 − x^​1)
                System.out.println(slope);

