package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student student1 = new Student();
        student1.setStudent("Karla Jara");

        student1.addGrade(81);
        student1.addGrade(96);
        student1.addGrade(88);
        student1.addGrade(93);
        students.put("karlitasway", student1);

        Student student2 = new Student();
        student2.setStudent("Krystle Alcorta");
        student2.addGrade(77);
        student2.addGrade(84);
        student2.addGrade(76);
        student2.addGrade(97);
        students.put("lovelykrys", student2);

        Student student3 = new Student();
        student3.setStudent("James Bond");
        student3.addGrade(67);
        student3.addGrade(74);
        student3.addGrade(90);
        student3.addGrade(89);
        students.put("shakennotstirred", student3);

        Student student4 = new Student();
        student4.setStudent("Martin Scorsese");
        student4.addGrade(76);
        student4.addGrade(86);
        student4.addGrade(79);
        student4.addGrade(88);
        students.put("casinoman", student4);

    }
}
//    public interface GithubUserInfo {
//        String display(Student students);
//    }

//    class ConsoleGithubUserInfo implements GithubUserInfo{
