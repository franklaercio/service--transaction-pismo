INSERT INTO ACCOUNT(ID, DOCUMENT_NUMBER, AVAILABLE_CREDIT_LIMIT)
VALUES (nextval('accounts_seq'), '12345678900', 450.00);

INSERT INTO TRANSACTION(ID, ACCOUNT_ID, OPERATION_ID, AMOUNT, EVENT_DATE)
VALUES (nextval('transaction_seq'), 1, 4, 123.99, now());
