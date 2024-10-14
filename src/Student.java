public class Student extends CollegePerson implements LearningPerson{
    int academicYear;

    // constructor for the student
    public Student(String name, String surname, int id, int academicYear) {
        super(name, surname, id);
        this.academicYear = academicYear;

    }

    // overriding the method from college person
    @Override
    public void stayAtHome() {
        System.out.println("Student, "+ name +" is studying at home");
    }


    // print the Student details
    @Override
    public String goToCollege() {
        return super.goToCollege()+", Academic year: "+academicYear;
    }
}
