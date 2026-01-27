import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---WELCOME TO THE JAVA QUIZ---");
        System.out.print("\nPlease, enter your name here: ");
        String name=sc.nextLine();
        System.out.println("Hello, "+name+" before starting the quiz please read the given instructions carefully.");
        System.out.println("\n---QUIZ INSTRUCTIONS--- \n");
        System.out.println("1. The quiz contains multiple-choice questions.\n2. Each question has four options (A, B, C, D).\n3. Select only one option for each question.\n4. Enter your answer as A, B, C, or D.\n5. Each correct answer carries 1 mark.\n6. No negative marking for wrong answers.\n7. The quiz will proceed to the next question automatically.\n8. Final score will be displayed at the end of the quiz. ");

    }
}
