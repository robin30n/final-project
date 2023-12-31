INSERT INTO t_actors (country, date_of_birth, name)
VALUES ('America', '1968-09-25', 'Will Smith'),
       ('America', '1991-08-26', 'Dylan OBrien'),
       ('America', '1990-05-16', 'Thomas Brodie-Sangster'),
       ('America', '1962-07-03', 'Tom Cruise'),
       ('America', '1948-12-21', 'Samuel L. Jackson'),
       ('America', '1974-11-11', 'Leonardo DiCaprio'),
       ('America', '1956-07-09', 'Tom Hanks'),
       ('America', '1957-12-10', 'Michael Clarke Duncan'),
       ('America', '1953-10-11', 'David Morse'),
       ('America', '1961-09-22', 'Bonnie Hunt'),
       ('America', '1940-01-27', 'James Cromwell'),
       ('America', '1952-08-26', 'Michael Jeter'),
       ('Canada', '1980-11-12', 'Ryan Gosling'),
       ('America', '1988-11-06', 'Emma Stone'),
       ('America', '1978-12-28', 'John Legend'),
       ('America', '1955-01-09', 'J.K. Simmons');

INSERT INTO t_awards (description, name, year)
VALUES
    ('Сатурн (Saturn Award) - американская кинопремия, вручаемая Академией научной фантастики, фэнтези и фильмов ужасов с 1972 года по результатам голосования членов Академии.', 'Сатурн', '1973'),
    ('Оскар считается главной кинематографической премией в США. В состав Академии входит чуть более 6000 человек. Через два года после того, как в 1927 году была создана Американская Академия киноискусства, в отеле «Балтимор» состоялся обед, на котором обсуждались способы поощрения выдающихся достижений в области кино. В результате скульптор Джордж Стэнли был избран для создания статуэтки, и на свет появился рыцарь, стоящий на банке с пленкой и держащий в руке меч. Дизайн статуэтки Оскара был разработан Седриком Гиббонсом. Каждая статуэтка изготавливается из покрытого золотом британниума и покоится на постаменте из черного мрамора.', 'Оскар', '1929'),
    ('Церемония вручения наград «Золотой Глобус» является своеобразной разминкой перед вручением «Оскара» - зачастую лауреаты этой премии становятся и обладателями золотых статуэток. Вторая по престижности награда в мире кино присуждается Ассоциацией иностранной прессы Голливуда с 1944 года. В отличие от «Оскара» данная премия имеет отдельные номинации для серьезного кино (драма) и развлекательного (комедия или мюзикл).', 'Золотой глобус', '1944'),
    ('MTV Movie Awards — eжегодная церемония вручения кинонаград MTV — придумана в качестве альтернативы официальным церемониям награждений в области киноискусства. Проходит с 1992 года. Первое принципиальное отличие данной церемонии от других заключается в том, что возможность отдать свои голоса за любимый фильм (или актера) предоставляется обычным зрителям, зрителям телеканала MTV. Второе отличие — набор номинаций, не имеющих аналогов в остальных премиях кинематографа.', 'Премия канала «MTV»', '1992'),
    ('Церемония вручения европейских премий проводится в Берлине каждый нечётный год, по чётным годам церемония награждения проходит в различных европейских городах. Европейская киноакадемия — влиятельная общественная организация, насчитывающая около 2000 членов, объединённых общей целью продвижения европейского кино. Первая церемония вручения европейских премий состоялась в ноябре 1988 года. Окончательно Европейская киноакадемия оформилась в 1989 году как «European Cinema Society», в составе которой было 40 членов, первым президентом «Европейского кинематографического общества» стал Ингмар Бергман.', 'Европейская киноакадемия', '1988'),
    ('Кинонаграда, присуждающаяся Гильдией киноактеров США с 1995 года за кинофильмы и телевизионные сериалы. Победителей награждают бронзовой статуэткой «Актер», высота которой составляет 16 дюймов (40,6 сантиметра), а вес около 5 килограммов. Гильдия актеров является профессиональным союзом, представляющим более 120 000 актеров, работающих в США.', 'Премия Гильдии актеров', '1995'),
    ('BAFTA (англ. The British Academy of Film and Television Arts) - премия Британской академии кино и телевизионных искусств, являющаяся главной церемонией вручения наград в Великобритании. Академия была образована 16 апреля 1947 года под руководством Дэвида Лина (в то время она называлась Британской Академией кино). В настоящий момент в честь Дэвида утверждена специальная награда, вручающаяся за достижения в режиссуре.', 'Британская академия', '1948'),
    ('Международный Венецианский кинофестиваль является старейшим международным кинофестивалем, проводящимся с 1932 года в Венеции на острове Лидо. С 1934 года проводится ежегодно (за исключением 1943-1945 и 1973-1978) во второй половине года (чаще в августе-сентябре). Венецианская Мостра (Mostra Internationale darte cinematografica) - так называют фестиваль сами итальянцы.', 'Венецианский кинофестиваль', '1932');

