create table IF NOT EXISTS oauth_client_details (
  client_id VARCHAR(255) PRIMARY KEY,
  resource_ids VARCHAR(256),
  client_secret VARCHAR(256),
  scope VARCHAR(256),
  authorized_grant_types VARCHAR(256),
  web_server_redirect_uri VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additional_information VARCHAR(4096),
  autoapprove VARCHAR(256)
);

create table IF NOT EXISTS oauth_client_token (
  token_id VARCHAR(256),
  token LONG VARBINARY,
  authentication_id VARCHAR(255) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256)
);

create table IF NOT EXISTS oauth_access_token (
  token_id VARCHAR(256),
  token LONG VARBINARY,
  authentication_id VARCHAR(255) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256),
  authentication LONG VARBINARY,
  refresh_token VARCHAR(256)
);

create table IF NOT EXISTS oauth_refresh_token (
  token_id VARCHAR(256),
  token LONG VARBINARY,
  authentication LONG VARBINARY
);

create table IF NOT EXISTS oauth_code (
  code VARCHAR(256), authentication LONG VARBINARY
);

create table IF NOT EXISTS users (
username VARCHAR(255) NOT NULL ,
password VARCHAR(255) NOT NULL ,
enabled TINYINT NOT NULL DEFAULT 1 ,
PRIMARY KEY (username));

create table IF NOT EXISTS user_roles (
username varchar(255) NOT NULL,
role varchar(255) NOT NULL,
PRIMARY KEY (username),
UNIQUE KEY uni_username_role (role,username),
CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));