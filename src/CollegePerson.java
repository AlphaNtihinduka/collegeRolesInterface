public class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public String goToCollege() {
        return "Name: "+ name+", Surname: "+surname+", College ID: "+collegeId;
    }

}