INSERT INTO t_movies (budget, box_office, description, duration, genre, name)
VALUES
(5, 11, 'Где-то в глубинах космоса затерялась странная планета Игам. Правят ею драги - гигантские голубые существа с красными глазами, обладающие сверхвысоким уровнем развития. Кроме них на Игаме живут омы - розовотелые миниатюрные гуманоиды, домашние животные драгов. Постепенно на Игаме разворачивается борьба угнетенных омов против своих хозяев-гигантов за теплое место под тусклым солнцем, за жизнь и свободу. В итоге драги решают полностью уничтожить омов.', 72, 'Боевик', 'HUNTER PLANAET'),
(388, 19,'Marty travels back in time using an eccentric scientists time machine. However, he must make his high-school-aged parents fall in love in order to return to the present',116,'comedy','back into the future'),
    (286,90,'Пол Эджкомб начальник блока смертников в тюрьме «Холодная гора», каждый из узников которого однажды проходит «зеленую милю» по пути к месту казни. Пол повидал много заключённых и надзирателей за время работы. Однако гигант Джон Коффи, обвинённый в страшном преступлении, стал одним из самых необычных обитателей блока',189,'драма','Зеленая миля'),
    (2264,240,'В первом и последнем плавании шикарного «Титаника» встречаются двое. Пассажир нижней палубы Джек выиграл билет в карты, а богатая наследница Роза отправляется в Америку, чтобы выйти замуж по расчёту. Чувства молодых людей только успевают расцвести, и даже не классовые различия создадут испытания влюблённым, а айсберг, вставший на пути считавшегося непотопляемым лайнера.',194,'драма','Титаник'),
    (447,30,'Это история любви старлетки, которая между прослушиваниями подает кофе состоявшимся кинозвездам, и фанатичного джазового музыканта, вынужденного подрабатывать в заштатных барах. Но пришедший к влюбленным успех начинает подтачивать их отношения',128,'мюзикл','La La Land');


INSERT INTO t_permission (role)
VALUES
    ('ROLE_GUEST'),
    ('ROLE_USER'),
    ('ROLE_ADMIN');

INSERT INTO t_users (active, email, full_name, password)
VALUES
    (true, 'akm@gmail.com', 'Akimzhan Sharipuly', '$2a$10$/7tDLdQUhWaWUSacdJIXXuZkNcwOl9se6g6Du5wnb.ColQ3SiLrOK'),
    (true, 'akimzhan1614@gmail.com', 'Akimzhan Sharipuly', '$2a$10$qHDsO1zgxcnpcfuEsEaKQebjT4q4qt.E8fw6tjg81Wt/rxN2cPFDe'),
    (true, 'dake@gmail.com', 'Dake Sayatov', '$2a$10$my6EGyGGIZeqfOeRykcDWe0krLYTffCgEcNlD843KFiifxTEf/BLq');

INSERT INTO t_users_permissions (user_id, permissions_id)
VALUES
    (1,3);

