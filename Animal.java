package ZooChallenge;

public class Animal {

    String name;
    String id;
    String sex;
    String color;
    String birthday;
    String habitat;
    String weight;
    String species;
    int age;

    // Animal class
    public static int numOfAnimals = 0;

    public Animal(String name, int age, String bear, String gender, String birthday, String color, String weight, String habitat, String id) {
        this.name = name;
        numOfAnimals++;
    }

    //Constructor
    public Animal(String name, int age, String species, String color, String sex, String weight, String habitat) {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.weight = weight;
        this.habitat = habitat;
        this.species = species;
        this.age = age;
        this.id = id;
        numOfAnimals++;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setGender(String gender) {
        this.sex = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthday() {
        this.birthday = birthday;
        return null;
    }

}

