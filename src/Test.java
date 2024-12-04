public class Test {
    public static void main(String[] args) {
        System.out.println(FortuneCookie.generate());
        Candies candies = Candies.generate();
        candies.enjoy();
        System.out.println(candies);
        MinionToy minionToy = MinionToy.generate();
        minionToy.enjoy();
        System.out.println("First minion toy from array is: " + MinionToy.generate());
        System.out.println("Second minion toy from array is: " + MinionToy.generate());
        System.out.println("Third minion toy from array is: " + MinionToy.generate());
        System.out.println("Fourth minion toy from array is: " + MinionToy.generate());
        System.out.println("Fifth minion toy from array is: " + MinionToy.generate());
        System.out.println("Sixth minion toy from array is: " + MinionToy.generate());

    }
}
//folosesc ibagfactory si bagfactory pentru a implementa factory matter ca design pattern
//plecam de la 3 tipuri de surprize(obiecte) pe care la adaug in bag-uri(fifo bag,lifo bag,random bag).la final extrag obiectele din bag.in main
