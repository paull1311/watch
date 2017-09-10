package edu.bionic.testdata;

import com.google.common.collect.Lists;
import edu.bionic.domain.Comment;
import edu.bionic.domain.Product;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class CommentFactory {

    public static Comment getComment1() {
        return new Comment(
                1,
                new Product(1),
                "Сергей",
                LocalDateTime.of(2017, Month.SEPTEMBER, 8, 13, 0),
                "Отличный девайс.",
                5
        );
    }

    public static Comment getComment2() {
        return new Comment(
                2,
                new Product(2),
                "Анна",
                LocalDateTime.of(2017, Month.AUGUST, 14, 15, 0),
                "Возьму кредит - обязательно куплю",
                3
        );
    }

    public static Comment getComment3() {
        return new Comment(
                3,
                new Product(1),
                "Клавдия Петровна",
                LocalDateTime.of(2017, Month.APRIL, 5, 10, 30),
                "Хошие часы. Но батарея слабо держит :(",
                4
        );
    }

    public static List<Comment> getCommentsForProduct1() {
        return Lists.newArrayList(getComment1(), getComment3());
    }

    public static Comment getNewCommentForProduct1() {
        return new Comment(
                null,
                new Product(1),
                "Валера",
                LocalDateTime.of(2017, Month.AUGUST, 11, 11, 11),
                "Классный аппарат!!",
                5
        );
    }
}
