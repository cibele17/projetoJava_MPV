CREATE TABLE Curso (
	Nome varchar(100),
	Nucleo varchar(100),
	CodCurso int NOT NULL PRIMARY KEY AUTO_INCREMENT
);
CREATE TABLE Cadeira (
	Nome varchar(100),
	Turma varchar(100),
	CodCadeira int NOT NULL PRIMARY KEY AUTO_INCREMENT
);
CREATE TABLE Curso_Cadeiras (
	CodCurso int,
	CodCadeira int,
	FOREIGN KEY (CodCurso) REFERENCES Curso (CodCurso),
	FOREIGN KEY (CodCadeira) REFERENCES Cadeira (CodCadeira)
);
CREATE TABLE Aviso (
	Cabecalho varchar(250),
	Corpo varchar(2500),
	Cadeira int,
	CodAviso int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	isGeneral boolean,
	FOREIGN KEY (Cadeira) REFERENCES Cadeira (CodCadeira)
);
