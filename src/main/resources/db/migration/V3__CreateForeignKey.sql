alter table customers
add constraint fk_customer foreign KEY(loyaltyCard_id) REFERENCES loyaltyCards(id);