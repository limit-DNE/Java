public class GradeExam {

    public static void main(String[] args) {

        char[][] studentAnswers = {{'A', 'B', 'C', 'C', 'D'}, {'D', 'B', 'A', 'C', 'D'}, {'C', 'A', 'A', 'D', 'B'}};
        char[] answerKey = {'A', 'B', 'A', 'C', 'D'};

        for (int i = 0; i < studentAnswers.length; i++){
            int correctAnswer = 0;
            for (int j = 0; j < studentAnswers[i].length; j++){
                if (studentAnswers[i][j] == answerKey[j]){
                    correctAnswer++;
                }
            }
            System.out.println("Student " + (i + 1) + "'s correct answers: " + correctAnswer);
        }
    }
}
