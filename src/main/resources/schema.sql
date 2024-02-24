create schema netology;

CREATE TABLE netology.CUSTOMERS (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    surname VARCHAR,
    age INT,
    phone_number VARCHAR
);

CREATE TABLE netology.ORDERS (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP,
    customer_id INT,
    product_name VARCHAR,
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);

insert into netology.CUSTOMERS(id, name, surname, age, phone_number)
values (1, 'Ivan', 'Ivanov', 25, '89123123123');
insert into netology.CUSTOMERS(id, name, surname, age, phone_number)
values (2, 'Petr', 'Petrov', 30, '4234234234');
insert into netology.CUSTOMERS(id, name, surname, age, phone_number)
values (3, 'Boris', 'Borisov', 20, '123456789');
insert into netology.CUSTOMERS(id, name, surname, age, phone_number)
values (4, 'Oleg', 'Olegov', 50, '88144238234');

insert into netology.ORDERS(id, customer_id, product_name, amount)
values (1, 1, 'watch', 10);
insert into netology.ORDERS(id, customer_id, product_name, amount)
values (2, 2, 'phone', 20);
insert into netology.ORDERS(id, customer_id, product_name, amount)
values (3, 3, 'laptop', 30);
insert into netology.ORDERS(id, customer_id, product_name, amount)
values (4, 4, 'car', 40);
insert into netology.ORDERS(id, customer_id, product_name, amount)
values (5, 4, 'house', 50);