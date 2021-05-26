-- First part
select car_brand, color, price
from car
where color = 'white'
   or color = 'black'
    and price < 15000;

-- Second part
select car_brand,
       sum(price)
from car
where color = 'black'
group by car_brand
having sum(price) < 15000;

select order_number, client_name, "Order".car_brand, price
from "Order"
         left join "car" on "Order".car_brand = car.car_brand;

