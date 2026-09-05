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