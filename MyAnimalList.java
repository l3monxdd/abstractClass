package abstractTest;

public class MyAnimalList {
    private  Animal [] animals = new Animal[5];
    private int nextIndex = 0;


    public void addAnimal(Animal animal){
        if (nextIndex < animals.length){
            animals[nextIndex] = animal;
            System.out.println("Animal додано до комірки "+nextIndex);
            nextIndex++;
        }
    }
}
