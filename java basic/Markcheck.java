import java.util.Scanner;
public class Markcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your mark: ");
        // int mark = scanner.nextInt();
        // if (mark > 24) {
        //     System.out.println(" The mark is pass");
        // } else {
        //     System.out.println("The mark is fail");
        // }
        // System.out.print("Enter your income: ");
        // double income = scanner.nextDouble();
        // if (income > 7000) {
        //     System.out.println("Scholarship is available.");
        // } else {
        //     System.out.println("Not eligible for scholarship.");
        // }
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();
        // if (number % 3 == 0) {
        //     System.out.println("The number is divisible by 3.");
        // } else {
        //     System.out.println("The number is not divisible by 3 .");
        // }  
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();  
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine(); 
        if (string1.equals(string2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
       scanner.close();
    }
}