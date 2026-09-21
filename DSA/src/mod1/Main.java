package mod1;

public class Main {
    public static void main(String[] args) {

        // creates a new bag that stores dice names
        Bag<String> bag = new Bag<>();

        // adds dice to the bag, including a duplicate d20 die
        bag.add("D6 Die");
        bag.add("D20 Die");
        bag.add("D8 Die");
        bag.add("D12 Die");
        bag.add("D4 Die");
        bag.add("D20 Die");

        // prints the initial contents of the bag
        System.out.println("Initial Contents of Dice Bag: " + bag);

        // checks if specific dice are in the bag
        System.out.println("Does the bag still contain a D20?: " + bag.contains("D20 Die"));
        System.out.println("Does the bag still contain a D12?: " + bag.contains("D12 Die"));

        // counts how many of each die type are currently in the bag
        System.out.println("Count of D20 Dice: " + bag.count("D20 Die"));
        System.out.println("Count of D8 Dice: " + bag.count("D8 Die"));
        System.out.println("Count of D12 Dice: " + bag.count("D12 Die"));

        // removes one d20 die from the bag
        System.out.println("Removing one of the D20 Dice from the bag");
        bag.remove("D20 Die");

        // prints the updated contents after removal
        System.out.println("Dice types remaining in the bag after removal: " + bag);

        // checks if the d20 is still in the bag, and how many of them remain
        System.out.println("Bag contains D20 Dice after removal: " + bag.contains("D20 Die"));
        System.out.println("Number of D20 Dice remaining after removal: " + bag.count("D20 Die"));
    }
}
