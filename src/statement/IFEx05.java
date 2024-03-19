package statement;



public class IFEx05 {

    public static void main(String[] args) {
        int score = 101;
        String grade;
        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                if (score >= 95) {
                    grade = "A+";
                } else {
                    grade = "A";
                }
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println(grade + "등급");
        } else {
            System.out.println("점수 입력 오류");
        }
    }
}
