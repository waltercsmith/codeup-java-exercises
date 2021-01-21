package syntax;

public class SyntaxLecture {

    public static void main(String[] args) {


        //Statements may be..
        //Declarations
        int numberSeven;
        int number = 7; //

        //keyboard shortcut for formatting code is          CMD option l

        //Assignment expressions
        numberSeven = 7; // = is assignment in Java

        //Any use of ++ or --
        //pre-increment
        --number; // decremented BEFORE it's                evaluated
        System.out.println("The number's value after pre-decrementing is: " + number);
        number++; // incremented AFTER it's                 evaluated on this line
        System.out.println("The number's value after pre-decrementing is: " + number);

        System.out.println("Pre-decrementing " + number + " = " + --number);
        System.out.println("Post-pincrementing " + number + " = " + number++);

        System.out.println("Now, the number = " + number);


        //Method ivocations
        Math.random(); // call the "random()" method , from the Math class

        //say we wanted to assign a random number to a variable
        // number = Math.random();
        double randomNumber = Math.random();

        //Object creation expressions

        // ================== DATA TYPES (s-5, 6, 7)

        // use the smallest type needed for the job

        // primitive types...

        byte age = 125;
        System.out.println("Adding one to the byte(125) : " + ++age);
        System.out.println("Adding one to the byte(126) : " + ++age);
        System.out.println("Adding one to the byte(127) : " + ++age);


        //            byte age = -32;
        //        System.out.println(age);
        //            short minimumAnnualSalary = 15080;
        int distanceToSaturn = 1200000000;
        long numberOfHumanCells = 3000000000L; // L needed for compiler
        // to access something at the index 1 of a database, using longs
        // books [1L]
        System.out.println(numberOfHumanCells);
        float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
        System.out.println(lengthOfBacteriaInInches);
        double widthOfAtomInMeters = .00000000001;
        char seatingSection = 'M'; // must wrap in single quotes
        boolean NgoziIsAwesome = true;
        //!NgoziIsAwesome; // this would invert NgoziIsAwesome
        if (NgoziIsAwesome) {
            System.out.println("Ngozi is awesome!");

            if (!NgoziIsAwesome) {
                System.out.println("Ngozi is NOT awesome! but fantastic!");
            }
        }
        // strings (not a primitive type)
        // reference type data refers to a location in memory, holding the contents of  that variable
        String thisIsAString = "Hello";
        String anotherString = "Hello";

        if (thisIsAString == anotherString) {
            System.out.println("we used .equals, and they are equivalent.");
        }
        if (thisIsAString == "Hello") {
            System.out.println("two are equal comparing reference string to Hello.");
        }

        //correct way
        //use .equals VERY IMPORTANT
        if (thisIsAString.equals("Hello")) {
            System.out.println("We have a match for Hello, using .equals");
        }
        //              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
        System.out.println("Hello\nWorld");
        System.out.println("Hello");
        System.out.println("World");

        // want to system out something like Hello, "groovy" world
        System.out.println("Hello, \"groovy\" World");

        char someLetter = 'Y';
        System.out.println(someLetter);
        /* If you system out, and the console shows a result of
         * ~ @4325345*/
        // Let's create a string and system out the first character         in that string
        String myName = "Walt";
        System.out.println(myName.charAt(0));
        System.out.println(myName.offsetByCodePoints(0, 3));
        // ================== VARIABLES (s-8)

        // declaration separate from initialization
        int faveNumber; // declared the variable
        faveNumber = 42;


        // declaration and initialization
        int myFaveNumber = 42;
        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // DO NOT NAME VARIABLES WITH RESERVED WORDS

        // see curriculum

        // ================== CONSTANTS (s-10)

        // see curriculum

        final double CIV_MAX_DOLLARS = 2147483647;
        // CAN NOT CHANGE VALUE OF CIV_MAX_DOLLARS

        // ================== EXPRESSIONS (s-11)

        // basically the same as JS
        int firstValue = 97;
        int secondValue = 99;

        int sumOfValues = firstValue + secondValue;
        int delta = firstValue - secondValue;
        int product = firstValue * secondValue;
        int quotient = firstValue / secondValue;

        // ================== OPERATORS (s-12)

        // basically the same as JS
        int reverseNumber = -72;
        int oppositeDay = -reverseNumber;
        int bePositive = +reverseNumber;

        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS

        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/

        // IMPLICIT

        short x = 8;
        int y = x;


        // EXPLICIT

        int civDollars = 20999999;
        byte civSandwich = (byte) civDollars;
        System.out.println("Making a nice civ sandwich: " + civSandwich);

        // implicit casting - less to more precise (widening)

        float num1 = 2.22F;
        double num2 = num1;

        // explicit casting - more to less explicit casting (narrowing)

                         double num3 = 3.1;
                         float num4 = (float) num3;
        //
        System.out.println(num4);


    }
}

