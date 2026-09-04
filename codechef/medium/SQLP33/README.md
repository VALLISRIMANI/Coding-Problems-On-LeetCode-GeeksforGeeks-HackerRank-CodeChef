# SQLP33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Advanced SQL Subquery Rating Filter
### Task

List all properties with their average rating greater than 4 and the number of reviews they have received.
Present the results in ascending order of property IDs.

- You can refer to the dataset here.

 **Expected Output** 

```
┌─────────────┬───────────────────────┬─────────────────────┬────────────────┬──────────────┐
│ property_id │         title         │      location       │ average_rating │ review_count │
├─────────────┼───────────────────────┼─────────────────────┼────────────────┼──────────────┤
│ 1           │ City Center Apartment │ New York, NY        │ 4.35           │ 2            │
│ 3           │ Elegant Townhouse     │ London, UK          │ 4.5            │ 2            │
│ 6           │ Luxury Beach House    │ Miami, FL           │ 4.25           │ 2            │
│ 7           │ Urban Studio          │ Paris, France       │ 4.6            │ 1            │
│ 8           │ Country House         │ Tuscany, Italy      │ 4.7            │ 2            │
│ 9           │ Studio Apartment      │ Tokyo, Japan        │ 4.75           │ 2            │
│ 10          │ Cozy Cabin            │ Lake Tahoe, CA      │ 4.5            │ 1            │
│ 11          │ Lakeside Villa        │ Geneva, Switzerland │ 4.3            │ 1            │
│ 12          │ Ski Resort Chalet     │ Whistler, Canada    │ 4.8            │ 1            │
│ 13          │ Historic Mansion      │ Rome, Italy         │ 4.15           │ 2            │
│ 16          │ Countryside Farmhouse │ Provence, France    │ 4.5            │ 1            │
│ 18          │ Mountain Retreat      │ Banff, Canada       │ 4.5            │ 2            │
│ 19          │ Vineyard Estate       │ Napa Valley, CA     │ 4.2            │ 1            │
│ 20          │ City View Condo       │ Dubai, UAE          │ 4.45           │ 2            │
│ 22          │ Beachfront Villa      │ Phuket, Thailand    │ 4.2            │ 1            │
└─────────────┴───────────────────────┴─────────────────────┴────────────────┴──────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T13:47:39.137Z  

```sql
-- your code goes here
select p.property_id, p.title, p.location, stats.average_rating, stats.review_count
from properties p
join (
    select property_id, avg(rating) as average_rating, count(*) as review_count from reviews group by property_id
) stats on p.property_id = stats.property_id
where stats.average_rating > 4
order by p.property_id;

```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP33)