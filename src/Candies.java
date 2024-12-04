import java.util.Random;

public class Candies implements ISurprise{
    private int num;
    private String type;
    private static String sweets[] = {"sweet wood","sweet corn","lollipop","chocolate bunny","chocolate santa"};
    public Candies(int num,String type) {
        this.num = num;
        this.type = type;
    }
    @Override
    public void enjoy() {
        System.out.println("You received: " + num + " " + type + " candies");
    }
    public static String[] getSweets(){
        return sweets;
    }
    @Override
    public String toString() {
        return "Candies number:" + num + " and the type is:" + type;
    }
    public static Candies generate(){
        Random random = new Random();
        int index = random.nextInt(sweets.length);
        String sweetsIndex = sweets[index];
        int randomNumber = random.nextInt(10)+1;
        return new Candies(randomNumber,sweetsIndex);
    }
}