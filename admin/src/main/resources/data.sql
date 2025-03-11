
-- Clear existing data
DELETE FROM user_authorities;
DELETE FROM authorities;
DELETE FROM users;
DELETE FROM book;


-- Insert roles into the authorities table
INSERT INTO authorities (id, role) VALUES (1, 'ROLE_ADMIN');
INSERT INTO authorities (id, role) VALUES (2, 'ROLE_USER');
INSERT INTO authorities (id, role) VALUES (3, 'ROLE_MANAGER');
INSERT INTO authorities (id, role) VALUES (4, 'ROLE_EDITOR');

-- Insert users (passwords must be pre-hashed using BCrypt)
INSERT INTO users (id, username, password) VALUES (1, 'admin', 'password');
INSERT INTO users (id, username, password) VALUES (2, 'user1', 'password');
INSERT INTO users (id, username, password) VALUES (3, 'manager', 'password');
INSERT INTO users (id, username, password) VALUES (4, 'editor', 'password');

-- Assign roles to users (mapping users to authorities)
INSERT INTO user_authorities (user_id, authority_id) VALUES (1, 1); -- admin -> ROLE_ADMIN
INSERT INTO user_authorities (user_id, authority_id) VALUES (2, 2); -- user1 -> ROLE_USER
INSERT INTO user_authorities (user_id, authority_id) VALUES (3, 3); -- manager -> ROLE_MANAGER
INSERT INTO user_authorities (user_id, authority_id) VALUES (4, 4); -- editor -> ROLE_EDITOR


-- Insert sample documents
/*INSERT INTO Document (id, title) VALUES (1, 'The Great Gatsby');
INSERT INTO Document (id, title) VALUES (2, '1984');
INSERT INTO Document (id, title) VALUES (3, 'To Kill a Mockingbird');
INSERT INTO Document (id, title) VALUES (4, 'Moby-Dick');*/

-- Insert sample persons (with BCrypt-hashed passwords)
/*INSERT INTO person (id, username, password_hash, role)
VALUES (1, 'admin', '$2a$12$3vO6TnVkkz3/q0BdyzH1OOr9J2vhUKFLA2u6wN4zGgXZm80a.3Nya', 'ADMIN');

INSERT INTO person (id, username, password_hash, role)
VALUES (2, 'user1', '$2a$12$TKN1kgdU5ak9yHkbhSzVh.6i1c3iU03I23ziTb.rXaPq1VgKJ9Bly', 'USER');

INSERT INTO person (id, username, password_hash, role)
VALUES (3, 'manager', '$2a$12$FqF9IcftBQNz5y.DyzMGRO3cZlZCy6ynjMftFviy7B5y22TZhOuT6', 'MANAGER');

INSERT INTO person (id, username, password_hash, role)
VALUES (4, 'editor', '$2a$12$yepOnowX6RmYF39IjU40uO8QxC3V2yU5C8CzNMTG0LzkEM8DJhjqW', 'EDITOR');*/

ALTER TABLE person ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM person);
ALTER TABLE document ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM document);



