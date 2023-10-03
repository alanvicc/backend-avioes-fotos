-- db/migration/V1__create_plane_table.sql

CREATE TABLE plane (
    id serial PRIMARY KEY,
    title VARCHAR(255),
    image VARCHAR(255),
    company VARCHAR(255)
);
