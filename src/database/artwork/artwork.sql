-- name: artwork-details
select id as id, name as name
from artwork
where id = :id
order by id limit 100

-- name: artworks
select id as id, name as name
from artwork
where status = 1
order by id limit 10
