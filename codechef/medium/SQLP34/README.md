# SQLP34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyze Above Average Property Ratings
### Task

Retrieve properties that have a rating higher than the average rating of all properties in the dataset.
Present the results in ascending order of property IDs.

- You can refer to the dataset here.
### Output Format

property_id
title
location
rating
avg_all_ratings

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T13:51:49.726Z  

```sql
-- your code goes here
select p.property_id, p.title, p.location, p.rating, (
    select avg(rating) from properties) as  avg_all_ratings 
from properties p 
where p.rating > (
    select avg(rating) from properties) 
order by p.property_id;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP34)