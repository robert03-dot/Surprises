public class Test3 {
    public static void main(String[] args) {
        ISurprise surprise1 = GatherSurprise.gather();
        ISurprise surprise2 = GatherSurprise.gather();
        ISurprise surprise3 = GatherSurprise.gather();
        ISurprise surprise4 = GatherSurprise.gather();
        ISurprise surprise5 = GatherSurprise.gather();
        ISurprise surprise6 = GatherSurprise.gather();

        GiveSurpriseAndHug giveSurprise = new GiveSurpriseAndHug("LIFO",2);
        giveSurprise.put(surprise1);
        giveSurprise.put(surprise2);
        giveSurprise.put(surprise3);
        giveSurprise.put(surprise4);
        giveSurprise.put(surprise5);
        giveSurprise.put(surprise6);

        giveSurprise.giveOne();
        giveSurprise.giveAll();
    }
}
