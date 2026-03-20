enum Result {
    CORRECT, WRONG, UNANSWERED
}

public class QuizGrader {

    public static void main(String[] args) {
        char[] correct = {'C','A','B','D','B','C','C','A'};
        char[] submitted = {'C','B','B','D','B','C','A','X'};

        int correctCount = 0;
        int wrongCount = 0;
        int unansweredCount = 0;

        System.out.println("QUESTION\tSUBMITTED\tCORRECT\t\tRESULT");

        for (int i = 0; i < correct.length; i++) {
            Result result;

            if (submitted[i] == 'X') {
                result = Result.UNANSWERED;
                unansweredCount++;
            } else if (submitted[i] == correct[i]) {
                result = Result.CORRECT;
                correctCount++;
            } else {
                result = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i+1) + "\t\t" + submitted[i] + "\t\t" 
                                + correct[i] + "\t\t" + result);
        }
        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of questions unanswered: " + unansweredCount);
        if (correctCount >= 5)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}