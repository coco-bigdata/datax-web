```shell
cd docker
sudo docker-compose up datax-web-mysql
sudo docker-compose down
sudo docker-compose up
sudo docker-compose up -d

sudo docker-compose build

sudo docker-compose up -d datax-web-admin
sudo docker-compose up -d datax-web-executor


mysql -h127.0.0.1 -uroot -p -P3310
create database dataxweb default character set utf8mb4 collate utf8mb4_unicode_ci;

mysql -h127.0.0.1 -uroot -p -P3310 dataxweb < bin/db/datax_web.sql

mvn package

cp ../datax-admin/target/datax-admin-2.1.2.jar datax-fe/
cp ../datax-executor/target/datax-executor-2.1.2.jar datax-fe/

https://data1.yongchehang.com/index.html
admin
123456
```