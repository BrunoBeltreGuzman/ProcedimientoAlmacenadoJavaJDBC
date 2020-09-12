# ProcedimientoAlmacenadoJavaJDBC

Procedimiento almacenado Java JDBC

Los Procedimiento almacenado sirven para: recibir parámetros de entrada 
y devolver valores de salida como resultado a un programa que realice una 
llamada a la base de datos; ejecutar instrucciones de programación que ejecutan 
acciones dentro de la base de datos; evolver valores de estados que permiten 
saber si la operación de un programa se ha realizado de forma exitosa o no.

Un procedimiento almacenado (Store Procedure) está formado por un conjunto de 
instrucciones Transact-SQL que definen un determinado proceso a ejecutar, puede 
aceptar parámetros de entrada y devolver un valor o conjunto de resultados. 
Este procedimiento se guarda en el servidor y puede ser ejecutado en cualquier momento.

CallableStatement
La interfaz CallableStatement se utiliza para llamar a las funciones y procedimientos 
almacenados. Podemos tener lógica de negocios en la base de datos mediante el uso de 
procedimientos y funciones almacenados que mejorarán el rendimiento porque están precompilados.

prepareCall();
El método prepareCall () de la interfaz Connection devuelve la instancia de CallableStatement.

executeQuery();
Se utiliza para ejecutar la consulta SELECT. Devuelve el objeto de ResultSet.
