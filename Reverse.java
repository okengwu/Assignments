// assignment. author= vincent_chidi
import java.util.Scanner;

    public class Reverse {

        public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
            String name = "okengwu" + \n"chidi";
             StringBuilder myName = new StringBuilder();
             //append or put the string attribute to the vairiable created by the builder
              myName.append(name);
              // display the reverse string
              System.out.println(myName.reverse());

    }

    }