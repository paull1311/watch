package edu.bionic.dao.mock;

import edu.bionic.dao.ProductDao;
import edu.bionic.domain.Color;
import edu.bionic.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDaoMock implements ProductDao {

    private List<Product> productStorage;


    @Override
    public List<Product> getAll() {
        return new ArrayList<>(productStorage);
    }

    @Override
    public List<Product> getAllSortedByName(String name, BigDecimal min, BigDecimal max, boolean desc, int offset, int limit) {
        return null;
    }

    @Override
    public List<Product> getAllSortedByPrice(String name, BigDecimal min, BigDecimal max, boolean desc, int offset, int limit) {
        return null;
    }

    @Override
    public int getCount(String name, BigDecimal min, BigDecimal max) {
        return productStorage.size();
    }

    @Override
    public Optional<Product> getById(int productId) {
        return productStorage.stream().filter(product -> product.getId() == productId).findAny();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public boolean delete(int productId) {
        return false;
    }

    public void initProductStorage() {
        productStorage = new ArrayList<>();

        productStorage.add(new Product(
                1,
                "Garmin Fenix 3 HR",
                BigDecimal.valueOf(514),
                Color.GRAY,
                32,
                "1,2 inch",
                null,
                "1.jpg"
        ));
        productStorage.add(new Product(
                2,
                "Garmin Fenix 5X",
                BigDecimal.valueOf(964),
                Color.GRAY,
                12288,
                "1,2 inch",
                null,
                "2.jpg"
        ));
        productStorage.add(new Product(
                3,
                "Smart Watch Finow X5",
                BigDecimal.valueOf(175),
                Color.BLACK,
                6144,
                "1,39 inch",
                null,
                "3.jpg"
        ));
        productStorage.add(new Product(
                4,
                "Asus Zen Watch 2",
                BigDecimal.valueOf(174),
                Color.GRAY,
                4096,
                "1,63 inch",
                null,
                "4.jpg"
        ));
        productStorage.add(new Product(
                5,
                "Atrix Smart Watch E10",
                BigDecimal.valueOf(87),
                Color.BLACK,
                64,
                "1,22 inch",
                null,
                "5.jpg"
        ));
        productStorage.add(new Product(
                6,
                "Garmin Fenix 5S",
                BigDecimal.valueOf(750),
                Color.BLACK,
                64,
                "1,1 inch",
                null,
                "6.jpg"
        ));
        productStorage.add(new Product(
                7,
                "Garmin Fenix 5SW",
                BigDecimal.valueOf(643),
                Color.WHITE,
                64,
                "1,1 inch",
                null,
                "7.jpg"
        ));
        productStorage.add(new Product(
                8,
                "Garmin Fenix 3 Performer",
                BigDecimal.valueOf(621),
                Color.BLACK,
                32,
                "1,2 inch",
                null,
                "8.jpg"
        ));
    }
}
