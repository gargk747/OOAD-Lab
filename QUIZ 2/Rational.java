import java.util.Scanner;
class Rational {
    private int numerator;
    private int denominator;
    public Rational() {
        numerator = 1;
        denominator = 2;
    }
    public Rational(int numerator, int denominator) {
        int g =gcd(numerator,denominator);
        this.numerator = numerator/g;
        this.denominator = denominator/g;
    }


    //getter and setter 
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    //Asked questions
    public Rational add(Rational r) {
        int  num = numerator * r.denominator + r.numerator * denominator;
        int denom = denominator * r.denominator;
        return new Rational(num, denom);
    }
    public Rational subtract(Rational r) {
        int num = numerator * r.denominator - r.numerator * denominator;
        int denom = denominator  * r.denominator;
        return new Rational(num, denom);
    }
    public Rational multiply(Rational r) {
        int num = numerator * r.numerator;
        int denom = denominator * r.denominator;
        return  new Rational(num, denom);
    }
    public Rational divide(Rational r) {
        int num = numerator * r.denominator;
        int denom = denominator * r.numerator;
        return new Rational(num, denom);
    }



    public static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public String toString() {
        return "(" + numerator + "/" + denominator + ")";
    }
}

//Main class
class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rational a;
        Rational b;
        System.out.println("Enter numerator for the 1st rational number: ");
        int num_a = input.nextInt();
        System.out.println("Enter a non-zero denominator for the 1st rational number: ");
        int denom_a = input.nextInt();
        System.out.println("Enter a numerator for the 2nd rational number: ");
        int num_b = input.nextInt();
        System.out.println("Enter a non-zero denominator for the 2nd rational number: ");
        int denom_b = input.nextInt();
        a = new Rational(num_a, denom_a);
        b = new Rational(num_b, denom_b);
        System.out.println("\n\n1st rational number is: " + a);
        System.out.println("2nd rational number is: " + b);
        System.out.println("Addition of the rational number is: " + a.add(b));
        System.out.println("Subtraction of the rational number is: " + a.subtract(b));
        System.out.println("Multiplication of the rational number is: " + a.multiply(b));
        System.out.println("Division of the rational number is: " + a.divide(b));
    }
}