CREATE TABLE if not exists operations (
    id UUID NOT NULL PRIMARY KEY,

    user_id UUID NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    updated_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    status VARCHAR(255) NOT NULL,
    amount NUMERIC(19, 2) NOT NULL,
    currency VARCHAR(255) NOT NULL,
    details_encoded TEXT NOT NULL,
    details_hash TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS transactions (
    id UUID NOT NULL PRIMARY KEY,

    account_id UUID NOT NULL,
    direction VARCHAR(255) NOT NULL,
    balance_after NUMERIC(19, 2) NOT NULL,
    operation_id UUID NOT NULL,

    CONSTRAINT fk_transaction_operation
        FOREIGN KEY (operation_id)
        REFERENCES operation (id)
);