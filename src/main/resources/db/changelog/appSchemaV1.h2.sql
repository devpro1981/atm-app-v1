--liquibase formatted sql

--changeset salim:1
CREATE SEQUENCE IF NOT EXISTS HIBERNATE_SEQUENCE MINVALUE 100 MAXVALUE 99999999999999 INCREMENT BY 1 START WITH 100 CACHE 20;

--changeset salim:2
create table account (
                       id int primary key,
                       version int,
                       account_number varchar(255),
                       security_pin varchar(4)
);

--changeset salim:3
create table account_balances (
                         id int primary key,
                         version int,
                         account_id int,
                         opening_balance int, overdraft int, current_balance int,
                             CONSTRAINT FK_ACC_BAL_TO_ACC FOREIGN KEY (account_id) REFERENCES account(id)
);

--changeset salim:4
create table cash_store (
                                  id int primary key,
                                  version int,
                                  denomination int,
                                  quantity int
);
