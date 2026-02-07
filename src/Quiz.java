import java.io.IOException;
import java.util.Scanner;
public class Quiz {
    Scanner sc=new Scanner(System.in);
    Question[] Q;
    int score=0;
    public Quiz(Question[] Q){
        this.Q=Q;
    }
    public int printQuest(){
        int j=1;
        for(int i=0;i<Q.length;i++){
           System.out.println("Q."+j+" "+Q[i].que+"\nA. "+Q[i].optA+"\nB. "+Q[i].optB+"\nC. "+Q[i].optC+"\nD. "+Q[i].optD);
           System.out.print("\nChoose the correct option and enter here: ");
           String result=sc.nextLine();
           while(!result.equalsIgnoreCase("A")&&!result.equalsIgnoreCase("B")&&!result.equalsIgnoreCase("C")&&!result.equalsIgnoreCase("D")){
            System.out.print("Your input is invalid, please enter the valid input from the given options: ");
            result=sc.nextLine();
           }
           
           if(result.equalsIgnoreCase(Q[i].ans)){
            score++;
            System.out.println("Your answer is correct.");
           }
           else{
            System.out.println("Your answer is incorrect.");
            System.out.println("Correct Answer: "+Q[i].ans);
           }
           System.out.println();
           j++;
        }
        return score;
    }
    
}
