public class Question {
    public String que;
    public String optA;
    public String optB;
    public String optC;
    public String optD;
    public String ans;

    public Question(String que,String optA,String optB,String optC,String optD,String ans){
        this.que=que;
        this.optA=optA;
        this.optB=optB;
        this.optC=optC;
        this.optD=optD;
        this.ans=ans;
    }
    public static void main(String[] args) {
        Question q1=new Question("What is JVM?","Java Variable Machine","Java Virtual Machine","Java Visual Machine","Java Verified Machine", "B");
        Question q2=new Question("Which keyword is used to inherit a class in Java?","inherit","extends","implements","super","B");
        Question q3=new Question("Which of the following is NOT a primitive data type in Java?","int","float","String","char","C");
        Question q4=new Question("Which keyword is used to handle exceptions in Java?","throw","throws","try","catch","D");
        Question q5=new Question("What will happen if an exception is not handled?","Program continues normally","Compilation error","Program terminates abnormally","JVM ignores it","C");
        Question q6=new Question("Which of the following supports runtime polymorphism?","Method overloading","Method overriding","Constructor overloading","Static methods","B");
        Question q7=new Question("Which of the following is a checked exception?","NullPointerException","ArrayIndexOutOfBoundsException","IOException","ArithmeticException","C");
        Question q8=new Question("Which package contains classes for file handling in Java?","java.util","java.io","java.lang","java.net","B");
        Question q9=new Question("Why is Java platform independent?","Because Java uses pointers","Because Java code is interpreted","Because Java bytecode runs on JVM","Because Java has no compiler","C");
        Question q10=new Question("What is the main purpose of garbage collection in Java?","To delete variables manually","To free unused memory automatically","To improve code speed","None of the above","B");
        
    }
}
