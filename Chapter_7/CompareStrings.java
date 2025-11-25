// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name >");
        String  name = input.next();
        StringBuilder sb = new StringBuilder(name);
        
        if(sb == null || sb.isEmpty()){
            System.out.println();
        }
        else{
            String result = name.substring(0, 1).toUpperCase() + name.substring(1);
            
            if(sb.toString().equals(result)){
                System.out.println(result + " is equal to " + sb);
            }
            else{
                System.out.println(result + " is not equal to " + sb);
            }
        }
    }
}
