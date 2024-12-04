import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises implements IGiveSurprise {
    private IBag container;
    private int waitTime;
    private IBagFactory bagFactory;

    public AbstractGiveSurprises(String containerType, int waitTime) {
        bagFactory = new BagFactory();
        this.container = bagFactory.makeBag(containerType);
        if(waitTime<0){
            waitTime = 0;
        }
        this.waitTime = waitTime;
    }
    public void put(ISurprise newSurprise){
        container.put(newSurprise);
    }
    public void put(IBag surprise){
        container.put(surprise);
    }
    private void give(){
        container.takeOut().enjoy();
        try{
            TimeUnit.SECONDS.sleep(waitTime);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void giveOne() {
        give();
    }

    @Override
    public void giveAll() {
        while(!container.isEmpty()){
            this.give();
        }
    }
    @Override
    public void gatherAndPut(int number) {
        container.put(GatherSurprise.gather(number));
    }

    @Override
    public IBag getContainer() {
        return container;
    }
    protected abstract void giveWithPassion();
}