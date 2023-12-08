\connect testdb;

CREATE TABLE example.hello(
	id BIGSERIAL PRIMARY KEY NOT NULL,
	code varchar(50) NOT NULL,
	description varchar(200) NOT NULL
);
ALTER TABLE example.hello
  OWNER TO testdb_usr;
