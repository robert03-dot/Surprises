public class BagFactory implements IBagFactory{
    @Override
    public IBag makeBag(String bagType) {
        switch (bagType){
            case "LIFO":
                return new LIFOBag();
            case "FIFO":
                return new FIFOBag();
            case "RANDOM":
                return new RandomBag();
            default:
                System.out.println("This bag doesn't exist!");
                return null;
        }
    }
}
