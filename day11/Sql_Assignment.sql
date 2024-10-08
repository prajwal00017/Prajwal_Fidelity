CREATE TABLE tblCustomers (
    CustomerID SERIAL PRIMARY KEY,
    CompanyName VARCHAR(50),
    ContactName VARCHAR(50),
    ContactTitle VARCHAR(50),
    Address VARCHAR(100),
    City VARCHAR(50),
    Region VARCHAR(50),
    PostalCode VARCHAR(15),
    Country VARCHAR(50) DEFAULT 'Canada',
    Phone VARCHAR(20),
    Fax VARCHAR(20)
);

CREATE TABLE tblSuppliers (
    SupplierID SERIAL PRIMARY KEY,
    CompanyName VARCHAR(50),
    Address VARCHAR(100),
    City VARCHAR(50),
	Province VARCHAR(50)
    
);

CREATE TABLE tblShippers (
    ShipperID SERIAL PRIMARY KEY,
    CompanyName VARCHAR(50) UNIQUE
);

CREATE TABLE tblProducts (
    ProductID SERIAL PRIMARY KEY,
    ProductName VARCHAR(50),
    SupplierID INT REFERENCES tblSuppliers(SupplierID),
    CategoryID INT,
    QuantityPerUnit VARCHAR(50),
    UnitPrice NUMERIC(10, 2),
    UnitsInStock INT,
    UnitsOnOrder INT,
    ReorderLevel INT,
    Discontinued BOOLEAN
);

CREATE TABLE tblOrders (
    OrderID SERIAL PRIMARY KEY,
    CustomerID INT REFERENCES tblCustomers(CustomerID),
    EmployeeID INT,
    OrderDate DATE,
    RequiredDate DATE,
    ShippedDate DATE,
    ShipVia VARCHAR(50),
    Freight NUMERIC(10, 2),
    ShipName VARCHAR(50),
    ShipAddress VARCHAR(100),
    ShipCity VARCHAR(50),
    ShipRegion VARCHAR(50),
    ShipPostalCode VARCHAR(15),
    ShipCountry VARCHAR(50)
);

CREATE TABLE tblOrderDetails (
    OrderID INT REFERENCES tblOrders(OrderID),
    ProductID INT REFERENCES tblProducts(ProductID),
    UnitPrice NUMERIC(10, 2),
    Quantity INT CHECK (Quantity > 10),
    Discount NUMERIC(10, 2),
    PRIMARY KEY (OrderID, ProductID)
);

INSERT INTO tblCustomers (CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode,Phone, Fax)
VALUES
('Fidelity', 'Abigail', 'CEO', 'e-city', 'Texas', 'Texas', '14376','030-0012345', '030-0012345');
select * from tblShippers

INSERT INTO tblSuppliers (CompanyName, Address, City, Province)
VALUES
('Knacktech','London', 'Surrey', 'UK');

INSERT INTO tblShippers (CompanyName)
VALUES
('DTDC');

INSERT INTO tblShippers (CompanyName)
VALUES
('DTDC');

INSERT INTO tblProducts (ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES
('Sugar', 1, 1, '10 boxes x 20 bags', 18.00, 39, 0, 10,false)
select * from tblOrderDetails
 
INSERT INTO tblOrders (CustomerID, EmployeeID, OrderDate, RequiredDate, ShippedDate, ShipVia, Freight, ShipName, ShipAddress, ShipCity, ShipRegion, ShipPostalCode, ShipCountry)
VALUES
(123, 123, '2023-01-01', '2023-01-15', '2023-01-10', 1, 10.00,'Abigail','Alkapuri','Vadodara','Vadodara','39001','India')

INSERT INTO tblOrderDetails (OrderID, ProductID, UnitPrice, Quantity, Discount)
VALUES
(11, 11, 30.00, 10, 0.15);