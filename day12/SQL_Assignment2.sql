CREATE TABLE Delivery_partners (
    partner_id SERIAL PRIMARY KEY,
    partner_name VARCHAR(100),
    phone_number VARCHAR(15),
    rating DECIMAL(2, 1)
);
INSERT INTO Delivery_partners (partner_name, phone_number, rating) VALUES 
('Partner A', '1234567890', 4.5),
('Partner B', '0987654321', 3.8);

SELECT partner_id, partner_name, phone_number
FROM Delivery_partners
WHERE rating BETWEEN 3 AND 5
ORDER BY partner_id;


CREATE TABLE Customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(100),
    address VARCHAR(255),
    phone_number VARCHAR(15),
    email_id VARCHAR(100)
);
INSERT INTO Customers (customer_id, customer_name, address, phone_number, email_id) VALUES 
('CUST1001', 'John Doe', '123 Elm St', '1112223333', 'john@gmail.com'),
('CUST1002', 'Jane Smith', '456 Oak St', '4445556666', 'jane@yahoo.com'),
('CUST1003', 'Ashwini Das', '123 Als St', '1112229907', 'ashwini@gmail.com'),
('CUST1004', 'Alice Johnson', '789 Pine St', '7778889999', 'alice@gmail.com'),
('CUST1005', 'Jagdish', '123 Umm St', '1112222345', 'jagdish@gmail.com'),
('CUST1006', 'Ravi', '133 Begur', '1112227896', 'ravi@gmail.com');

select * from Customers
UPDATE Customers
SET phone_number = '9876543210'
WHERE customer_id = 'CUST1004';

SELECT customer_id, customer_name, address, phone_number
FROM Customers
WHERE email_id LIKE '%@gmail.com'
ORDER BY customer_id;

ALTER TABLE Orders
ALTER COLUMN customer_id TYPE INT USING customer_id::INT;


CREATE TABLE Hotel_details (
    hotel_id SERIAL PRIMARY KEY,
    hotel_name VARCHAR(100),
    hotel_type VARCHAR(50),
    rating DECIMAL(2, 1)
);
INSERT INTO Hotel_details (hotel_name, hotel_type, hotel_rating) VALUES 
('A2B', 'VEG', 4.0),
('Hotel XYZ', 'NON-VEG', 3.5);
select * from Hotel_details

ALTER TABLE Hotel_Details
RENAME COLUMN Rating TO Hotel_Rating;

SELECT hotel_name || ' is a ' || hotel_type AS HOTEL_INFO
FROM Hotel_details
ORDER BY hotel_name DESC;

CREATE TABLE Orders (
    order_id SERIAL PRIMARY KEY,
    customer_id VARCHAR(10),
    hotel_id INT,
    order_amount DECIMAL(10, 2),
    order_date DATE,
    salesman_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (hotel_id) REFERENCES Hotel_details(hotel_id)
);
delete from orders
select * from orders
INSERT INTO Orders (customer_id, hotel_id, order_amount, order_date, salesman_id) VALUES 
('CUST1001', 1, 250.00, '2019-05-12', 1),
('CUST1002', 2, 300.00, '2019-06-15', 1),
('CUST1003', 2, 300.00, '2019-06-18', 1),
('CUST1004', 2, 400.00, '2019-06-19', 1),
('CUST1005', 2, 500.00, '2019-06-22', 1),
('CUST1006', 2, 400.00, '2019-06-29', 1);


select * from orders

SELECT hd.hotel_id, hd.hotel_name, COUNT(o.order_id) AS NO_OF_ORDERS
FROM Hotel_details hd
JOIN Orders o ON hd.hotel_id = o.hotel_id
GROUP BY hd.hotel_id, hd.hotel_name
HAVING COUNT(o.order_id) > 4
ORDER BY hd.hotel_id ASC;

SELECT hd.hotel_id, hd.hotel_name, hd.hotel_type
FROM Hotel_details hd
LEFT JOIN Orders o ON hd.hotel_id = o.hotel_id AND EXTRACT(MONTH FROM o.order_date) = 5 AND EXTRACT(YEAR FROM o.order_date) = 2019
WHERE o.order_id IS NULL
ORDER BY hd.hotel_id ASC;

SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN Hotel_details h ON o.hotel_id = h.hotel_id
ORDER BY o.order_id ASC;

CREATE TABLE PIZZA (
    pizza_id SERIAL PRIMARY KEY,
    pizza_name VARCHAR(100),
    pizza_type VARCHAR(50),
    amount DECIMAL(10, 2)
);

INSERT INTO PIZZA (pizza_name, pizza_type, amount) VALUES 
('Margherita', 'Small', 8.99),
('Pepperoni', 'Medium', 12.99),
('Veggie Supreme', 'Large', 15.99),
('Meat Lovers', 'Extra Large', 19.99),
('BBQ Chicken', 'Extra Large', 20.99);

UPDATE PIZZA 
SET amount = amount * 0.97 
WHERE pizza_type = 'Extra Large';
select * from PIZZA


CREATE TABLE Salesman (
    salesman_id SERIAL PRIMARY KEY,
    salesman_name VARCHAR(100),
    phone_number VARCHAR(15)
);

INSERT INTO Salesman (salesman_name, phone_number) VALUES 
('Salesman A', '5556667777'),
('Salesman B', '8889990000');


CREATE TABLE Orders (
    order_id SERIAL PRIMARY KEY,
    customer_id INT,
    hotel_id INT,
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES Salesman(salesman_id)
);

CREATE TABLE Supplier (
    supplier_id SERIAL PRIMARY KEY,
    supplier_name VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO Supplier (supplier_name, email) VALUES 
('Supplier A', 'supplierA@example.com'),
('Supplier B', 'supplierB@example.com');

ALTER TABLE Supplier 
ADD CONSTRAINT check_supplier_email CHECK (email LIKE '%@%.%');





