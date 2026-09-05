# SQLP36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### SQL Query Filter Properties Amenities
### Task

Find the properties that have all the following amenities available: 'Heating' and 'Kitchen'.

- You can refer to the dataset here.
### Output Format

property_id
title
location

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T07:03:02.875Z  

```sql
SELECT prop.property_id, prop.title, prop.location
FROM Properties prop
WHERE prop.property_id IN (
    SELECT pa.property_id
    FROM PropertyAmenities pa
    JOIN Amenities am ON pa.amenity_id = am.amenity_id
    WHERE am.name IN ('Heating', 'Kitchen')
    GROUP BY pa.property_id
    HAVING COUNT(DISTINCT am.name) = 2
);
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP36)