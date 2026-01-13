import java.util.*;
class Questions{
    String question;
    String[] options;
    int correctAnswer;

    Questions(String question,String[]options,int correctAnswer){
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class TimeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the quiz:");
        String str = sc.nextLine();

        try {
            System.out.println("Start");

            System.out.println("1.What is the charge on Na?");
            System.out.println("a) +1\nb) +2\nc) -1\nd) -2");
            Thread.sleep(10000);
            System.out.println("End after 10 seconds");

            System.out.println("2.A uniform rod of mass M and length L is kept on a smooth horizontal surface.A small insect of mass m starts crawling from one end of the rod to the other with constant speed v relative to the rod.Find the displacement of the rod when the insect reaches the other end.?");
            System.out.println("a) x = mL/M+m \nb) x = m+L/m+M \nc) x = 2m/L+m \nd) x = 2M/mL");
            Thread.sleep(10000);
            System.out.println("End after 10 seconds");

            System.out.println("3.Find x for x= x^2+1");
            System.out.println("a) 2+5i/2\nb)1+3i/2 \nc)6i-5/2 \nd) 1");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
