import java.util.Map;
import java.util.Random;

public class MinionToy implements ISurprise{
    private String name;
    private static String minions[] = {"Dave","Carl","Kevin","Stuart","Jerry","Tim"};
    private static int currentIndex = 0;
    public MinionToy(String name) {
        this.name = name;
    }

    @Override
    public void enjoy() {
        System.out.println("You got a minion named:" + name + "!");
    }

    @Override
    public String toString() {
        return "MinionToy{" +
                "name='" + name + '\'' +
                '}';
    }
    public static MinionToy generate() {
        String minionName = minions[currentIndex];
        currentIndex = (currentIndex+1) % minions.length;
        return new MinionToy(minionName);
    }
}
