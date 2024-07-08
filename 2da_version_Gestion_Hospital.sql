-- Tabla Paciente
CREATE TABLE Paciente (
    ID_Paciente INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    FechaNacimiento DATE,
    Genero VARCHAR(10),
    Direccion VARCHAR(100),
    Telefono VARCHAR(15),
    ID_DoctorAsignado INT
);



-- Tabla Doctor
CREATE TABLE Doctor (
    ID_Doctor INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Especialidad VARCHAR(50),
    Telefono VARCHAR(15),
    CorreoElectronico VARCHAR(100)
);


-- Tabla Enfermera
CREATE TABLE Enfermera (
    ID_Enfermera INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Especialidad VARCHAR(50),
    Telefono VARCHAR(15),
    CorreoElectronico VARCHAR(100)
);

-- Tabla Cita
CREATE TABLE Cita (
    ID_Cita INT PRIMARY KEY,
    FechaHora DATE,
    ID_Paciente INT,
    ID_Doctor INT,
    Tipo VARCHAR(50)
);

-- Tabla Historia Clínica
CREATE TABLE HistoriaClinica (
    ID_HistoriaClinica INT PRIMARY KEY,
    ID_Paciente INT,
    FechaCreacion DATE,
    Diagnostico VARCHAR(100),
    Tratamiento VARCHAR(100)
);

-- Tabla Examen
CREATE TABLE Examen (
    ID_Examen INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Descripcion VARCHAR(100),
    Costo DECIMAL(10, 2)
);

-- Tabla ResultadoExamen
CREATE TABLE ResultadoExamen (
    ID_ResultadoExamen INT PRIMARY KEY,
    ID_Examen INT,
    ID_Paciente INT,
    Fecha DATE,
    Resultado VARCHAR(100)
);

-- Tabla Medicamento
CREATE TABLE Medicamento (
    ID_Medicamento INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Descripcion VARCHAR(100),
    Stock INT,
    Precio DECIMAL(10, 2)
);


INSERT INTO Medicamento (Nombre, Descripcion, Stock, Precio)
VALUES ('jjjj', 'Alivia dolores leves', 100, 5.99);


select * from Medicamento;

commit;


delete from Medicamento;

-- Tabla Receta
CREATE TABLE Receta (
    ID_Receta INT PRIMARY KEY,
    ID_Paciente INT,
    ID_Doctor INT,
    Fecha DATE,
    Diagnostico VARCHAR(100)
);


-- Tabla InventarioMedicamento
CREATE TABLE InventarioMedicamento (
    ID_InventarioMedicamento INT PRIMARY KEY,
    ID_Medicamento INT,
    Cantidad INT,
    FechaActualizacion DATE
);

CREATE VIEW Vista_InventarioMedicamento AS
SELECT IM.ID_InventarioMedicamento,
       M.Nombre AS NombreMedicamento,
       M.Descripcion AS DescripcionMedicamento,
       M.Stock,
       M.Precio,
       IM.FechaActualizacion
FROM InventarioMedicamento IM
INNER JOIN Medicamento M ON IM.ID_Medicamento = M.ID_Medicamento;

select * from Vista_InventarioMedicamento;

-- Crear secuencia para ID_Medicamento
CREATE SEQUENCE secuencia_medicamento
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Crear trigger para ID_Medicamento
CREATE OR REPLACE TRIGGER trg_auto_generar_id_medicamento
BEFORE INSERT ON Medicamento
FOR EACH ROW
BEGIN
  SELECT secuencia_medicamento.nextval
  INTO :new.ID_Medicamento
  FROM dual;
END;


CREATE SEQUENCE secuencia_inventario_medicamento
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;


CREATE OR REPLACE TRIGGER trg_auto_insertar_fecha
AFTER INSERT ON Medicamento
FOR EACH ROW
BEGIN
  INSERT INTO InventarioMedicamento (ID_InventarioMedicamento, ID_Medicamento, Cantidad, FechaActualizacion)
  VALUES (secuencia_inventario_medicamento.nextval, :new.ID_Medicamento, :new.Stock, SYSDATE);
END;





INSERT INTO Medicamento (Nombre, Descripcion, Stock, Precio)
VALUES ('Acetaminofen', 'Analgesico', 100, 10.00);

