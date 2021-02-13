package advance.inheritance.animal_example;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat("ginger", "miau", true);
        Dog dog = new Dog("dobermanas", "whoof", true);

        String catVoice = cat.yieldVoice();
        System.out.println("Beutifull" + catVoice);
        System.out.println(dog.yieldVoice());

        dog.printAnimal();


    }
}
