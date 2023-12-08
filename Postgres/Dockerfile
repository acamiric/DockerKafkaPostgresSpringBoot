FROM postgres:10.11
ENV POSTGRES_USER=testdb_usr
ENV POSTGRES_PASSWORD=testdb_pwd
ENV POSTGRES_DB=testdb
COPY ./*.sql /docker-entrypoint-initdb.d/

