package grades;

import java.util.ArrayList;
    public class Student{
        private String name;
        private ArrayList<Double> grades;


        public void setStudent(String studentName){
            this.name = studentName;
            this.grades = new ArrayList<>();
        }

        public String getName(){
            return name;
        }

        public ArrayList<Double> getGrades(){
            return grades;
        }

        public void addGrade(double grade){
            grades.add(grade);
        }

        public double getGradeAverage(){
            double totalPoints = 0;
            double numberOfGrades = grades.size();
            for(Double grade : grades){
                totalPoints += grade;
            }
            return totalPoints/numberOfGrades;
        }

    public static void main(String[] args){
        Student student1 = new Student();
        student1.setStudent("Karla Jara");

        student1.addGrade(81);
        student1.addGrade(96);
        student1.addGrade(88);
        student1.addGrade(93);
        System.out.println(student1.getName() + "'s Grade Average is: " + student1.getGradeAverage());

        Student student2 = new Student ();
        student2.setStudent("Krystle Alcorta");
        student2.addGrade(97);
        student2.addGrade(84);
        student2.addGrade(76);
        student2.addGrade(97);
        System.out.println(student2.getName()+"'s Grade Average is: " + student2.getGradeAverage());

        Student student3 = new Student();
        student3.setStudent("James Bond");
        student3.addGrade(67);
        student3.addGrade(74);
        student3.addGrade(90);
        student3.addGrade(89);
        System.out.println(student3.getName() + "'s Grade Average is: " + student3.getGradeAverage());

        Student student4 = new Student();
        student4.setStudent("Martin Scorsese");
        student4.addGrade(76);
        student4.addGrade(86);
        student4.addGrade(79);
        student4.addGrade(88);
        System.out.println(student4.getName() + "'s Grade Average is: " + student4.getGradeAverage());
    }
}
