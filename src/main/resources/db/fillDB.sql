DELETE FROM comments;
ALTER SEQUENCE comments_id_seq RESTART WITH 1;
DELETE FROM orders_products;
DELETE FROM orders;
ALTER SEQUENCE orders_id_seq RESTART WITH 1;
DELETE FROM users;
ALTER SEQUENCE users_id_seq RESTART WITH 1;
DELETE FROM products;
ALTER SEQUENCE products_id_seq RESTART WITH 1;

INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Garmin Fenix 3 HR', 514, 2, 32, '1,2 inch', NULL, '1.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Garmin Fenix 5X', 964, 2, 12288, '1,2 inch', NULL, '2.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Smart Watch Finow X5', 175, 0, 6144, '1,39 inch', NULL, '3.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Asus Zen Watch 2', 174, 2, 4096, '1,63 inch', NULL, '4.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Atrix Smart Watch E10', 87, 0, 64, '1,22 inch', NULL, '5.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Garmin Fenix 5S', 750, 0, 64, '1,1 inch', NULL, '6.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Garmin Fenix 5SW', 643, 1, 64, '1,1 inch', NULL, '7.jpg');
INSERT INTO products (name, price, color, capacity, display, description, image)
VALUES ('Garmin Fenix 3 Performer', 621, 0, 32, '1,2 inch', NULL, '8.jpg');

INSERT INTO users (email, password, name, role)
VALUES ('admin@mail.com', '$2a$10$8IHi8NJot3CY5BDlHrivr.cVMJwtznYTNli3p7GcgwOtsF8VxgMWK', 'Administrator', 0);
INSERT INTO users (email, password, name, role)
VALUES ('user@mail.com', '$2a$10$PgBb/VbejOXpdopzGU3AquVu9LDr9PhQ0fcBiGIYsVQeKB.p/paQm', 'Username', 1);

INSERT INTO orders (total_amount, datetime, name, email, phone, address, user_id)
VALUES (1500, '2017-08-01 19:00:00', 'Оля', 'olya@gmail.com', '0955213565', 'ул. Крещатик, 26', 2);
INSERT INTO orders (total_amount, datetime, name, email, phone, address, user_id)
VALUES (2200, '2017-08-23 21:00:00', 'Аня', 'anya@gmail.com', '0953215646', 'ул. Артема, 60', null);

INSERT INTO orders_products (order_id, product_id) VALUES (1, 1);
INSERT INTO orders_products (order_id, product_id) VALUES (1, 5);
INSERT INTO orders_products (order_id, product_id) VALUES (2, 2);
INSERT INTO orders_products (order_id, product_id) VALUES (2, 3);
INSERT INTO orders_products (order_id, product_id) VALUES (2, 6);

INSERT INTO comments (product_id, author, datetime, text, rating)
VALUES (1, 'Сергей', '2017-09-08 13:00:00', 'Отличный девайс.', 5);
INSERT INTO comments (product_id, author, datetime, text, rating)
VALUES (2, 'Анна', '2017-08-14 15:00:00', 'Возьму кредит - обязательно куплю', 3);
INSERT INTO comments (product_id, author, datetime, text, rating)
VALUES (1, 'Клавдия Петровна', '2017-04-05 10:30:00', 'Хошие часы. Но батарея слабо держит :(', 4);