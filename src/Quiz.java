import java.util.Scanner;
public class Quiz {
    Scanner sc=new Scanner(System.in);
    Question[] Q;
    int score=0;
    public Quiz(Question[] Q){
        this.Q=Q;
    }
    public int printQuest(){
        for(int i=0;i<Q.length;i++){
           System.out.println("Q."+i+1+" "+Q[i].que+"\nA. "+Q[i].optA+"\nB. "+Q[i].optB+"\nC. "+Q[i].optC+"\nD. "+Q[i].optD);
           System.out.print("\nChoose the correct option and enter here: ");
           String result=sc.nextLine();
           if(result.equalsIgnoreCase(Q[i].ans)){
            score++;
            System.out.println("Correct answer ✅");
           }
           else{
            System.out.println("Incorrect answer ❌");
           }
           System.out.println();
        }
        return score;
    }
    
}
