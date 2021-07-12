package guru.qa;

public class Main {
    public static void main(String[] args) {

        Dog dachshund = new Dog("red", 2, "hunting dog", "Germany", 8.5);
        System.out.println("dachshund");
        System.out.println("color " + dachshund.getColor());
        System.out.println("breed " + dachshund.getBreed_type());
        System.out.println("___________________________");


        Dog retriever = new Dog("golden", 3,"companion","UK", 29.5);
        retriever.color = "black";
        System.out.println("retriever");
        System.out.println("color " + retriever.getColor());
        System.out.println("age " + retriever.getAge());
        System.out.println("origin " + retriever.getOrigin());

        System.out.println("___________________________");

        Dog.who_friend_of_human();





    }
}