INSERT INTO t_nominations (name, awards_id, movie_id)
VALUES
    ('Лучшая актриса второго плана', 1, 3),
    ('Лучший приключенческий фильм', 1, 3),
    ('Лучший фильм', 2,4),
    ('Лучший режиссер', 2,4),
    ('Лучшая работа оператора', 2,4),
    ('Лучшие декорации', 2,4),
    ('Лучшие костюмы', 2,4),
    ('Лучший звук', 2,4),
    ('Лучший монтаж', 2,4),
    ('Лучший монтаж звука', 2,4),
    ('Лучшие визуальные эффекты', 2,4),
    ('Лучшая песня — «My Heart Will Go On»', 2,4),
    ('Лучший саундтрек к драматическому фильму', 2,4),
    ('Лучший фильм (драма)', 3,4),
    ('Лучший режиссер ( Джеймс Кэмерон )', 3,4),
    ('Лучшая песня — «My Heart Will Go On»', 3,4),
    ('Лучший саундтрек', 3,4),
    ('Лучший фильм', 4,4),
    ('Лучшая мужская роль ( Леонардо ДиКаприо )', 4,4),
    ('Приз зрительских симпатий за лучшую женскую роль ( Кейт Уинслет )', 5,4),
    ('Лучшая актриса второго плана ( Глория Стюарт )', 1,4),
    ('Лучшая женская роль второго плана ( Глория Стюарт )', 6,4),
    ('Лучшая женская роль ( Эмма Стоун )', 2,5),
    ('Лучший режиссер ( Дэмьен Шазелл )', 2,5),
    ('Лучшая работа оператора', 2,5),
    ('Лучшая песня — «City of Stars»', 2,5),
    ('Лучший саундтрек', 2,5),
    ('Лучшая работа художника-постановщика', 2,5),
    ('Лучший фильм (комедия или мюзикл)', 3,5),
    ('Лучшая мужская роль (комедия или мюзикл) ( Райан Гослинг )', 3,5),
    ('Лучшая женская роль (комедия или мюзикл) ( Эмма Стоун )', 3,5),
    ('Лучший режиссер ( Дэмьен Шазелл )', 3,5),
    ('Лучший сценарий', 3,5),
    ('Лучшая песня — «City of Stars»', 3,5),
    ('Лучший саундтрек', 3,5),
    ('Лучший фильм', 7,5),
    ('Лучшая женская роль ( Эмма Стоун )', 7,5),
    ('Лучшая работа оператора ( Линус Сандгрен )', 7,5),
    ('Лучший саундтрек', 7, 5),
    ('Премия имени Дэвида Лина за достижения в режиссуре ( Дэмьен Шазелл )', 7,5),
    ('Лучший независимый фильм', 1,5),
    ('Лучшая музыка', 1,5),
    ('Лучшая женская роль ( Эмма Стоун )', 6,5),
    ('Кубок Вольпи за лучшую женскую роль ( Эмма Стоун )', 8,5);





INSERT INTO t_feed_back (comment, movie_id, user_id)
VALUES
    ('What a great movie', 4, 2),
    ('Jake would fit in a door', 4, 1),
    ('asdasdads', 2, 1),
    ('Dylan OBrien is rhe best', 1, 1),
    ('Они помогли ему убить себя и так происходит каждый день во всем мире...', 3, 1),
    ('Боже, иногда Зеленая миля так длинна… Мы все заслужили смерть, все, без исключения.', 3, 1),
    ('What a waste of a lovely night! (с)', 5, 1),
    ('В том, чтобы объединить мюзикл и драму, нет ничего необычного, недавние «Отверженные» тому подтверждение. Но «Ла-Ла Ленд» нельзя назвать драмой, жанр она не выдерживает', 5, 1),
    ('«Ла-ла Ленд» действительно не мюзикл в чистом виде, процент немузыкальных сцен здесь слишком высок. Но всё же рекламируется он по всему миру именно как мюзикл, поэтому мы будем предъявлять к нему требования и в соответствии с этим жанром.', 5, 1);


INSERT INTO t_movies_nominations (movie_id, nominations_id)
VALUES
    (5, 44),
    (5, 43),
    (5, 42),
    (5, 41),
    (5, 40),
    (5, 39),
    (5, 38),
    (5, 37),
    (5, 36),
    (5, 35),
    (5, 34),
    (5, 33),
    (5, 32),
    (5, 31),
    (5, 30),
    (5, 29),
    (5, 28),
    (5, 27),
    (5, 26),
    (5, 25),
    (4, 24),
    (4, 23),
    (4, 22),
    (4, 21),
    (4, 20),
    (4, 19),
    (4, 18),
    (4, 17),
    (4, 16),
    (4, 14),
    (4, 13),
    (4, 12),
    (4, 11),
    (4, 10),
    (4, 9),
    (4, 8),
    (4, 7),
    (4, 6),
    (4, 5),
    (4, 4),
    (3, 3),
    (3, 2),
    (3, 1);


INSERT INTO t_movies_actors (movie_id, actors_id)
VALUES
    (1, 2),
    (2, 3),
    (2, 2),
    (1, 1),
    (1, 4),
    (1, 5),
    (1, 6),
    (3, 7),
    (3, 8),
    (3, 9),
    (3, 10),
    (3, 11),
    (3, 12),
    (5, 13),
    (5, 14),
    (5, 15),
    (5, 16);

