import java.util.ArrayList;

public class Operations {
    public double average(ArrayList<Integer> list) {
        int sum = 0;

        for (int i : list) {
            sum += i;
        }

        return 1.0 * sum / list.size();
    }

    public double averagePassing(ArrayList<Integer> list) {
        int sum = 0;
        int count = 0;

        for (int i : list) {
            if (i >= 50) {
                count++;
                sum += i;
            }
        }

        return 1.0 * sum / count;
    }

    public double passPercentage(ArrayList<Integer> list) {
        int sum = 0;

        for (int i : list) {
            if (i >= 50) {
                sum++;
            }
        }

        return 100.0 * sum / list.size();
    }

    public String gradeDistribution(ArrayList<Integer> list) {
        int[] grades = new int[6];

        for (int i : list) {
            if (i < 50) {
                grades[5]++;
            } else if (i < 60) {
                grades[4]++;
            } else if (i < 70) {
                grades[3]++;
            } else if (i < 80) {
                grades[2]++;
            } else if (i < 90) {
                grades[1]++;
            } else {
                grades[0]++;
            }
        }

        return  "5: " + stars(grades[0]) + "\n" +
                "4: " + stars(grades[1]) + "\n" +
                "3: " + stars(grades[2]) + "\n" +
                "2: " + stars(grades[3]) + "\n" +
                "1: " + stars(grades[4]) + "\n" +
                "0: " + stars(grades[5]);
    }

    public String stars(int amount) {
        String stars = "";

        for (int i = 0; i < amount; i++) {
            stars += "*";
        }

        return stars;
    }
}
