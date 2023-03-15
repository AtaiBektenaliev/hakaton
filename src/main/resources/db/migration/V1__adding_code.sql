create sequence airlines_seq start 1 increment 1;
create sequence airplane_seq start 1 increment 1;


create table airlines(
    id      int8    not null,
    name    varchar,
    code    varchar
);


create table airplane(
    id      int8    not null,
    name    varchar,
    code    varchar
);