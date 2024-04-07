package ZooChallenge;

class Tiger extends Animal {

    int blackStripes;

    public Tiger(String name, int age, String gender, String birthday, String color, String weight, String habitat,
                 String id, int blackStripes) {
        super(name, age, "Tiger", gender, birthday, color, weight, habitat, id);
        this.blackStripes = blackStripes;
    }

    public int getStripes() {
        return blackStripes;
    }

    public void setStripes(int blackStripes) {
        this.blackStripes = blackStripes;
    }

}

