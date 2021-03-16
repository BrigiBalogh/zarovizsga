package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
    public int happiness = 0;
    private String name;

    public Dog( String name)
    {
        this.name = name;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }
   public abstract void feed();


   public abstract void play(int hours);

}


