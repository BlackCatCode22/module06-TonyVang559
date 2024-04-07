package ZooChallenge;

class Hyena extends Animal {

    String strongJaws;

    public Hyena(String name, int age, String gender, String birthday, String color, String weight, String habitat,
                 String id, String strongJaws) {
        super(name, age, "Hyena", gender, birthday, color, weight, habitat, id);
        this.strongJaws = strongJaws;
    }

    public String getstrongJaws() {
        return strongJaws;
    }

    public void setSpots(String strongJaws) {
        this.strongJaws = strongJaws;
    }


}
