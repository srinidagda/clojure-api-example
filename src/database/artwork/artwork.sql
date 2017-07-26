-- name: artwork-details
select artwork.id as artworkId, artwork.name as artworkName,
       artist.id as artistId, concat_ws(' ',trim(concat_ws(' ',artist.first_name,artist.middle_name)),artist.last_name) as artistName
from artwork artwork
     inner join artist artist on artist.id = artwork.artist_id
where artwork.id = :id
and artwork.status = 1

-- name: artworks
select id as id, name as name
from artwork
where status = 1
order by id limit 10

-- name: create-city<!
INSERT INTO test.city(name) values(:name) returning id
