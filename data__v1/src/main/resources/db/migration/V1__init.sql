CREATE TABLE IF NOT EXISTS Table1 (
    id SERIAL,
    nui varchar (13) NOT NULL,
    fullname VARCHAR (100) NOT NULL,
    address VARCHAR (50),
    PRIMARY KEY (id),
    UNIQUE (nui)
);
CREATE TABLE IF NOT EXISTS Table2 (
    id SERIAL,
    table1_id INT NOT NULL REFERENCES Table1(id),
    name VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)
    );
