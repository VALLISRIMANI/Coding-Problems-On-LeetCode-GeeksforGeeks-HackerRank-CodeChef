# Managers with at Least 5 Direct Reports

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Table: `Employee`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| department  | varchar |
| managerId   | int     |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table indicates the name of an employee, their department, and the id of their manager.
If managerId is null, then the employee does not have a manager.
No employee will be the manager of themself.

```

 

Write a solution to find managers with at least  **five direct reports**.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employee table:
+-----+-------+------------+-----------+
| id  | name  | department | managerId |
+-----+-------+------------+-----------+
| 101 | John  | A          | null      |
| 102 | Dan   | A          | 101       |
| 103 | James | A          | 101       |
| 104 | Amy   | A          | 101       |
| 105 | Anne  | A          | 101       |
| 106 | Ron   | B          | 101       |
+-----+-------+------------+-----------+
Output: 
+------+
| name |
+------+
| John |
+------+

```

## Solution

**Language:** SQL  
**Runtime:** 92 ms  
**Memory:** 0B  
**Submitted:** 2026-11-27T13:58:57.636Z  

```sql
# Write your MySQL query statement below
select name 
from employee 
where id in (
    select managerId 
    from employee 
    group by managerId 
    having count(managerId) >= 5
);
```

---

[View on LeetCode](https://leetcode.com/problems/managers-with-at-least-5-direct-reports/)