SELECT * FROM Medicamento;

SELECT * FROM InventarioMedicamento;











-- Tabla Sala
CREATE TABLE Sala (
    ID_Sala INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Capacidad INT,
    Disponibilidad VARCHAR(50)
);

-- Tabla Ingreso
CREATE TABLE Ingreso (
    ID_Ingreso INT PRIMARY KEY,
    ID_Paciente INT,
    ID_Doctor INT,
    FechaEntrada DATE,
    FechaSalida DATE,
    ID_Sala INT
);

-- Tabla Tratamiento
CREATE TABLE Tratamiento (
    ID_Tratamiento INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Descripcion VARCHAR(100)
);

-- Tabla DetalleTratamiento
CREATE TABLE DetalleTratamiento (
    ID_DetalleTratamiento INT PRIMARY KEY,
    ID_Tratamiento INT,
    ID_Paciente INT,
    FechaInicio DATE,
    FechaFin DATE
);

-- Tabla Factura
CREATE TABLE Factura (
    ID_Factura INT PRIMARY KEY,
    ID_Paciente INT,
    Fecha DATE,
    Total DECIMAL(10, 2)
);


truncate table Medicamento;

commit;

INSERT INTO Usuario (ID_Usuario, Nombre, Contraseña, Rol)
VALUES (1, 'Admin', '12345', 'Administrador');

INSERT INTO Usuario (ID_Usuario, Nombre, Contraseña, Rol)
VALUES (2, 'Doctor', '54321', 'Doctor');











-- Tabla DetalleFactura
CREATE TABLE DetalleFactura (
    ID_DetalleFactura INT PRIMARY KEY,
    ID_Factura INT,
    ID_Servicio INT,
    ID_Medicamento INT,
    Cantidad INT,
    PrecioUnitario DECIMAL(10, 2)
);

-- Tabla Servicio
CREATE TABLE Servicio (
    ID_Servicio INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Descripcion VARCHAR(100),
    Costo DECIMAL(10, 2)
);

-- Tabla Empleado
CREATE TABLE Empleados (
    ID_Empleado INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Cargo VARCHAR(50),
    FechaContratacion DATE,
    Salario DECIMAL(10, 2)
);

-- Tabla Ubicación
CREATE TABLE Ubicacion (
    ID_Ubicacion INT PRIMARY KEY,
    Ciudad VARCHAR(50),
    Estado VARCHAR(50),
    Pais VARCHAR(50)
);

-- Tabla Usuario
CREATE TABLE Usuario (
    ID_Usuario INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Contraseña VARCHAR(50),
    Rol VARCHAR(50)
);

-- Tabla Pediatría
CREATE TABLE Pediatria (
    ID_Pediatria INT PRIMARY KEY,
    ID_Sala INT,
    NombrePaciente VARCHAR(50),
    Edad INT
);

-- Tabla Emergencias
CREATE TABLE Emergencias (
    ID_Emergencias INT PRIMARY KEY,
    ID_Sala INT,
    NombrePaciente VARCHAR(50),
    Gravedad VARCHAR(50)
);

-- Tabla Radiología
CREATE TABLE Radiologia (
    ID_Radiologia INT PRIMARY KEY,
    ID_Sala INT,
    TipoEstudio VARCHAR(50),
    Resultado VARCHAR(100)
);

-- Tabla Quirófano
CREATE TABLE Quirofano (
    ID_Quirofano INT PRIMARY KEY,
    ID_Sala INT,
    TipoCirugía VARCHAR(50),
    FechaCirugía DATE,
    PacienteOperado VARCHAR(50)
);
-----------------------------------FIN DE LAS TABLAS----------------------------

--------------------------------------LLAVES FORANEAS---------------------------

-- Añadir restricciones de clave foránea a la tabla Paciente
ALTER TABLE Paciente
ADD CONSTRAINT fk_Paciente_Doctor
FOREIGN KEY (ID_DoctorAsignado) REFERENCES Doctor(ID_Doctor);

-- Añadir restricciones de clave foránea a la tabla Cita
ALTER TABLE Cita
ADD CONSTRAINT fk_Cita_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

