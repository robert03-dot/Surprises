public class GiveSurpriseAndHug extends AbstractGiveSurprises {
    public GiveSurpriseAndHug(String containerType, int waitTime) {
        super(containerType, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Hugs");
    }
}