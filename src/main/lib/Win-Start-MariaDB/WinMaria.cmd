

docker run --rm --name is201-mariadb -p 127.0.0.1:3306:3306/tcp -v /my/own/datadir:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=Ex20200702-IS201 -d mariadb:latest
