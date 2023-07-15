
-- Tabla Clientes
INSERT INTO Clientes (cedula, nombre, apellido)
VALUES (3235236432, 'Maria', 'Torres');


-- Tabla Departamentos
INSERT INTO Departamentos (nombre_departamento)
VALUES ('Recursos Humanos');


-- Tabla Puestos
INSERT INTO Puestos (id_departamento, nombre)
VALUES ('1', 'Director RH');


-- Tabla Colaboradores
INSERT INTO Colaboradores (id_puesto,cedula,nombre,apellido)
VALUES ('1', 32555, 'Adrian', 'Alvarado Zumbado');


-- Tabla Proveedores
INSERT INTO Proveedores (empresa, costo_envio)
VALUES ('Una empresa', 5000);


-- Tabla Cantones
INSERT INTO Cantones (id_provincia, canton)
VALUES (1, 'San Jose');


-- Tabla Distritos
INSERT INTO Distritos (id_canton, distrito)
VALUES (1, 'Carmen');


-- Tabla Direcciones
INSERT INTO Direcciones (id_provincia, id_canton, id_distrito, detalle)
VALUES (1, 1, 1, 'Esta es una direccion de prueba');