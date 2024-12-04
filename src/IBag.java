import java.util.ArrayList;

public interface IBag {
    void put(ISurprise newSurprise);

    void put(IBag bagOfSurprises);

    void put(ArrayList<ISurprise> newSurpriseList);

    ISurprise takeOut();

    boolean isEmpty();

    int size();
}