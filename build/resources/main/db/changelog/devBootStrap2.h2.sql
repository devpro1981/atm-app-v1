--liquibase formatted sql

--changeset salim:1
insert into account(id, version, account_number, security_pin)
values ( 1, 1, '123456789', '1234' );
insert into account_balances(id, version, account_id, opening_balance, overdraft, current_balance)
values ( 2, 1, 1, 800, 200, 800 );

insert into account(id, version, account_number, security_pin)
values ( 3, 1, '987654321', '4321' );
insert into account_balances(id, version, account_id, opening_balance, overdraft, current_balance)
values ( 4, 1, 3, 1230, 150, 1230 );

--changeset salim:2

insert into cash_store(id, version, denomination, quantity)
values ( 5, 1, 50, 10 );
insert into cash_store(id, version, denomination, quantity)
values ( 6, 1, 20, 30 );
insert into cash_store(id, version, denomination, quantity)
values ( 7, 1, 10, 30 );
insert into cash_store(id, version, denomination, quantity)
values ( 8, 1, 5, 20 );