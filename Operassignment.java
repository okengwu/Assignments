// author by vincent. assignment
import java.util.Scanner;// importing a scanner 

// class declaration 
public class Operassignment {

// method declaration
public static void main(String[] args) {

Scanner mathe = new Scanner(System.in);
System.out.print("enter the operator");
String operator = mathe.nextLine();

System.out.print("type first num");
double number1 = mathe.nextDouble();

System.out.print("type second num");
double number2 = mathe.nextDouble();
 




double addition = number1 + number2;
double subtraction = number1 - number2;
double division = number1 / number2;
double multiplication = number1 * number2;
double modulus = number1 % number1;
double power = 1;



switch (operator) {
    case "+":
    System.out.println(addition);
    break;
    case "-": 
    System.out.println(subtraction);
    break;

    case "/":
    System.out.println(division);
    break;
    case "*":
    System.out.println(multiplication);
    break;
    case "%":
    System.out.println(modulus);
    break;
    case "^":
    for(int k = 0; k <number2; k++){
        power *= number1;

    }

    System.out.println(power);
    break;
    default:
}

} 




}
