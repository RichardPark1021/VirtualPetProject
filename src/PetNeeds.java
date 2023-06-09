/**
* add comment header
*/
public class PetNeeds {
    
    //field
    private int hunger;

    private int thirst;

    private int happiness;

    
    //constructor
    public PetNeeds() {
        
        hunger = 50;
        thirst = 50;
        happiness = 50;
    
    }

    /**
    * method: decreaseHunger
    * set hunger value
    */
    public void decreaseHunger(int amount) {
        
        hunger -= amount;
        if(hunger < 0) {
            hunger = 0;
        }
    }

    public void decreaseThirst(int amount) {
        thirst -= amount;
        if(thirst < 0) {
            thirst = 0;
        }
    }

    public void increaseHappiness(int amount) {
        
        happiness += amount;
        
        if(happiness > 100) {
            happiness = 100;
        }
        
    }

    //getters
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    //setters
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
