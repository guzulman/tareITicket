CREATE DATABASE ITicket; /* Se crea a base de datos y se asigna el nombre */
use ITicket; /* de aquí para abajo todos e asigna a tienda  */

CREATE TABLE `artistas` ( /* se crea la tabla países  */
  `id` int(11) NOT NULL AUTO_INCREMENT, /* para el ID se declara un int y el not null es para q setee un valor automáticamente , el 11 es que tan largo es */
  `artista` varchar(100) NOT NULL, /* varcher es String */
  PRIMARY KEY (`id`) /* pide el ID  */
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8; /*   */

INSERT INTO `artistas` VALUES (1,'Cafe Tacvba'),(2,'Los Fabulosos Cadilacs'),(3,'Los Rabanes'),(4,'Mana'),(5,'Pitbull'); /* Se inserta la informaciónpaisespaises */

CREATE TABLE `conciertos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `artistas_id` int(11) NOT NULL, /* llaveforanea */
  `fecha` varchar(100) NOT NULL,
  `costo` varchar(45) NOT NULL,
  `capacidad` varchar(45) NOT NULL,
  `ubicacion` varchar(100) NOT NULL,
  
  PRIMARY KEY (`id`,`artistas_id`),
  KEY `fk_conciertos_artistas_idx` (`artistas_id`),
  CONSTRAINT `fk_conciertos_artistas` FOREIGN KEY (`artistas_id`) REFERENCES `artistas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  ) ;

INSERT INTO `conciertos` VALUES (1,1,'Marzo 10','45.000','120,000 Personas','Parque Viva');
INSERT INTO `conciertos` VALUES (2,2,'Marzo 11','50.000','120,000 Personas','Parque Viva');
INSERT INTO `conciertos` VALUES (3,3,'Marzo 12','35.000','120,000 Personas','Parque Viva');
INSERT INTO `conciertos` VALUES (4,4,'Marzo 13','30.000','120,000 Personas','Parque Viva');
INSERT INTO `conciertos` VALUES (5,5,'Marzo 14','55.000','120,000 Personas','Parque Viva');