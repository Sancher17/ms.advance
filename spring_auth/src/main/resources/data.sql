
INSERT INTO users (username, password, enabled) values ('user', '$2a$12$F7g6osnuKCwPYwZUtliqpeP3iyimkA8T4QjHBKrfOAuvkcg4slloi', true);
INSERT INTO users (username, password, enabled) values ('admin', '$2a$12$F7g6osnuKCwPYwZUtliqpeP3iyimkA8T4QjHBKrfOAuvkcg4slloi', true);
INSERT INTO users (username, password, enabled) values ('guest', '$2a$12$F7g6osnuKCwPYwZUtliqpeP3iyimkA8T4QjHBKrfOAuvkcg4slloi', true);

INSERT INTO authorities (username, authority) values ('user', 'VIEW_USER');
INSERT INTO authorities (username, authority) values ('admin', 'VIEW_ADMIN');
INSERT INTO authorities (username, authority) values ('guest', 'VIEW_GUEST');
