// This is a basic Java program
public class basic {
    public static void main(String[] args) {
       //basic synatax
        System.out.println("Hello, World!");

        //variables
        int num = 5;
        String name = "Yusra Javed";
        boolean isJavaFun = true;
        char alpha = 'a';

        System.out.println("My name is " + name + ".My Roll Number is " + num + 
        ". If you ask me is Java fun? I'd say " + isJavaFun 
        + ". My favorite alphabet is " + alpha);
        
        //Othere varibales include float, double, byte, short, long etc.

        //Operators in Java
        int beta = 1203;
        int gamma = 1735;

        // addition
        int sum = beta + gamma;
        System.out.println("The sum of bet and gamma is " + sum);

        // subtraction
        int sub = gamma - beta;
        System.out.println("The difference of beta and gamma is " + sub);

        //multiplication
        int mul = beta * gamma;
        System.out.println("The product of beta and gamma is " + mul);

        //Division 
        int div = gamma / beta;
        System.out.println("The quotient of beta and gamma is " + div);

        //Modulus
        int mod = gamma % beta;
        System.out.println("The modulus of gamma and beta is " + mod);

        //increment and decremnet
        int inc = beta++;
        int dec = gamma--;

        System.out.println("The increment of beta is " + inc +
         " and the decrement of gamma is " + dec);

         // Assignment operators include =, +=, -=, *=, /=, %=

         int a = 3;
         int b = 1;
         int c = 2;
         a += b;
         a -= b;
         a *= b;
         a /= b;
         a %= b;

         //comparison operators ( comparison, result in true/false..
        //  they are often used in conditions)
        // also called relational operators
        // also called boolean expressions

        if(a>b) {
            System.out.println("a is greater than b");
        } else if(a < b) {
            System.out.println("a is less than b");
        } else if(a == b) {
            System.out.println("a is equal to b");
        }

        // LOGICAL OPERATORS
        // used to combine boolean expression
        if(a>b && b>c) {
            System.out.println("Both conditions are true");
        } else if (a>b || b>c) {
            System.out.println("At least one condition is true");
         } else if(a != 5){
            System.out.println("a is not equal to 5");
         }
         else {
            System.out.println("Neither condition is true");
            
        }

        // Ternary Operator
        int temperature = 25;
        String weather = (temperature > 20) ? "Warm" : "Cold";
        System.out.println("The temperature today is " + weather);
    }
}