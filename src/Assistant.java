public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson{
    //Define assistant attributes
    boolean isGoingToBeAPhD;

    // Constructor for assistant
    public Assistant(String name, String surname, int id, boolean isGoingToBeAPhD) {
        super(name, surname, id);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void teachToOtherPeople(){
        System.out.println(name+" is"+ this.getClass().getSimpleName()+" is teaching other people");
    }

    @Override
    public void stayAtHome() {
        System.out.println(name +" is "+ this.getClass().getSimpleName()+" and is studying at home");
    }

    @Override
    public String goToCollege() {
        return super.goToCollege()+", is Going to be a PHD: "+isGoingToBeAPhD;
    }
}
