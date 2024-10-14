public class Professor extends CollegePerson implements TeachingPerson{
    String teachingSubject;

    public Professor(String name, String surname, int id, String teachingSubject) {
        super(name, surname, id);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(name+" is "+ this.getClass().getSimpleName()+" is teaching other people");
    }

    @Override
    public String goToCollege() {
        return super.goToCollege()+", is teaching "+teachingSubject;
    }
}
