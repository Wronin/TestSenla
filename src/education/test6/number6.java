package education.test6;


import java.util.Scanner;

public class number6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true)
            run();
    }
    static void run(){


        try {
            System.out.println("Enter the maximum weight the backpack can hold");
            int maxWeight = scanner.nextInt();
            Backpack backpack = new Backpack(maxWeight);
            System.out.println("Enter the number of the available items");
            int itemsCount = scanner.nextInt();
            for (int i = 0; i < itemsCount; i++) {
                System.out.println("Enter weight and cost of the item " + (i+1));
                int weight = scanner.nextInt();
                int cost = scanner.nextInt();
                Item item = new Item(weight, cost);
                backpack.getItems().add(item);
            }

            backpack.fillBackpack();

            System.out.println("Max backpack cost is: " + backpack.getCost());
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong input, please, try again.");
        }

        System.out.println();
    }

}