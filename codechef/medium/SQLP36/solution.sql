-- your code goes here
select user_id, count(property_id) as favorite_count 
from favorites 
group by user_id
order by favorite_count desc
limit 1;