public class Test2 {
    public static void main(String[] args) {
        ISurprise surprise1 = GatherSurprise.gather();
        ISurprise surprise2 = GatherSurprise.gather();
        ISurprise surprise3 = GatherSurprise.gather();
        ISurprise surprise4 = GatherSurprise.gather();
        ISurprise surprise5 = GatherSurprise.gather();
        ISurprise surprise6 = GatherSurprise.gather();

        System.out.println(surprise1);
        System.out.println(surprise2);
        System.out.println(surprise3);
        System.out.println(surprise4);
        System.out.println(surprise5);
        System.out.println(surprise6);

        GiveSurpriseAndApplause object1 = new GiveSurpriseAndApplause("FIFO", 1);
        object1.put(surprise1);
        object1.put(surprise2);
        object1.put(surprise3);
        object1.put(surprise4);
        object1.put(surprise5);
        object1.put(surprise6);

        System.out.println("Giving all...");
        object1.giveAll();
    }
}
