SELECT * from customers;



/* Instructions*/
/* Write SQL queries to accomplish the following tasks:*/
/* Display the name, product line, and buy price of all products. The output columns should display as: “Name,” “Product Line,” and “Buy Price.” The output should display the most expensive items first.*/ 
SELECT productName AS 'Name', productLine AS 'Product Line', buyPrice AS 'Buy Price' from products;
/*Display the first name, last name, and city name of all customers from Germany. The output columns should display as: “First Name,” “Last Name,” and “City.” The output should be sorted by “Last Name” (ascending).*/
SELECT contactFirstName AS "First Name", contactLastName AS "Last Name", city AS "City" from customers ORDER BY contactLastName ASC; 
/* Display each of the unique values of the status field in the orders table. The output should be sorted alphabetically, ascending.*/ 
/*Hint: The output should show exactly six rows.*/
SELECT DISTINCT status 
FROM orders ORDER BY status ASC;
/* Display all fields from the payments table for payments made on or after January 1, 2005. The output should be sorted by the payment date from highest to lowest.*/
SELECT * FROM payments WHERE paymentDate >= '2005-01-01' ORDER BY paymentDate DESC;
/* Display the last Name, first Name, email address, and job title of all employees working out of the San Francisco office. The output should be sorted by “Last Name.”*/
/* Display the last name, first name, email address, and job title of all employees working out of the San Francisco office. The output should be sorted by “Last Name.” */

SELECT 
    e.lastName AS 'Last Name', 
    e.firstName AS 'First Name', 
    e.email AS 'Email Address', 
    e.jobTitle AS 'Job Title'
FROM 
    employees e
JOIN 
    offices o ON e.officeCode = o.officeCode
WHERE 
    o.city = 'San Francisco'
ORDER BY 
    e.lastName;

/* Display the name, product line, scale, and vendor of all of the car products – both classic and vintage. */
/*The output should display all vintage cars first (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name). */
/* Display the name, product line, scale, and vendor of all of the car products – both classic and vintage. */
/* The output should display all vintage cars first (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name). */

SELECT 
    productName AS 'Name', 
    productLine AS 'Product Line', 
    productScale AS 'Scale', 
    productVendor AS 'Vendor'
FROM 
    products
WHERE 
    productLine = 'Vintage Cars'
ORDER BY 
    productName ASC

UNION ALL

SELECT 
    productName AS 'Name', 
    productLine AS 'Product Line', 
    productScale AS 'Scale', 
    productVendor AS 'Vendor'
FROM 
    products
WHERE 
    productLine = 'Classic Cars'
ORDER BY 
    productName ASC;


SELECT    orderNumber, orderlinenumber, quantityOrdered * priceEach
FROM    orderdetails
ORDER BY   quantityOrdered * priceEach DESC;

SELECT 
    orderNumber,
    orderLineNumber,
    quantityOrdered * priceEach AS subtotal
FROM    orderdetails
ORDER BY subtotal DESC;

SELECT    firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo DESC;

/* GLAB - 304.5.1 */
SELECT orderNumber, SUM(quantityOrdered) as Qty,
    IF(MOD(SUM(quantityOrdered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    orderNumber
ORDER BY    orderNumber;    

