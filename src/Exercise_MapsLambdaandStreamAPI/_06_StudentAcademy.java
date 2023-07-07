package Exercise_MapsLambdaandStreamAPI;

import java.util.*;

public class _06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
                studentsMap.get(name).add(grade);
            } else {
                studentsMap.get(name).add(grade);
            }
        }

        LinkedHashMap<String, Double> studentAvgGrade = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : studentsMap.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            double avgGrade = getAverageGrade(grades);

            if (avgGrade >= 4.5) {
                studentAvgGrade.put(studentName, avgGrade);
            }

        }

        studentAvgGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }
    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
