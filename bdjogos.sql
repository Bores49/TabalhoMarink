-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.1.31-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.5.0.5273
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para bdjogos
CREATE DATABASE IF NOT EXISTS `bdjogos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bdjogos`;

-- Copiando estrutura para tabela bdjogos.fabricante
CREATE TABLE IF NOT EXISTS `fabricante` (
  `codigoFabri` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigoFabri`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdjogos.fabricante: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fabricante` DISABLE KEYS */;
/*!40000 ALTER TABLE `fabricante` ENABLE KEYS */;

-- Copiando estrutura para tabela bdjogos.games
CREATE TABLE IF NOT EXISTS `games` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `tamanho` double DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdjogos.games: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `games` DISABLE KEYS */;
INSERT INTO `games` (`codigo`, `nome`, `tamanho`) VALUES
	(1, NULL, NULL),
	(2, NULL, NULL),
	(3, 'sdfg', NULL),
	(4, 'sdfg', NULL),
	(5, 'sdg', NULL),
	(6, 'sdg', NULL),
	(7, 'hsfdhg', NULL),
	(8, 'oluugjl', NULL),
	(9, 'egffdshg', NULL);
/*!40000 ALTER TABLE `games` ENABLE KEYS */;

-- Copiando estrutura para tabela bdjogos.genero
CREATE TABLE IF NOT EXISTS `genero` (
  `codigoGene` int(11) NOT NULL AUTO_INCREMENT,
  `genero` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigoGene`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdjogos.genero: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;

-- Copiando estrutura para tabela bdjogos.plataforma
CREATE TABLE IF NOT EXISTS `plataforma` (
  `codigoPlat` int(11) NOT NULL AUTO_INCREMENT,
  `plataforma` varchar(50) DEFAULT '0',
  PRIMARY KEY (`codigoPlat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdjogos.plataforma: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `plataforma` DISABLE KEYS */;
/*!40000 ALTER TABLE `plataforma` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
