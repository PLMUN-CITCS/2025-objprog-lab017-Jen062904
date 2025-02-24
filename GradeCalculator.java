import java.util.Scanner;

public class GradeCalculator {

  public static int getStudentScore() {
    Scanner scanner = new Scanner(System.in);
    int score = -1;

    while (true) {
         System.out.print("Enter your score: ");
         if (scanner.hasNextInt()) {
            score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("Please enter a valid score between 0 and 100.");
            }
          } else {
               System.out.println("Invalid input. Please enter a numerical value.");
               scanner.next();

           }
          
        }
        scanner.close();
        return score;
      }

      public static String calculateGrade(int score) {
           if (score >= 90) {
              return "A";
           } else if (score >= 80) {
              return "B";
           } else if (score >= 70) {
              return "C";
           } else if (score >= 60) {
              return "D";
           } else {
              return "F";
           }
      
        }

       public static void main(String[] args) {
          int studentScore = getStudentScore();
          String grade = calculateGrade(studentScore);
          System.out.println("Your Grade is: " + grade);

    }
}
