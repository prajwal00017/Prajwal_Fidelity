CREATE TABLE Title (
    WORKER_REF_ID INT,
    WORKER_TITLE VARCHAR(50),
    AFFECTED_FROM DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

-- Sample Insertion
INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM)
VALUES 
(1, 'Developer', '2020-03-01'),
(2, 'Assistant', '2021-08-15'),
(3, 'Manager', '2017-11-05');
CREATE TABLE Bonus (
    WORKER_REF_ID INT,
    BONUS_AMOUNT DECIMAL(10, 2),
    BONUS_DATE DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

-- Sample Insertion
INSERT INTO Bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE)
VALUES 
(1, 4000.00, '2022-10-21'),
(2, 2500.00, '2021-08-18'),
(3, 6000.00, '2020-06-13');
CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INT)
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary DECIMAL;
    worker_count INTEGER;
BEGIN
    -- Get the nth highest salary
    SELECT DISTINCT salary
    INTO nth_highest_salary
    FROM worker
    ORDER BY salary DESC
    LIMIT 1 OFFSET n - 1;
    
    -- Count workers with the nth highest salary
    SELECT COUNT(*)
    INTO worker_count
    FROM worker
    WHERE salary = nth_highest_salary;

    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;
CREATE TABLE Worker (
    WORKER_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    SALARY DECIMAL(10, 2),
    JOINING_DATE DATE,
    DEPARTMENT VARCHAR(50)
);
SELECT * FROM Bonus
-- Sample Insertion
INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT)
VALUES 
(1, 'Prajwal', 'Singh', 70000.00, '2022-01-01', 'IT'),
(2, 'Micheal', 'Scott', 60000.00, '2018-03-19', 'HR'),
(3, 'Ryan', 'Reynolds', 50000.00, '2019-06-10', 'Marketing');
SELECT W.FIRST_NAME, W.SALARY, T.WORKER_TITLE
FROM Worker W
JOIN Title T ON W.WORKER_ID = T.WORKER_REF_ID;

SELECT get_worker_count_by_nth_highest_salary(3);

