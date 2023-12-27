# Prueba de VirtualDestination con ActiveMQ

## Creación de la imagen de ActiveMQ 6.0.1
docker build -t test/activemq .
## Crear contenedor
docker run --rm  --name activemq -p 61616:61616 -p 8161:8161 test/activemq
## Lanzar el productor
Ejecutar la clase ActiveMQProducer

## Clientes
Ejecutar la clase ActiveMQConsumer.
El nombre de la aplicación (spring.application.name) define el nombre del consumidor. Por cada nombre de aplicación se 
crea un grupo de consumidores.

# Añadir elementos a la cola
curl -X POST "http://localhost:8080/api/employee" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"employeeFirstName\": \"shine\", \"employeeFullName\": \"shine m test\", \"employeeId\": \"129\", \"employeeLastName\": \"test\", \"employeeMiddleName\": \"m\"}"
