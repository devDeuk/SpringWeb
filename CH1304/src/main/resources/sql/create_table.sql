CREATE TABLE ITEM3(
	item_id INTEGER(5) AUTO_INCREMENT,
	item_name VARCHAR(20),
	price INTEGER(6),
	description VARCHAR(50),
	PRIMARY KEY (item_id)
);

CREATE TABLE item_attach (
	fullName VARCHAR(150) NOT NULL,
    item_id INTEGER(5) NOT NULL,
    regdate TIMESTAMP DEFAULT now(),
    PRIMARY KEY (fullName)
);
 
ALTER TABLE item_attach ADD CONSTRAINT fk_item_attach
FOREIGN KEY (item_id) REFERENCES item3 (item_id);
