package wfexample.bar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Pub spec")
public class PubPricesTest {

    private Pub pub;

    @BeforeEach
    public void setUp() throws Exception {
        pub = new Pub();
    }

    @Test
    @DisplayName("When we order one beer, then the price is $4.00.")
    public void oneBeerTest() {
        double actualPrice = pub.computeCost(Pub.ONE_BEER, false, 1);
        assertEquals(4.00, actualPrice);
    }

    @Test
    @DisplayName("When we order one cider, then the price is $5.00.")
    public void testCidersAreCostly() throws Exception {
        double actualPrice = pub.computeCost(Pub.ONE_CIDER, false, 1);
        assertEquals(5.00, actualPrice);
    }

    @Test
    @DisplayName("When we order a proper cider, then the price is $5.50.")
    public void testProperCidersAreEvenMoreExpensive() throws Exception {
        double actualPrice = pub.computeCost(Pub.A_PROPER_CIDER, false, 1);
        assertEquals(5.50, actualPrice);
    }

    @Test
    @DisplayName("When we order a gin and tonic, then the price is $4.50.")
    public void testACocktail() throws Exception {
        double actualPrice = pub.computeCost(Pub.GT, false, 1);
        assertEquals(4.50, actualPrice);
    }

    @Test
    @DisplayName("When we order a bacardi special, then the price is $5.50.")
    public void testBacardiSpecial() throws Exception {
        double actualPrice = pub.computeCost(Pub.BACARDI_SPECIAL, false, 1);
        assertEquals(5.50, actualPrice);
    }

    @Nested
    @DisplayName("Given a customer who is a student")
    class Students {
        @Test
        @DisplayName("When they order a beer, then they get a discount.")
        public void testStudentsGetADiscountForBeer() throws Exception {
            double actualPrice = pub.computeCost(Pub.ONE_BEER, true, 1);
            assertEquals(3.60, actualPrice);
        }

        @Test
        @DisplayName("When they order multiple beers, they also get a discount.")
        public void testStudentsGetDiscountsWhenOrderingMoreThanOneBeer() throws Exception {
            double actualPrice = pub.computeCost(Pub.ONE_BEER, true, 2);
            assertEquals(3.60 * 2, actualPrice);
        }

        @Test
        @DisplayName("When they order a cocktail, they do not get a discount.")
        public void testStudentsDoNotGetDiscountsForCocktails() throws Exception {
            double actualPrice = pub.computeCost(Pub.GT, true, 1);
            assertEquals(4.50, actualPrice);
        }
    }

    @Test
    @DisplayName("When they order a drink which is not on the menu, then they are refused.")
    public void testThatADrinkNotInTheSortimentGivesError() throws Exception {
        assertThrows(RuntimeException.class, () -> pub.computeCost("LongIsland", false, 1));
    }

    @Nested
    @DisplayName("When they order more than two drinks")
    class MultipleDrinks {
        @Test
        @DisplayName("and the order is for cocktails, then they are refused.")
        public void testCanBuyAtMostTwoDrinksInOneGo() throws Exception {
            assertThrows(RuntimeException.class, () -> pub.computeCost(Pub.BACARDI_SPECIAL, false, 3));
        }

        @Test
        @DisplayName("and the order is for beers, then they are served.")
        public void testCanOrderMoreThanTwoBeers() throws Exception {
            pub.computeCost(Pub.ONE_BEER, false, 5);
        }
    }
}