ALTER TABLE Cita
ADD CONSTRAINT fk_Cita_Doctor
FOREIGN KEY (ID_Doctor) REFERENCES Doctor(ID_Doctor);

-- Añadir restricciones de clave foránea a la tabla HistoriaClinica
ALTER TABLE HistoriaClinica
ADD CONSTRAINT fk_HistoriaClinica_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

-- Añadir restricciones de clave foránea a la tabla ResultadoExamen
ALTER TABLE ResultadoExamen
ADD CONSTRAINT fk_ResultadoExamen_Examen
FOREIGN KEY (ID_Examen) REFERENCES Examen(ID_Examen);

ALTER TABLE ResultadoExamen
ADD CONSTRAINT fk_ResultadoExamen_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

-- Añadir restricciones de clave foránea a la tabla Receta
ALTER TABLE Receta
ADD CONSTRAINT fk_Receta_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

ALTER TABLE Receta
ADD CONSTRAINT fk_Receta_Doctor
FOREIGN KEY (ID_Doctor) REFERENCES Doctor(ID_Doctor);

-- Añadir restricciones de clave foránea a la tabla InventarioMedicamento
ALTER TABLE InventarioMedicamento
ADD CONSTRAINT fk_InventarioMedicamento_Medicamento
FOREIGN KEY (ID_Medicamento) REFERENCES Medicamento(ID_Medicamento);

-- Añadir restricciones de clave foránea a la tabla Ingreso
ALTER TABLE Ingreso
ADD CONSTRAINT fk_Ingreso_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

ALTER TABLE Ingreso
ADD CONSTRAINT fk_Ingreso_Doctor
FOREIGN KEY (ID_Doctor) REFERENCES Doctor(ID_Doctor);

ALTER TABLE Ingreso
ADD CONSTRAINT fk_Ingreso_Sala
FOREIGN KEY (ID_Sala) REFERENCES Sala(ID_Sala);

-- Añadir restricciones de clave foránea a la tabla DetalleTratamiento
ALTER TABLE DetalleTratamiento
ADD CONSTRAINT fk_DetalleTratamiento_Tratamiento
FOREIGN KEY (ID_Tratamiento) REFERENCES Tratamiento(ID_Tratamiento);

ALTER TABLE DetalleTratamiento
ADD CONSTRAINT fk_DetalleTratamiento_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

-- Añadir restricciones de clave foránea a la tabla Factura
ALTER TABLE Factura
ADD CONSTRAINT fk_Factura_Paciente
FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente);

-- Añadir restricciones de clave foránea a la tabla DetalleFactura
ALTER TABLE DetalleFactura
ADD CONSTRAINT fk_DetalleFactura_Factura
FOREIGN KEY (ID_Factura) REFERENCES Factura(ID_Factura);

ALTER TABLE DetalleFactura
ADD CONSTRAINT fk_DetalleFactura_Servicio
FOREIGN KEY (ID_Servicio) REFERENCES Servicio(ID_Servicio);

ALTER TABLE DetalleFactura
ADD CONSTRAINT fk_DetalleFactura_Medicamento
FOREIGN KEY (ID_Medicamento) REFERENCES Medicamento(ID_Medicamento);

ALTER TABLE Pediatria
ADD CONSTRAINT fk_Pediatría_Sala
FOREIGN KEY (ID_Sala) REFERENCES Sala(ID_Sala);

ALTER TABLE Emergencias
ADD CONSTRAINT fk_Emergencias_Sala
FOREIGN KEY (ID_Sala) REFERENCES Sala(ID_Sala);

ALTER TABLE Radiologia
ADD CONSTRAINT fk_Radiología_Sala
FOREIGN KEY (ID_Sala) REFERENCES Sala(ID_Sala);

ALTER TABLE Quirofano
ADD CONSTRAINT fk_Quirófano_Sala
FOREIGN KEY (ID_Sala) REFERENCES Sala(ID_Sala);


------------------------------DROPEAR TABLAS------------------------------------
-- Tabla RegistroTransferencia
DROP TABLE Pediatria;

-- Tabla RegistroDevolucion
DROP TABLE Quirofano;

-- Tabla RegistroVenta
DROP TABLE Emergencias;

