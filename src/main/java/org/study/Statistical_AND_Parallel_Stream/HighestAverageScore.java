package org.study.Statistical_AND_Parallel_Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAverageScore {
    public class Course {
        private int id;
        private String name;
        private double score;

        public Course(int id, String name, double score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getScore() { return score; }

        @Override
        public String toString() {
            return "Course{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main(String sk[]){
//        From a list of Course objects, find the course with highest average score.
        HighestAverageScore obj=new HighestAverageScore();
        List<Course> courses = List.of(
                obj.new Course(1, "React", 88.1),
                obj.new Course(2, "Java", 84.3),
                obj.new Course(3, "SQL", 90.0),
                obj.new Course(4, "JavaScript", 86.7),
                obj.new Course(5, "Spring Boot", 93.4),
                obj.new Course(6, "JavaScript", 91.2),
                obj.new Course(7, "Spring Boot", 85.5),
                obj.new Course(8, "React", 92.3),
                obj.new Course(9, "Java", 89.5),
                obj.new Course(10, "SQL", 83.5),
                obj.new Course(11, "JavaScript", 88.8),
                obj.new Course(12, "Spring Boot", 95.1),
                obj.new Course(13, "Java", 80.0),
                obj.new Course(14, "React", 89.9),
                obj.new Course(15, "SQL", 87.0)
        );

        courses.stream()
                .collect(Collectors.groupingBy(Course::getName,Collectors.averagingDouble(Course::getScore)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Double>comparingByValue().reversed())
                .findFirst()
                .ifPresentOrElse(System.out::println,()->System.out.println("Record not FOund."));
    }
}
