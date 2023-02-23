
import java.util.ArrayList;

public class GradeRegister {

    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        }
        if (points < 60) {
            return 1;
        }
        if (points < 70) {
            return 2;
        }
        if (points < 80) {
            return 3;
        }
        if (points < 90) {
            return 4;
        }

        return 5;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }

        return 1.0 * sum / this.grades.size();
    }

    public double averageOfPoints() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for(int point : this.points) {
            sum += point;
        }
        return 1.0 * sum / this.grades.size();
    }

}
