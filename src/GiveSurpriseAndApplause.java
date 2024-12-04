public class GiveSurpriseAndApplause extends AbstractGiveSurprises {
    public GiveSurpriseAndApplause(String containerType, int waitTime) {
        super(containerType,waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Applauses");
    }
}