
INSERT INTO users (username, password, authorities, enabled) values ('user', '{bcrypt}$2a$12$F7g6osnuKCwPYwZUtliqpeP3iyimkA8T4QjHBKrfOAuvkcg4slloi', 'VIEW_INFO', true);
INSERT INTO users (username, password, authorities, enabled) values ('admin', '{bcrypt}$2a$12$F7g6osnuKCwPYwZUtliqpeP3iyimkA8T4QjHBKrfOAuvkcg4slloi', 'VIEW_ADMIN',true);
INSERT INTO users (username, password, authorities, enabled) values ('guest', '{bcrypt}$2a$12$F7g6osnuKCwPYwZUtliqpeP3iyimkA8T4QjHBKrfOAuvkcg4slloi','VIEW_INFO', true);

