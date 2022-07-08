package enclosures;

import animals.Animal;
import animals.Bird;

public class BirdHouse extends Enclosure{

    public BirdHouse(String name){
        super(name);
    }

    public void addAnimal(Animal animal){

    }

    public void addAnimal(Bird bird){
        this.animals.add(bird);
    }

}
