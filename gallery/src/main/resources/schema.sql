CREATE SCHEMA IF NOT EXISTS sgallery;

CREATE TABLE IF NOT EXISTS sgallery.users (
  user_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  email VARCHAR(512) NOT NULL UNIQUE,
  username VARCHAR(255) NOT NULL UNIQUE,
  password_hash VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
   role VARCHAR(255) NOT NULL CHECK (role IN ('MODERATOR','USER')),
  status varchar(255) NOT NULL CHECK (status IN ('ACTIVE','BLOCKED'))
);


CREATE TABLE IF NOT EXISTS sgallery.pictures (
  picture_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  owner_id BIGINT NOT NULL,
  file_name VARCHAR(255) NOT NULL,
  file_size BIGINT NOT NULL,
  uploaded TIMESTAMP WITHOUT TIME ZONE,
  FOREIGN KEY(owner_id) REFERENCES sgallery.users(user_id)
);
