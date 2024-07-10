import java.util.Scanner;

class QuestionService
{
    Question [] questions = new Question[5];
    String [] selection = new String[5];

    public QuestionService()
    {
        questions [0] = new Question(1, "Who is known as the father of Java?", "James Gosling", "John", "Guido van Rossum", "Kiran", "James Gosling");
        questions [1] = new Question(2, "Who is known as the father of python", "James", "Naveen", "Guido van Rossum", "Jordon", "Guido van Rossum");
        questions [2] = new Question(3, "Who is known as the father of C?", "James Gosling", "Guido van Rossum", "Bjarne Stroustrup", "Dennis MacAlistair Ritchie", "Dennis MacAlistair Ritchie");
        questions [3] = new Question(4, "Who is known as the father of C++?", "Dennis", "Bjarne Stroustrup", "Guido van Rossum", "Jordan Walke", "Bjarne Stroustrup");
        questions [4] = new Question(5, "Who is known as the father of react?", "Jordan Walke", "Miško Hevery", "Jordon", "Ritchie", "Miško Hevery");
    }

    public void displayQuestion()
    {
        int i=0;
        for (Question q : questions)
        {
            System.out.println(q.id+". "+q.getQuestion());
            System.out.println("option A : "+q.getOpt1());
            System.out.println("option B : "+q.getOpt2());
            System.out.println("option C : "+q.getOpt3());
            System.out.println("option D : "+q.getOpt4());

            System.out.println();

            //System.out.println("Answer is : "+q.getAnswer());
 
            //System.out.println();

            Scanner sc = new Scanner(System.in);
            selection [i] = sc.nextLine();
            i++;

            System.out.println();
            

        }

        for(String s : selection)
        {
            System.out.println(s);
        }
    }

    public void printScore()
    {
        int score =0;
        for(int i=0; i<questions.length; i++)
        {
            Question que = questions[i]; // clar
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println();
        System.out.println("Your Score is :" + score);
    }
}