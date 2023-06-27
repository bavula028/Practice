public class Animal {
    private String name;
    private String type;
    private String color;
    private int weight;
    private int healthPercent;
    private int legs;
    private String habitat;
    private String country;
    private String[] animalDetails;


    //CONSTRUCTOR
    public Animal(String nameInput, String typeInput, String colorInput, int weightInput, int healthPercentInput, int legsInput, String habitatInput, String countryInput){
        name = nameInput;
        type = typeInput;
        color = colorInput;
        weight = weightInput;
        healthPercent = healthPercentInput;
        legs = legsInput;
        habitat = habitatInput;
        country = countryInput;
    }
    //CONSTRUCTOR

    //method ideas
    //growth
    //printDetails

    public void printAnimalDetails(){
        System.out.println("\nName: " + name + "\nType: " + type + "\nColor: " + color + "\nHealth: " + healthPercent + "\nWeight: " + weight + "\nNumber of Legs: " + legs + "\nHabitat: " + habitat + "\nCountry: " + country);
    }

    public int growth(){
        weight = weight + 10;
        System.out.println( "\n" + name + " has grown. It is now " + weight + " pounds.");
        return weight;
    }

    public int healthDamage(){
        healthPercent = healthPercent - 20;
        System.out.println(name + " has a cold. Its health is now at " + healthPercent + " percent.");
        return healthPercent;
    }

    public int healthRecovery(){
        healthPercent = 100;
        System.out.println(name + " has recovered. Its health is now at " + healthPercent + " percent.");
        return healthPercent;
    }






}
