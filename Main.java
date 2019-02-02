package abstractTest;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        MyAnimalList myAnimalList = new MyAnimalList();
        myAnimalList.addAnimal(dog);
        myAnimalList.addAnimal(cat);


    }
}
