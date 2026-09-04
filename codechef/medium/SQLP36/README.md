# SQLP36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Max User Favorites SQL Challenge
### Task

Get the user with the maximum number of favorite properties.

- You can refer to the dataset here.
### Output Format

user_id
favorite_count

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T13:56:35.561Z  

```sql
-- your code goes here
select user_id, count(property_id) as favorite_count 
from favorites 
group by user_id
order by favorite_count desc
limit 1;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP36)