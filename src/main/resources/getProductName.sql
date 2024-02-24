SELECT
	ord.product_name
FROM
	netology.orders ord
INNER JOIN netology.customers cus on cus.id = ord.customer_id
WHERE
	LOWER(cus.name) = LOWER(:name);