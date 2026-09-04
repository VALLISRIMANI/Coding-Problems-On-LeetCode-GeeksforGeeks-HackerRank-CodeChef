-- your code goes here
select p.property_id, p.title, p.location, stats.average_rating, stats.review_count
from properties p
join (
    select property_id, avg(rating) as average_rating, count(*) as review_count from reviews group by property_id
) stats on p.property_id = stats.property_id
where stats.average_rating > 4
order by p.property_id;
