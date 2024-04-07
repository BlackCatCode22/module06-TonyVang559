package ZooChallenge;

class Lion extends Animal {

    String hairyTufts;

    public Lion(String name, int age, String gender, String birthday, String color, String weight, String habitat,
                String id, String hairyTufts) {
        super(name, age, "Lion", gender, birthday, color, weight, habitat, id);
        this.hairyTufts = hairyTufts;
    }

    public String getHairyTufts() {
        return hairyTufts;
    }

    public void setHairyTufts(String hairyTufts) {
        this.hairyTufts = hairyTufts;
    }

}