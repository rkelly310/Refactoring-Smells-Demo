package wfexample.bar;

public class Pub {


    public static final String ONE_BEER = "budweiser";
    public static final String ONE_CIDER = "downeast";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    public double computeCost(String drink, boolean student, double amount) {

        if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
        double price;
        if (drink.equals(ONE_BEER)) {
            price = 4.00;
        }
        else if (drink.equals(ONE_CIDER)) {
            price = 5.00;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 5.50;
        else if (drink.equals(GT)) {
            price = ingredient6() + ingredient5() + ingredient4();
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            price = ingredient6()/2 + ingredient1() + ingredient2() + ingredient3();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
        if (student && (drink == ONE_CIDER || drink == ONE_BEER || drink == A_PROPER_CIDER)) {
            price = price - price/10;
        }
        return price*amount;
    }

    //one unit of rum
    private double ingredient1() {
        return 3.00;
    }

    //one unit of grenadine
    private double ingredient2() {
        return 0.50;
    }

    //one unit of lime juice
    private double ingredient3() {
        return 0.50;
    }
    
    //one unit of green stuff
    private double ingredient4() {
        return 0.50;
    }

    //one unit of tonic water
    private double ingredient5() {
        return 1.00;
    }

    //one unit of gin
    private double ingredient6() {
        return 3.00;
    }
}
