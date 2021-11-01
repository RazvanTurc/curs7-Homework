package ro.fasttrackit.homework7;

public class Main {
    public static void main(String[] args) {
        // Exercise 1 & 2 - Person

        Person person1 = new Person("Ghita Muresan", 34, true);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.isMarried());
        System.out.println();

        Person person2 = new Person("Elena Duma", 22, false);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.isMarried());
        System.out.println();

        Person person3 = new Person("Costel Olaru", 62, true);
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.isMarried());
        System.out.println();

        // Exercise 3 & 4 - Product

        Product lapteZuzu = new Product("Lapte Zuzu", 6.5D, 20, "Lapte");
        System.out.println(lapteZuzu.getName());
        System.out.println(lapteZuzu.getPrice());
        System.out.println(lapteZuzu.getQuantity());
        System.out.println(lapteZuzu.getCategory());
        System.out.println(lapteZuzu.hasStockResponse());
        System.out.println(lapteZuzu.isCategory("milk"));
        System.out.println();

        Product telemea = new Product("Branza Telemea", 3.0D, 3, "Branza");
        System.out.println(telemea.getName());
        System.out.println(telemea.getPrice());
        System.out.println(telemea.getQuantity());
        System.out.println(telemea.getCategory());
        System.out.println(telemea.hasStockResponse());
        System.out.println(telemea.isCategory("milk"));
        System.out.println(telemea.isCategory("branza"));
        System.out.println();

        Product pateBucegi = new Product("Pate Bucegi", 5.9D, 0, "Pate");
        System.out.println(pateBucegi.getName());
        System.out.println(pateBucegi.getPrice());
        System.out.println(pateBucegi.getQuantity());
        System.out.println(pateBucegi.getCategory());
        System.out.println(pateBucegi.hasStockResponse());
        System.out.println(pateBucegi.isCategory("PaTe"));
        System.out.println();

        // Exercise 5

        Bottle bottle1 = new Bottle(5,5);
        System.out.println(bottle1.hasMoreLiquid());
        System.out.println(bottle1.getEmptyCapacity());
        System.out.println(bottle1.getAvailableLiquid());
        System.out.println(bottle1.isOpen());
        System.out.println();

        System.out.println(bottle1.drink(2));
        System.out.println(bottle1.closeBottle());
        System.out.println(bottle1.openBottle());
        System.out.println(bottle1.openBottle());
        System.out.println();

        System.out.println(bottle1.drink(3));
        System.out.println(bottle1.getAvailableLiquid());
        System.out.println(bottle1.isOpen());
        System.out.println(bottle1.getEmptyCapacity());
        System.out.println(bottle1.drink(5));
        System.out.println(bottle1.drink(2));
        System.out.println(bottle1.drink(2));

    }
}
