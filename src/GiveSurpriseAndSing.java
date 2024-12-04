public class GiveSurpriseAndSing extends AbstractGiveSurprises{
    public GiveSurpriseAndSing(String containerType, int waitTime) {
        super(containerType,waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Sings");
    }
}
