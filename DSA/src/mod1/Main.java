package mod1;

public class Main {
    public static void main(String[] args) {

        // first bag of dice
        Bag<String> bag1 = new Bag<>();
        bag1.add("D6 Die");
        bag1.add("D20 Die");
        bag1.add("D8 Die");
        bag1.add("D12 Die");
        bag1.add("D8 Die");
        bag1.add("D20 Die");

        // second bag of dice
        Bag<String> bag2 = new Bag<>();
        bag2.add("D4 Die");
        bag2.add("D4 Die");
        bag2.add("D4 Die");
        bag2.add("D3 Die");
        bag2.add("D100 Die");
        bag2.add("D20 Die");
        bag2.add("D6 Die");
        // print sizes of both bags
        System.out.println("Amount of dice in Bag 1: " + bag1.size());
        System.out.println("Amount of dice in Bag 2: " + bag2.size());

        // merge bag2 into bag1
        System.out.println("Merging Bag 2 into Bag 1");
        bag1.merge(bag2);

        // print merged contents
        System.out.println("Dice inside merged bag: " + bag1);

        // create a bag with only distinct dice
        Bag<String> distinctBag = bag1.distinct();

        // print distinct contents
        System.out.println("Actual dice types in the bag: " + distinctBag);
    }
}