//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", "Kato", 1, 2024);
        Assistant assistant = new Assistant("James", "Wasswa", 1, true);
        Professor professor = new Professor("Jane", "Wamara", 1, "Mathematics");
        System.out.println(student.goToCollege());
        System.out.println(assistant.goToCollege());
        System.out.println(professor.goToCollege());
        student.stayAtHome();
        assistant.stayAtHome();
        assistant.teachToOtherPeople();
        professor.teachToOtherPeople();
    }
}