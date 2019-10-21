create table role
(
    id   bigserial not null
        constraint role_pk
            primary key,
    name varchar(50)
);

alter table role
    owner to postgres;

create table department
(
    id      bigserial not null
        constraint department_pk
            primary key,
    name    varchar(255),
    deleted boolean default false
);

alter table department
    owner to postgres;

create table employee
(
    id            bigserial not null
        constraint employee_pk
            primary key,
    first_name    varchar(50),
    middle_name   varchar(50),
    last_name     varchar(50),
    deleted       boolean default false,
    id_department bigint
        constraint employee_department_id_fk
            references department
);

alter table employee
    owner to postgres;

create table user_roles
(
    user_id bigint not null,
    role_id bigint not null
);

alter table user_roles
    owner to postgres;

