import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---WELCOME TO THE JAVA QUIZ---");
        System.out.print("\nPlease, enter your name here: ");
        String name=sc.nextLine();
        System.out.println("Hello, "+name+" before starting the quiz please read the given instructions carefully.");
        System.out.println("\n---QUIZ INSTRUCTIONS--- \n");
        System.out.println("1. The quiz contains multiple-choice questions.\n2. Each question has four options (A, B, C, D).\n3. Select only one option for each question.\n4. Enter your answer as A, B, C, or D.\n5. Each correct answer carries 1 mark.\n6. No negative marking for wrong answers.\n7. The quiz will proceed to the next question automatically.\n8. Final score will be displayed at the end of the quiz.\n  ");

        Question[] Que=new Question[15];
        Que[0]=new Question("What is JVM?","Java Variable Machine","Java Virtual Machine","Java Visual Machine","Java Verified Machine", "B");
        Que[1]=new Question("Which keyword is used to inherit a class in Java?","inherit","extends","implements","super","B");
        Que[2]=new Question("Which of the following is NOT a primitive data type in Java?","int","float","String","char","C");
        Que[3]=new Question("Which keyword is used to handle exceptions in Java?","throw","throws","try","catch","D");
        Que[4]=new Question("What will happen if an exception is not handled?","Program continues normally","Compilation error","Program terminates abnormally","JVM ignores it","C");
        Que[5]=new Question("Which of the following supports runtime polymorphism?","Method overloading","Method overriding","Constructor overloading","Static methods","B");
        Que[6]=new Question("Which of the following is a checked exception?","NullPointerException","ArrayIndexOutOfBoundsException","IOException","ArithmeticException","C");
        Que[7]=new Question("Which package contains classes for file handling in Java?","java.util","java.io","java.lang","java.net","B");
        Que[8]=new Question("Why is Java platform independent?","Because Java uses pointers","Because Java code is interpreted","Because Java bytecode runs on JVM","Because Java has no compiler","C");
        Que[9]=new Question("What is the main purpose of garbage collection in Java?","To delete variables manually","To free unused memory automatically","To improve code speed","None of the above","B");
        Que[10]=new Question("Which of the following statements about static is true?","Static variables belong to objects","Static methods can access non-static members directly","Static members belong to the class","Static methods support method overriding","C");
        Que[11]=new Question("What does the instanceof operator do?","Creates an object","Checks object type at runtime","Converts one class to another","Compares two objects","B");
        Que[12]=new Question("Why is String immutable in Java?","To save memory","For security and performance","To allow inheritance","To support multithreading only","B");
        Que[13]=new Question("What is the difference between == and equals() in Java?","Both compare memory","== compares references, equals() compares content","No difference","Both compare content","B");
        Que[14]=new Question("What happens if a return statement is executed inside a try block?","finally block is skipped","Program crashes","finally block still executes","Compilation error","C");

        Quiz quiz=new Quiz(Que);
        int totalScore= quiz.printQuest();
        if(totalScore==Que.length){
        System.out.println("Wonderfull! You've got the best score.");
        }
        else if(totalScore>10){
        System.out.println("Good job! You've got "+totalScore+" out of "+Que.length+".");
        }
        else if(totalScore>=7){
        System.out.println("Good! You've got "+totalScore+" out of "+Que.length+".");
        }
        else{
        System.out.println("You've got "+totalScore+" out of "+Que.length+".\nBetter luck next time!");
        }

        System.out.print("\nTry again? Yes/No: ");
        String s=sc.nextLine();
        while(!s.equalsIgnoreCase("Yes")&&!s.equalsIgnoreCase("No")){
            System.out.print("Your input is invalid, please enter the valid input (Yes/No): ");
            s=sc.nextLine();
        }
        if(s.equalsIgnoreCase("Yes")){
            
        }
        else{
            System.out.println("Thankyou for attempting this quiz.\nThe program is now terminated.");
            System.exit(0);
        }
          
    }
}
