
// My first Java code, I am gonna get big soon

/* This is a comment for multiple line of code
Let me know if you have any question about it */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world!");

        String firstName = "Cishahayo Songa";
        String lastName = "Achille";
        int age = 20;

        System.out.println("My name is " + firstName + " " + lastName + ", I am " + age + " years old.");

        // Displaying Power of 10 in float and double. eg: 35x10^3 (float)
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Using "char" to display ASCII characters
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Casting: Changing data type from smaller to bigger. or from bigger to smaller
        int myInt = 9;
        double myDouble = myInt; // Automatic/Widening casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Narrowing/Manual casting must be done manually by placing the type in parentheses in front of the value
        double myDyouble = 9.78d;
        int myIynt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDyouble);   // Outputs 9.78
        System.out.println(myIynt);      // Outputs 9

        // Getting length of the string
        System.out.println(firstName + " has " + firstName.length() + " characters!");

        // Finding characters in the string, we use .indexOf() method
        System.out.println(firstName.indexOf("Songa"));
    }
}