package edu.bionic.testdata;

import com.google.common.collect.Lists;
import edu.bionic.domain.Color;
import edu.bionic.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductFactory {

    public static Product getProduct1() {
        return new Product(
                1,
                "Garmin Fenix 3 HR",
                BigDecimal.valueOf(514),
                Color.GRAY,
                32,
                "1,2 inch",
                null,
                "1.jpg"
        );
    }

    public static Product getProduct2() {
        return new Product(
                2,
                "Garmin Fenix 5X",
                BigDecimal.valueOf(964),
                Color.GRAY,
                12288,
                "1,2 inch",
                null,
                "2.jpg"
        );
    }

    public static Product getProduct3() {
        return new Product(
                3,
                "Smart Watch Finow X5",
                BigDecimal.valueOf(175),
                Color.BLACK,
                6144,
                "1,39 inch",
                null,
                "3.jpg"
        );
    }

    public static Product getProduct4() {
        return new Product(
                4,
                "Asus Zen Watch 2",
                BigDecimal.valueOf(174),
                Color.GRAY,
                4096,
                "1,63 inch",
                null,
                "4.jpg"
        );
    }

    public static Product getProduct5() {
        return new Product(
                5,
                "Atrix Smart Watch E10",
                BigDecimal.valueOf(87),
                Color.BLACK,
                64,
                "1,22 inch",
                null,
                "5.jpg"
        );
    }

    public static Product getProduct6() {
        return new Product(
                6,
                "Garmin Fenix 5S",
                BigDecimal.valueOf(750),
                Color.BLACK,
                64,
                "1,1 inch",
                null,
                "6.jpg"
        );
    }

    public static Product getProduct7() {
        return new Product(
                7,
                "Garmin Fenix 5SW",
                BigDecimal.valueOf(643),
                Color.WHITE,
                64,
                "1,1 inch",
                null,
                "7.jpg"
        );
    }

    public static Product getProduct8() {
        return new Product(
                8,
                "Garmin Fenix 3 Performer",
                BigDecimal.valueOf(621),
                Color.BLACK,
                32,
                "1,2 inch",
                null,
                "8.jpg"
        );
    }

    public static List<Product> getAllProducts() {
        return Lists.newArrayList(
                getProduct1(),
                getProduct2(),
                getProduct3(),
                getProduct4(),
                getProduct5(),
                getProduct6(),
                getProduct7(),
                getProduct8()
        );
    }

    public static Product newProduct() {
        return new Product(
                null,
                "Garmin Fenix 3 HR",
                BigDecimal.valueOf(514),
                Color.GRAY,
                32,
                "1,2 inch",
                null,
                "1.jpg"
        );
    }

    public static Product getProduct2Updated() {
        return new Product(
                2,
                "Garmin Fenix 5X",
                BigDecimal.valueOf(964),
                Color.GRAY,
                12228,
                "1,2 inch",
                null,
                "2.jpg"
        );
    }
}
