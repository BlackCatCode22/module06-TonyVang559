package ZooChallenge;

class Bear extends Animal {

    String hibernate;

    public Bear(String name, int age, String gender, String birthday, String color, String weight, String habitat,
                String id, String hibernate) {
        super(name, age, "Bear", gender, birthday, color, weight, habitat, id);
        this.hibernate = hibernate;

    }

    public String getHibernate() {
        return hibernate;
    }

    public void setHibernate(String hibernate) {
        this.hibernate = hibernate;
    }

}
