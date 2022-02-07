package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String finalTest() {
        if (finalGrade() < 60) {
            return String.format("FAILED\n"
                    + "MISSING %.2f POINTS", (60 - finalGrade()));
        } else {
            return "PASS";
        }
    }
}
