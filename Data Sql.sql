CREATE SCHEMA Proyecto1;

CREATE USER 'Trabajador'@'localhost' IDENTIFIED BY 'Traba_123!';
GRANT SELECT, INSERT, DELETE, UPDATE ON Proyecto1.* TO 'Trabajador'@'localhost';

CREATE USER 'Cliente'@'localhost' IDENTIFIED BY 'Cliente_Intelaf123';
GRANT SELECT ON Proyecto1.* TO 'Cliente'@'localhost';

USE Proyecto1;

CREATE TABLE Tienda(
Nombre VARCHAR(50) NOT NULL,
Direccion VARCHAR(50) NOT NULL,
Codigo VARCHAR(15) NOT NULL,
Telefono_1 VARCHAR(8) NOT NULL,
Telefono_2 VARCHAR(8), 
Correo VARCHAR(25), 
Horario VARCHAR(15), 
PRIMARY KEY (Codigo)
);

CREATE TABLE Tiempo(
ID_Tiempo INT(10) NOT NULL AUTO_INCREMENT,
Codigo_Tienda1 VARCHAR(20) NOT NULL,
Codigo_Tienda2 VARCHAR(20) NOT NULL, 
Tiempo INT(5) NOT NULL,
PRIMARY KEY (ID_Tiempo),
FOREIGN KEY (Codigo_Tienda1) REFERENCES Tienda(Codigo) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (Codigo_Tienda2) REFERENCES Tienda(Codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Producto(
ID INT(10) NOT NULL AUTO_INCREMENT,
Nombre VARCHAR(25) NOT NULL, 
Fabricante VARCHAR(25) NOT NULL,
Codigo VARCHAR(15) NOT NULL,
Cantidad INT(10) NOT NULL,
Precio FLOAT NOT NULL,
Codigo_Tienda VARCHAR(15) NOT NULL,
Descripcion VARCHAR(100),
Garantia INT(10), 
PRIMARY KEY (ID), 
FOREIGN KEY (Codigo_Tienda) REFERENCES Tienda(Codigo)
);

CREATE TABLE Cliente(
Nombre VARCHAR(50) NOT NULL, 
Telefono VARCHAR(10) NOT NULL,
NIT VARCHAR(20) NOT NULL,
DPI VARCHAR(20),
Credito FLOAT,
Correo VARCHAR(30),
Direccion VARCHAR(50),
PRIMARY KEY (NIT)
);

CREATE TABLE Empleado(
Codigo_Empleado VARCHAR(25) NOT NULL,
Nombre VARCHAR(50) NOT NULL,
Telefono VARCHAR(10) NOT NULL,
NIT VARCHAR(15),
DPI VARCHAR(15) NOT NULL,
Correo VARCHAR(30),
Direccion VARCHAR(50),
PRIMARY KEY (Codigo_Empleado)
);

CREATE TABLE Pedido(
ID_Pedido INT(10) NOT NULL AUTO_INCREMENT,
Codigo_Pedido VARCHAR(20) NOT NULL,
Codigo_Tienda1 VARCHAR(20) NOT NULL,
Codigo_Tienda2 VARCHAR(20) NOT NULL,
Fecha DATE NOT NULL,
NIT_Cliente VARCHAR(20) NOT NULL,
Codigo_Producto VARCHAR(20) NOT NULL,
Cantidad INT(10) NOT NULL,
Total FLOAT NOT NULL,
Anticipo FLOAT NOT NULL,
Credito FLOAT,
Estado VARCHAR(20),
FechaDeEntrega DATE,
PRIMARY KEY (ID_Pedido),
FOREIGN KEY (Codigo_Tienda1) REFERENCES Tienda(Codigo) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (Codigo_Tienda2) REFERENCES Tienda(Codigo) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (NIT_Cliente) REFERENCES Cliente(NIT) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Venta(
ID_Venta INT(10) NOT NULL AUTO_INCREMENT,
Codigo_Producto VARCHAR(20) NOT NULL,
Codigo_Tienda VARCHAR(20) NOT NULL,
NIT_Cliente VARCHAR(20) NOT NULL,
Cantidad INT(20) NOT NULL,
Pago FLOAT NOT NULL,
Credito FLOAT NOT NULL,
Fecha DATE NOT NULL,
PRIMARY KEY (ID_Venta),
FOREIGN KEY (Codigo_Tienda) REFERENCES Tienda(Codigo) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (NIT_Cliente) REFERENCES Cliente(NIT) ON DELETE CASCADE ON UPDATE CASCADE
);






