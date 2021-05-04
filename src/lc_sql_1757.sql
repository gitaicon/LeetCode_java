--DDL
create table "Products"
(
    product_id number(1) not null
        constraint "PRODUCTS_PK"
            primary key,
    low_fats NCHAR(1) not null,
    recyclable NCHAR(1) not null
);

--INSERT
INSERT INTO "Products" (PRODUCT_ID, LOW_FATS, RECYCLABLE) VALUES (1, 'Y', 'Y');
INSERT INTO "Products" (PRODUCT_ID, LOW_FATS, RECYCLABLE) VALUES (2, 'N', 'Y');
INSERT INTO "Products" (PRODUCT_ID, LOW_FATS, RECYCLABLE) VALUES (3, 'Y', 'Y');
INSERT INTO "Products" (PRODUCT_ID, LOW_FATS, RECYCLABLE) VALUES (4, 'N', 'N');

--RESULT
SELECT PRODUCT_ID
FROM "Products"
WHERE low_fats = 'Y'
  AND recyclable = 'Y';
