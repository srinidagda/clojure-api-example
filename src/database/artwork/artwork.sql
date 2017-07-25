-- name: artwork-details
select id as id, name as name
from artwork
where id = :id

-- name: artworks
select id as id, name as name
from artwork
where status = 1
order by id limit 10

-- name: create-city<!
INSERT INTO test.city(name) values(:name) returning id
