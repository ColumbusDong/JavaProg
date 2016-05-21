public class Grade
{
    /*Instance Variables*/
    private int Q1;
    private int Q2;
    private int MT;
    private int FE;
    private double quizTotal;
    private double finalGrade;

    private double quizPts;
    private double midtermPts;
    private double finalExamPts;

    private String LGrade;
    
    /*Regular Constructor*/
    public Grade(int Quiz1, int Quiz2, int Midterm, int FinalExam)
    {
        /*Assign Literals*/
        Q1 = Quiz1;
        Q2 = Quiz2;
        MT = Midterm;
        FE = FinalExam;

        /*Calculate Quiz Total*/
        quizTotal = (Q1 + Q2);

        /*Quiz Points*/
        quizPts = ((quizTotal/20) * 25);

        /*Midterm Points*/
        midtermPts = ((double) MT/100 * 25);

        /*Final Exam Points*/
        finalExamPts = ((double) FE/100 * 50);

        /*Total All Points for Final Grade*/
        finalGrade = quizPts + midtermPts + finalExamPts;

        /*Find the Letter Grade*/
        if (finalGrade >= 90)
        {
            LGrade = "A";
        }
        else if (finalGrade < 90 && finalGrade >= 80)
        {
            LGrade = "B";
        }
        else if (finalGrade < 80 && finalGrade >= 70)
        {
            LGrade = "C";
        }
        else if (finalGrade < 70 && finalGrade >= 60)
        {
            LGrade = "D";
        }
        else
        {
            LGrade = "F";
        }
    }

    public String toString()
    {
        String str = "" + finalGrade + "\t" + LGrade;
        return str;
    }
}