-- Tabla RegistroCompra
DROP TABLE Radiologia;

-- Tabla Usuario
DROP TABLE Usuario;

-- Tabla Ubicacion
DROP TABLE Ubicacion;

-- Tabla Empleados
DROP TABLE Empleados;

-- Tabla Servicio
DROP TABLE Servicio;

-- Tabla DetalleFactura
DROP TABLE DetalleFactura;

-- Tabla Factura
DROP TABLE Factura;

-- Tabla DetalleTratamiento
DROP TABLE DetalleTratamiento;

-- Tabla Tratamiento
DROP TABLE Tratamiento;

-- Tabla Ingreso
DROP TABLE Ingreso;

-- Tabla Sala
DROP TABLE Sala;

-- Tabla InventarioMedicamento
DROP TABLE InventarioMedicamento;

-- Tabla DetalleReceta
DROP TABLE DetalleReceta;

-- Tabla Receta
DROP TABLE Receta;

-- Tabla Medicamento
DROP TABLE Medicamento;

-- Tabla ResultadoExamen
DROP TABLE ResultadoExamen;

-- Tabla Examen
DROP TABLE Examen;

-- Tabla HistoriaClinica
DROP TABLE HistoriaClinica;

-- Tabla Cita
DROP TABLE Cita;

-- Tabla Enfermera
DROP TABLE Enfermera;

-- Tabla Doctor
DROP TABLE Doctor;

-- Tabla Paciente
DROP TABLE Paciente;

---------------------------------SECUENCIAS Y TRIGGERS--------------------------

-----------------Secuencias y triggers para que funcione Receta-----------------

------------Vista de receta-----------------------------------------------------
--Ejecutar por pasos---
--Paso 1

CREATE VIEW Vista_RecetaCompleta AS
SELECT r.ID_Receta, 
       r.ID_Paciente, 
       p.Nombre AS NombrePaciente, 
       p.Apellido AS ApellidoPaciente, 
       d.Nombre AS NombreDoctor, 
       d.Apellido AS ApellidoDoctor, 
       r.Fecha, 
       r.Diagnostico
FROM Receta r
INNER JOIN Paciente p ON r.ID_Paciente = p.ID_Paciente
INNER JOIN Doctor d ON r.ID_Doctor = d.ID_Doctor;

--Paso 2
CREATE SEQUENCE secuencia_receta
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE OR REPLACE TRIGGER trg_generar_id_receta
BEFORE INSERT ON Receta
FOR EACH ROW
BEGIN
  SELECT secuencia_receta.nextval
  INTO :new.ID_Receta
  FROM dual;
END;



--Paso 3
CREATE OR REPLACE TRIGGER trg_auto_generar_fecha
BEFORE INSERT ON Receta
FOR EACH ROW
BEGIN
  :new.Fecha := SYSDATE;
END;


--Paso 4

CREATE OR REPLACE TRIGGER trg_auto_asignar_id
BEFORE INSERT ON Receta
FOR EACH ROW
DECLARE
  v_id_paciente INT;
  v_id_doctor INT;
BEGIN
  SELECT MAX(ID_Paciente) INTO v_id_paciente FROM Paciente;
  SELECT MAX(ID_Doctor) INTO v_id_doctor FROM Doctor;
  
  :new.ID_Paciente := v_id_paciente;
  :new.ID_Doctor := v_id_doctor;
END;


-------------------------------------Paciente-----------------------------------
CREATE SEQUENCE secuencia_paciente
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE OR REPLACE TRIGGER trg_generar_id_paciente
BEFORE INSERT ON Paciente
FOR EACH ROW
BEGIN
  SELECT secuencia_paciente.nextval
  INTO :new.ID_Paciente
  FROM dual;
END;

----------------------------------Doctor----------------------------------------
CREATE SEQUENCE secuencia_doctor
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE OR REPLACE TRIGGER trg_generar_id_doctor
BEFORE INSERT ON Doctor
FOR EACH ROW
BEGIN
  SELECT secuencia_doctor.nextval
  INTO :new.ID_Doctor
  FROM dual;
END;


--------------------------Aqui terminan los triggers y secuencias para que funcione la tabla Receta---------------



