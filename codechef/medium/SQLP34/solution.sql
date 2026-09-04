-- your code goes here
select p.property_id, p.title, p.location, p.rating, (
    select avg(rating) from properties) as  avg_all_ratings 
from properties p 
where p.rating > (
    select avg(rating) from properties) 
order by p.property_id;