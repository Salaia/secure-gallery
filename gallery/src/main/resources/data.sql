-- moderator/moderator calculated by https://bcrypt-generator.com/

INSERT INTO sgallery.users (EMAIL, USERNAME, PASSWORD_HASH, NAME, STATUS, ROLE) VALUES ('moder@sgalleryservice.com', 'moderator', '$2a$12$tNUJdWBGAMX6aDW72s3m9u1fwvhmZjpI/YYRaRP9KYbIi1gd6Y/KG', 'moder', 'ACTIVE', 'MODERATOR') ON CONFLICT DO NOTHING;


