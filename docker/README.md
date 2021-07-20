```shell
sudo docker-compose up datax-web-mysql
sudo docker-compose down
sudo docker-compose up
sudo docker-compose up -d

sudo docker-compose up -d datax-web-admin
sudo docker-compose up -d datax-web-executor


mysql -h127.0.0.1 -uroot -p -P3310
create database dataxweb default character set utf8mb4 collate utf8mb4_unicode_ci;
```