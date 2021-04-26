package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

   public void addDog(Dog dog) {
       dogs.add(dog);
   }

   public void feedAll(){
       for(Dog dog : dogs) {
           dog.feed();
       }
      // dogs.forEach(Dog::feed );
   }

   public Dog findByName(String name) {
       for (Dog dog : dogs) {
           if (dog.getName().equals(name)) {
               return dog;
           }
       }
       throw  new IllegalArgumentException(" Cannot found dog");
  /* return  dogs.stream()
       .filter(d -> d.getName().equals(name))
           .findAny()
           .orElseThrow(() ->new IllegalArgumentException(" Cannot found dog"));*/


   }

   public void playWith(String name, int hours){
       Dog d = findByName(name);
       d.play(hours);
   }

   public List<String> getHappyDogNames(int minHappiness){
       List <String> ret = new ArrayList<>();
       for (Dog dog : dogs){
           if (dog.getHappiness()> minHappiness) {
               ret.add(dog.getName());

           }
       }
       return ret;

     /*  return dogs.stream()
               .filter(d -> d.getHappiness() > minHappiness)
               .map(d -> d.getName())
               .collect(Collectors.toList());*/

   }

    public List<Dog> getDogs() {
        return dogs;
    }
}
