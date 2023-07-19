CREATE TABLE t_actors (
                            id bigint(20) NOT NULL auto_increment,
                            name varchar(255) DEFAULT NULL,
                            date_of_birth date DEFAULT NULL,
                            country varchar(255) DEFAULT NULL,
                            PRIMARY KEY (id)
);

CREATE TABLE t_awards (
                            id bigint(20) NOT NULL auto_increment,
                            name varchar(255) DEFAULT NULL,
                            year varchar(255) DEFAULT NULL,
                            description text,
                            PRIMARY KEY (id)
);

CREATE TABLE t_movies (
                            id bigint(20) NOT NULL auto_increment,
                            name varchar(255) DEFAULT NULL,
                            description text,
                            budget int(11) DEFAULT NULL,
                            box_office int(11) DEFAULT NULL,
                            genre varchar(255) DEFAULT NULL,
                            duration int(11) DEFAULT NULL,
                            PRIMARY KEY (id)
);

CREATE TABLE t_nominations (
                                 id bigint(20) NOT NULL auto_increment,
                                 name varchar(255) DEFAULT NULL,
                                 awards_id bigint(20) DEFAULT NULL,
                                 movie_id bigint(20) DEFAULT NULL,
                                 PRIMARY KEY (id),
                                 FOREIGN KEY (awards_id) REFERENCES t_awards (id),
                                 FOREIGN KEY (movie_id) REFERENCES t_movies (id)
);

CREATE TABLE t_permission (
                                id bigint(20) auto_increment,
                                role varchar(255),
                                PRIMARY KEY (id)
);
CREATE TABLE t_users (
                           id bigint(20) auto_increment,
                           email varchar(255),
                           password varchar(255),
                           full_name varchar(255),
                           active tinyint(1) DEFAULT 1,
                           PRIMARY KEY (id)
);

CREATE TABLE t_users_permissions (
                                     user_id bigint(20),
                                     permissions_id bigint(20),
                                     PRIMARY KEY (user_id, permissions_id),
                                     FOREIGN KEY (user_id) REFERENCES t_users (id),
                                     FOREIGN KEY (permissions_id) REFERENCES t_permission (id)
);
CREATE TABLE t_movies_actors (
                                   actors_id bigint(20) NOT NULL,
                                   movie_id bigint(20) NOT NULL,
                                   PRIMARY KEY (actors_id, movie_id),
                                   FOREIGN KEY (actors_id) REFERENCES t_actors (id),
                                   FOREIGN KEY (movie_id) REFERENCES t_movies (id)
);
CREATE TABLE t_movies_nominations (
                                   movie_id bigint(20) NOT NULL,
                                   nominations_id bigint(20) NOT NULL,
                                   PRIMARY KEY (movie_id, nominations_id),
                                   FOREIGN KEY (nominations_id) REFERENCES t_nominations (id),
                                   FOREIGN KEY (movie_id) REFERENCES t_movies (id)
);


CREATE TABLE t_feed_back (
                               id bigint(20) NOT NULL auto_increment,
                               comment varchar(255) DEFAULT NULL,
                               movie_id bigint(20) DEFAULT NULL,
                               user_id bigint(20) DEFAULT NULL,
                               PRIMARY KEY (id),
                               FOREIGN KEY (movie_id) REFERENCES t_movies (id),
                               FOREIGN KEY (user_id) REFERENCES t_users (id)
);