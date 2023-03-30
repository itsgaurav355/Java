package Java_Classes;
import java.util.Scanner;
class Question
{
    String prompt;
    String answer;
    public Question(String prompt,String answer)
    {
        this.prompt=prompt;
        this.answer=answer;
    }
}

public class QuizApp {
    public static void makeTest(Question question[])
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        for(int i=0;i< question.length;i++)
        {
            System.out.println(question[i].prompt);
            String answer=sc.next();
            if(answer.equals(question[i].answer))
            {
                score++;
            }
        }
        System.out.println("Test Completed");
        System.out.println("Test Result=("+score+"/"+question.length+")");

    }
    public static void main(String[] args) {

        String q1 = "Java Language is ______\na.Compiled language\nb.Interpreted Language\nc.Both a and b\nd.None of these";
        String q2 = "Is it platform dependent or independent \na.dependent\nb.independent\nc. both a and b\nd. none of these";
        String q3 = "Java is  \na.object oriented \nb.procedural\nc.Both a and b\nd. none of these";
        Question [] question ={new Question(q1,"c"),new Question(q2,"b"),new Question(q3,"a")};
        makeTest(question);
    }
}
