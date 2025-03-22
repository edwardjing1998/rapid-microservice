
-- Clear existing data
DELETE FROM user_authorities;
DELETE FROM authorities;
DELETE FROM users;


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

-- Insert into SYS_PRINS
INSERT INTO SYS_PRINS (SYS_PRIN, CLIENT, CUST_TYPE, START_DATE, UNDELIVERABLE, STAT_A, STAT_B, STAT_C, STAT_D, STAT_E, STAT_F, STAT_G, STAT_H, STAT_I, STAT_J, STAT_K, STAT_L, STAT_M, STAT_N, STAT_O, STAT_P, STAT_Q, STAT_R, STAT_S, STAT_T, STAT_U, STAT_V, STAT_W, STAT_X, STAT_Y, STAT_Z, PO_BOX, NO_RENEWAL, BLOCK_CARD, ADDR_FLAG, TEMP_AWAY, RSP, SESSION, BAD_STATE, A_STAT_RCH, NM_13, TEMP_AWAY_ATTS, REPORT_METHOD, CONTACT, PHONE, ACTIVE, NOTES, RET_STAT, DES_STAT, NON_US) VALUES
 ('SYS001', 'CLIENT1', 'TypeA', '2024-01-01', 'Return', 'stat_a 1', 'stat_b 1', 'stat_c 1', 'stat_d 1', 'stat_e 1', 'stat_f 1', 'stat_g 1', 'stat_h 1', 'stat_i 1', 'stat_j 1', 'stat_k 1', 'stat_l 1', 'stat_m 1', 'stat_n 1', 'stat_o 1', 'stat_p 1', 'stat_q 1', 'stat_r 1', 'stat_s 1', 'stat_t 1', 'stat_u 1', 'stat_v 1', 'stat_w 1', 'stat_x 1', 'stat_y 1', 'stat_z 1', 'Return', 'N', 'N', 'Invalid', 5, 'Y', 'Session1', 'Return', 'N', 'Y', 1, 'Method1', 'John Doe', '123-456-7890', 'Y', 'Note1', 'Return Status 1', 'Destroy Status 1', 'Return'),
 ('SYS002', 'CLIENT2', 'TypeB', '2024-02-01', 'Destroy', 'stat_a 2', 'stat_b 2', 'stat_c 2', 'stat_d 2', 'stat_e 2', 'stat_f 2', 'stat_g 2', 'stat_h 2', 'stat_i 2', 'stat_j 2', 'stat_k 2', 'stat_l 2', 'stat_m 2', 'stat_n 2', 'stat_o 2', 'stat_p 2', 'stat_q 2', 'stat_r 2', 'stat_s 2', 'stat_t 2', 'stat_u 2', 'stat_v 2', 'stat_w 2', 'stat_x 2', 'stat_y 2', 'stat_z 2', 'Destroy', 'Y', 'Y', 'Valid', 15, 'N', 'Session2', 'Destroy',  'Y', 'N', 0, 'Method2', 'Jane Smith', '987-654-3210', 'N', 'Note2', 'Return Status 2', 'Destroy Status 2', 'Return'),
 ('SYS003', 'CLIENT3', 'TypeC', '2024-03-01', 'In Process', 'stat_a 3', 'stat_b 3', 'stat_c 3', 'stat_d 3', 'stat_e 3', 'stat_f 3', 'stat_g 3', 'stat_h 3', 'stat_i 3', 'stat_j 3', 'stat_k 3', 'stat_l 3', 'stat_m 3', 'stat_n 3', 'stat_o 3', 'stat_p 3', 'stat_q 3', 'stat_r 3', 'stat_s 3', 'stat_t 3', 'stat_u 3', 'stat_v 3', 'stat_w 3', 'stat_x 3', 'stat_y 3', 'stat_z 3', 'Return', 'N', 'N', 'Invalid', 8, 'Y', 'Session3', 'Return', 'N', 'Y', 3, 'Method3', 'Alice Brown', '555-123-6789', 'Y', 'Note3', 'Return Status 3', 'Destroy Status 3', 'Destroy');

-- Insert into REPORT_ADDRESS
INSERT INTO REPORT_ADDRESS (SYS_PRIN, CLIENT, NAME, ACCOUNT, FIRST_NAME, LAST_NAME, ADDR_1, ADDR_2, CITY, STATE, ZIP, OLD_ADDR1, OLD_ADDR2, OLD_CITY, OLD_STATE, OLD_ZIP) VALUES
('SYS001', 'CLIENT1', 'John Doe', 'ACC123', 'John', 'Doe', '123 Main St', 'Apt 4B', 'New York', 'NY', '10001', '456 Old St', 'Apt 3C', 'Los Angeles', 'CA', '90001'),
('SYS002', 'CLIENT2', 'Jane Smith', 'ACC456', 'Jane', 'Smith', '456 Elm St', 'Suite 200', 'San Francisco', 'CA', '94102', '789 Past St', 'Suite 100', 'Chicago', 'IL', '60601'),
('SYS003', 'CLIENT3', 'Alice Brown', 'ACC789', 'Alice', 'Brown', '789 Oak St', 'Floor 5', 'Miami', 'FL', '33101', '321 Last St', 'Floor 2', 'Dallas', 'TX', '75201');

