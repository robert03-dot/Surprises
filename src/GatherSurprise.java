import java.util.ArrayList;

public class GatherSurprise {
    private static final int NUMBER_OF_SURPISES_TYPE = 3;
    public static ISurprise gather(){
        int randomNumber = RandomHelper.getNewRandomInt(NUMBER_OF_SURPISES_TYPE);
        switch (randomNumber){
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                return null;
        }
    }
    public static ArrayList<ISurprise> gather(int number){
        ArrayList<ISurprise> surprises = new ArrayList<>();
        if(number>0){
            for(int i=0;i<number;i++){
                surprises.add(gather());
            }
        }
        return surprises;
    }
}