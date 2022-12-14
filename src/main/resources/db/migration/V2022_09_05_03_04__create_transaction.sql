CREATE TABLE TRANSACTION(
    ID bigint not null,
    ACCOUNT_ID bigint not null,
    OPERATION_ID bigint not null,
    AMOUNT NUMERIC(1000,2) not null,
    EVENT_DATE timestamp not null,
    PRIMARY KEY (ID),
    CONSTRAINT FK_TRANSACTION_ACCOUNT_ID FOREIGN KEY (ACCOUNT_ID) REFERENCES ACCOUNT(ID),
    CONSTRAINT FK_TRANSACTION_OPERATION_ID FOREIGN KEY (OPERATION_ID) REFERENCES OPERATION(ID)
);