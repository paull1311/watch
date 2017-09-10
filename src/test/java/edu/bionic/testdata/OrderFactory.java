package edu.bionic.testdata;

import com.google.common.collect.Lists;
import edu.bionic.domain.Order;
import edu.bionic.domain.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class OrderFactory {

    public static Order getOrder1() {
        return new Order(
                1,
                LocalDateTime.of(2017, Month.AUGUST, 1, 19, 0),
                BigDecimal.valueOf(1500),
                Lists.newArrayList(ProductFactory.getProduct1(), ProductFactory.getProduct5()),
                "Оля",
                "olya@gmail.com",
                "0955213565",
                "ул. Крещатик, 26",
                UserFactory.getUser()
        );
    }

    public static Order getOrder2() {
        return new Order(
                2,
                LocalDateTime.of(2017, Month.AUGUST, 23, 21, 0),
                BigDecimal.valueOf(2200),
                Lists.newArrayList(ProductFactory.getProduct2(), ProductFactory.getProduct3(),  ProductFactory.getProduct6()),
                "Аня",
                "anya@gmail.com",
                "0953215646",
                "ул. Артема, 60",
                null
        );
    }

    public static List<Order> getAllOrders() {
        return Lists.newArrayList(getOrder1(), getOrder2());
    }

    public static List<Order> getAllOrdersForUser() {
        return Lists.newArrayList(getOrder1());
    }

    public static Order getNewOrderForUser() {
        return new Order(
                null,
                LocalDateTime.of(2017, Month.AUGUST, 11, 11, 11),
                BigDecimal.valueOf(1600),
                Lists.newArrayList(ProductFactory.getProduct5(), ProductFactory.getProduct6()),
                "Игорь",
                "ihor@gmail.com",
                "0956644347685",
                "ул. Артема, 31",
                UserFactory.getUser()
        );
    }

}
