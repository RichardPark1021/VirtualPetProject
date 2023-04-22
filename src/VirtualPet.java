/**
* class name:
* @author:
* @version:
* @date: 
* description: 
*/
public class VirtualPet {
    
    //field
    private String name;

    private int age;

    private PetNeeds petNeeds;

    public VirtualPet(String name, int age) {
        
        this.name = name;
        this.age = age;
        
        this.petNeeds = new PetNeeds();
        
    }

    //add comments here about this method
    //if you can, you can use Random object instead of using Math.random()
    private int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    
    //feed method
    public void feed() {
        int decreaseAmount = getRandomNumber(10, 20);
        petNeeds.decreaseHunger(decreaseAmount);
    }

    public void drink() {
        int decreaseAmount = getRandomNumber(10, 20);
        petNeeds.decreaseThirst(decreaseAmount);
    }

    public void play() {
        int decreaseAmount = getRandomNumber(10, 20);
        petNeeds.increaseHappiness(decreaseAmount);
    }

    public boolean isSick() {
    
        return petNeeds.getHunger() >= 100 || petNeeds.getThirst() >= 100;
    
    }
    
    public boolean isSad(){

            return petNeeds.getHappiness() <= 0;
    }

    /**
    * method: printStatus()
    */
    public void printStatus() {
        System.out.println(name + "- Age: " + age);
        System.out.println("Hunger: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness: " + petNeeds.getHappiness() + "/100");
        System.out.println();
    }

    
    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Class getPetNeeds() {
        return getPetNeeds();
    }

    //remove this. this interface must be created separately from this class. 
//     public interface PetActions {
//         void feed();
//         void drink();
//         void play();
//     }
}
