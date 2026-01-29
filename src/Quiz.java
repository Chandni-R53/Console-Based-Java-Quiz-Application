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
           try{System.out.print("\nChoose the correct option and enter here: ");
           String result=sc.nextLine();
           }catch(IOException e){
              System.out.println();
           }
           if(result.equalsIgnoreCase(Q[i].ans)){
            score++;
            System.out.println("Correct answer ✅");
           }
           else{
            System.out.println("Incorrect answer ❌");
           }
           System.out.println();
           j++;
        }
        return score;
    }
    
}
