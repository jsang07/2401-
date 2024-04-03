import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        enum grade {최우수, 우수, 보통, 미흡, 탈락}

        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for (int i = 0; i < scores.length; i++){
            scores[i] = in.nextInt();
        }

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        System.out.println();

        for (int i = 0; i < scores.length; i++){
            if(scores[i] >= 90){

                System.out.println((i+1) + "번 학생의 등급은 " + grade.최우수 + " 입니다.");
            }  else if(80 <= scores[i] && scores[i] < 90){
                System.out.println((i+1) + "번 학생의 등급은 " + grade.우수 + " 입니다.");
            }   else if(70 <= scores[i] && scores[i] < 80){
                System.out.println((i+1) + "번 학생의 등급은 " + grade.보통 + " 입니다.");
            }  else if(60 <= scores[i] && scores[i] < 70){
                System.out.println((i+1) + "번 학생의 등급은 " + grade.미흡 + " 입니다.");
            }  else if(scores[i] < 60){
                System.out.println((i+1) + "번 학생의 등급은 "  + grade.탈락 +  " 입니다.");
            }

        }

    }
}
