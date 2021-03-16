package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

   public void addDog(Dog dog) {
       dogs.add(dog);
   }

   public void feedAll(){
       for(Dog dog : dogs) {
           dog.feed();
       }
   }

   public Dog findByName(String name) {
       for (Dog dog : dogs) {
           if (dog.getName().equals(name)) {
               return dog;
           }
       }
       throw  new IllegalArgumentException(" Cannot found dog");

   }

   public void playWith(String name, int hours){
       Dog d = findByName(name);
       d.play(hours);
   }

   public List<String> getHappyDogNames(int minHappiness){
       List <String> ret = new ArrayList<>();
       String min;
       for (Dog dog : dogs){
           if (dog.getHappiness()> minHappiness) {
               ret.add(dog.getName());

           }
       }
       return ret;

   }

    public List<Dog> getDogs() {
        return dogs;
    }
}
