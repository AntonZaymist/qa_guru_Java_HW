package guru.qa;

public class Dog {

    String color;
    int age;
    String breed_type;
    String origin;
    double average_weight;

    public Dog(String color, int age, String breed_type, String origin, double average_weight) {
        this.color = color;
        this.age = age;
        this.breed_type = breed_type;
        this.origin = origin;
        this.average_weight = average_weight;
    }

    String getColor(){
        return color;
    }
    int getAge(){
        return age;
    }
    String getBreed_type(){
        return breed_type;
    }
    String getOrigin(){
        return origin;
    }



}