-- Insert into PIN_ATM_TOTALS
INSERT INTO PIN_ATM_TOTALS (SYS_PRIN, CLIENT, ACTION_ID, CASE_NUMBER, DATE_TIME, ACCOUNT, NAME, BILLING_SP, CUST_TYPE, WORK_IND) VALUES
 ('SYS001', 'CLIENT1', 'ACT100', 'CASE001', '2024-03-17 12:00:00', 'ACC123', 'John Doe', 'BSP001', 'TypeA', 'W1'),
 ('SYS002', 'CLIENT2', 'ACT200', 'CASE002', '2024-03-18 14:30:00', 'ACC456', 'Jane Smith', 'BSP002', 'TypeB', 'W2'),
 ('SYS001', 'CLIENT1', 'ACT100', 'CASE001', '2024-03-17 12:00:00', 'ACC123', 'John Doe', 'BSP001', 'TypeA', 'W1'),
 ('SYS002', 'CLIENT2', 'ACT200', 'CASE002', '2024-03-18 14:30:00', 'ACC456', 'Jane Smith', 'BSP002', 'TypeB', 'W2'),
 ('SYS001', 'CLIENT1', 'ACT100', 'CASE001', '2024-03-17 12:00:00', 'ACC123', 'John Doe', 'BSP001', 'TypeA', 'W1'),
 ('SYS002', 'CLIENT2', 'ACT200', 'CASE002', '2024-03-18 14:30:00', 'ACC456', 'Jane Smith', 'BSP002', 'TypeB', 'W2'),
 ('SYS001', 'CLIENT1', 'ACT100', 'CASE001', '2024-03-17 12:00:00', 'ACC123', 'John Doe', 'BSP001', 'TypeA', 'W1'),
 ('SYS002', 'CLIENT2', 'ACT200', 'CASE002', '2024-03-18 14:30:00', 'ACC456', 'Jane Smith', 'BSP002', 'TypeB', 'W2'),
 ('SYS003', 'CLIENT3', 'ACT300', 'CASE003', '2024-03-19 16:45:00', 'ACC789', 'Alice Brown', 'BSP003', 'TypeC', 'W3');

INSERT INTO CLIENTS (client, name, addr, city, state, zip, contact, phone, active) VALUES
    ('CLIENT1', 'Alpha Corp', '123 Main St', 'New York', 'NY', '10001', 'John Doe', '123-456-7890', true),
    ('CLIENT2', 'Beta Inc', '456 Elm St', 'Los Angeles', 'CA', '90001', 'Jane Smith', '234-567-8901', true),
    ('CLIENT3', 'Gamma Ltd', '789 Oak St', 'Chicago', 'IL', '60601', 'Alice Brown', '345-678-9012', false),
    ('CLIENT4', 'Delta LLC', '321 Pine St', 'Houston', 'TX', '77001', 'Robert Johnson', '456-789-0123', true),
    ('CLIENT5', 'Epsilon Enterprises', '654 Cedar St', 'Phoenix', 'AZ', '85001', 'Michael Wilson', '567-890-1234', false),
    ('CLIENT6', 'Zeta Solutions', '987 Birch St', 'Philadelphia', 'PA', '19101', 'Emily Davis', '678-901-2345', true),
    ('CLIENT7', 'Eta Technologies', '147 Maple St', 'San Antonio', 'TX', '78201', 'David White', '789-012-3456', true),
    ('CLIENT8', 'Theta Innovations', '258 Walnut St', 'San Diego', 'CA', '92101', 'Sophia Martinez', '890-123-4567', true),
    ('CLIENT9', 'Iota Systems', '369 Spruce St', 'Dallas', 'TX', '75201', 'James Anderson', '901-234-5678', false),
    ('CLIENT10', 'Kappa Consulting', '159 Redwood St', 'San Jose', 'CA', '95101', 'Olivia Thomas', '012-345-6789', true),
    ('CLIENT11', 'Lambda Networks', '753 Fir St', 'Austin', 'TX', '73301', 'Benjamin Scott', '123-456-7890', false),
    ('CLIENT12', 'Mu Financials', '852 Palm St', 'San Francisco', 'CA', '94101', 'Isabella Harris', '234-567-8901', true),
    ('CLIENT13', 'Nu Security', '951 Aspen St', 'Boston', 'MA', '02101', 'William Carter', '345-678-9012', true),
    ('CLIENT14', 'Xi Software', '357 Cherry St', 'Seattle', 'WA', '98101', 'Charlotte Rodriguez', '456-789-0123', true),
    ('CLIENT15', 'Omicron Logistics', '258 Poplar St', 'Denver', 'CO', '80201', 'Henry Martinez', '567-890-1234', false),
    ('CLIENT16', 'Pi Marketing', '159 Dogwood St', 'Las Vegas', 'NV', '89101', 'Mia Clark', '678-901-2345', true),
    ('CLIENT17', 'Rho Retail', '753 Beech St', 'Miami', 'FL', '33101', 'Alexander Hall', '789-012-3456', false),
    ('CLIENT18', 'Sigma Consulting', '852 Cypress St', 'Portland', 'OR', '97201', 'Harper Lewis', '890-123-4567', true),
    ('CLIENT19', 'Tau Engineering', '951 Magnolia St', 'Atlanta', 'GA', '30301', 'Evelyn Young', '901-234-5678', true),
    ('CLIENT20', 'Upsilon AI', '357 Willow St', 'Charlotte', 'NC', '28201', 'Liam King', '012-345-6789', false);



