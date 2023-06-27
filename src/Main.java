public class Main {
    public static void main(String[] args)
    {
        //Animal 1
        Animal animal1 = new Animal("Simba", "lion", "yellow", 24, 100, 4, "Safari", "Kenya");
        animal1.printAnimalDetails();
        animal1.growth();
        animal1.healthDamage();
        animal1.healthRecovery();

        //Animal 2
        Animal animal2 = new Animal("Sebastian", "crab", "red", 7, 65, 10, "Ocean", "England");
        animal2.printAnimalDetails();
        animal2.growth();
        animal2.healthDamage();
        animal2.healthRecovery();

        //Animal 3
        Animal animal3 = new Animal("Bambi", "deer", "brown", 70, 96, 4, "Forest", "France");
        animal3.printAnimalDetails();
        animal3.growth();
        animal3.healthDamage();
        animal3.healthRecovery();

    }

}