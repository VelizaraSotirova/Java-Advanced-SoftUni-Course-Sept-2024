package Lab;

import java.util.*;

public class _05_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> studentsGrades = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] studentInfo = sc.nextLine().split("\\s+");
            String studentName = studentInfo[0];
            double studentGrade = Double.parseDouble(studentInfo[1]);

            studentsGrades.putIfAbsent(studentName, new ArrayList<>());
            List<Double> grades = studentsGrades.get(studentName);
            grades.add(studentGrade);

            studentsGrades.put(studentName, grades);
        }

        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)\n", getAverageGrade(entry.getValue()));
        }
    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (Double grade : grades) {
            sumGrades += grade;
        }

        return sumGrades / grades.size();
    }
}
