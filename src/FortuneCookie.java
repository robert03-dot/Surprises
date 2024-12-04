import java.util.Random;

public class FortuneCookie implements ISurprise {
    private String message;
    private static String quotes[] =
            { "Easter is a time for reflection and renewal,a time to celebrate the gift of life and the hope of eternal salvation.- Pope Benedict XVI ",
            "Easter is a symbol of hope, renewal, and new life. It is the time to celebrate the triumph of good over evil, light over darkness, and life over death.",
            "Easter is not about the bunny. It is about the Lamb that was sacrificed for our sins, so that we may have life everlasting",
            "Easter is a season of hope and renewal. It is a time to celebrate the victory of life over death, of light over darkness-Lailah Gifty Akita",
            "Easter is a time to celebrate the gift of life and the hope of eternal salvation. It is a time to reflect on the past and look forward to the future with hope."};

    public FortuneCookie(String message) {
        this.message = message;
    }

    @Override
    public void enjoy() {
        System.out.println("You got a fortune cookie!");
        System.out.println("You will become a Java programmer!");
    }

    @Override
    public String toString() {
        return "Fortune cookie message:" + message;
    }
    public static FortuneCookie generate(){
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        String randomQuote = quotes[index];
        return new FortuneCookie(randomQuote);
    }
}