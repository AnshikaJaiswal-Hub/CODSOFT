import java.util.Scanner;

public class StudentGradeCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int num=sc.nextInt();

        System.out.print("Enter the subjects code : ");

        int [] Subjects= new int[num];

        for(int i=0; i<Subjects.length ; i++){
            Subjects[i]=sc.nextInt();
        }
        
//        for(int i=0; i<Subjects.length ; i++){
//            System.out.println(Subjects[i]);
//        }

        int total=0;
        for (int j = 0; j < Subjects.length ; j++) {
            System.out.print("Enter marks obtained in subject " + Subjects[j] + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double average = (double) total / (num * 100) * 100;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average>= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else  {
            grade = 'F';
        }

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average+ "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
