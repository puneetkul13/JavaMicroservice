CREATE DATABASE guestbook;
CREATE TABLE entries (guestName VARCHAR(255), content VARCHAR(255),
                        entryID SERIAL PRIMARY KEY);
INSERT INTO entries (guestName, content) values ('first guest', 'I got here!');
INSERT INTO entries (guestName, content) values ('second guest', 'Me too!');
INSERT INTO entries(guestName, content, entryID) values ('third guest', 'You too!',123);
SELECT * FROM guestbook;
SELECT guestname from entries where entryid=1;
DELETE FROM entries where entryid=1;
SELECT guestname from entries where entryid=123;
UPDATE entries SET guestname='Punit', content='Me too !' where entryid = 4;
