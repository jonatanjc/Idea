server:
port: 8081
error:
include-message: always
#Configuracion de spring
spring:
#Configuracion de migracion
flyway:
enabled: true
baselineVersion: 1
locations:
classpath: db/migration
sqlMigrationSuffixes: .sql
baselineOnMigrate: true
sqlMigrationPrefix: V
schemas: public

datasource:
url: jdbc: postgres://qrxoaved:***@bubble.db.elephantsql.com/qrxoaved
username: qrxoaved
password: 5P8SdCdyl7i6aoVs7q5V6I1A1rtXJmeo
driverClassName: org.postgresql.Driver