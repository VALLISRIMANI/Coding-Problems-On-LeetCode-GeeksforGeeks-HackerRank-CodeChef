# Nth Highest Salary

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Table: `Employee`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.

```

 

Write a solution to find the `nth` highest  **distinct**  salary from the `Employee` table. If there are less than `n` distinct salaries, return `null`.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
n = 2
Output: 
+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| 200                    |
+------------------------+

```

 **Example 2:** 

```
Input: 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
n = 2
Output: 
+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| null                   |
+------------------------+

```

## Solution

**Language:** SQL  
**Runtime:** 426 ms (beats 94.41%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-20T11:46:54.103Z  

```sql
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    # Write your MySQL query statement below.
    SELECT DISTINCT salary 
    FROM (
        SELECT 
            salary,
            DENSE_RANK() OVER(
                ORDER BY salary DESC
        ) AS rnk
        FROM employee
    ) AS ranked_salaries 
    WHERE rnk = N
  );
END
```

---

[View on LeetCode](https://leetcode.com/problems/nth-highest-salary/)