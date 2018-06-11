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

-- Copiando estrutura para tabela bdjogos.games
CREATE TABLE IF NOT EXISTS `games` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `genero` varchar(20) DEFAULT NULL,
  `plataforma` varchar(20) DEFAULT NULL,
  `tamanho` double DEFAULT NULL,
  `fabricante` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela bdjogos.games: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `games` DISABLE KEYS */;
INSERT INTO `games` (`codigo`, `nome`, `genero`, `plataforma`, `tamanho`, `fabricante`) VALUES
	(1, NULL, 'Ação', 'PC', 50.400001525878906, 'Rockstar'),
	(2, NULL, 'RPG', 'PS4', 23.399999618530273, 'sdg'),
	(3, 'sdfg', 'MMORPG', 'PS4', 56, 'pau'),
	(4, 'sdfg', 'Ação', 'PC', 23, 'fsdag'),
	(5, 'sdg', 'Corrida', 'PC', 4, 'sdg'),
	(6, 'sdg', 'Corrida', 'PS4', 4, 'sdg'),
	(7, 'hsfdhg', 'MOBA', 'PC', 34, 'dhn'),
	(8, 'oluugjl', 'Aventura', 'Xbox One', 34, 'lh'),
	(9, 'egffdshg', 'Ação', 'Xbox One', 45, 'asfsdg');
/*!40000 ALTER TABLE `games` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
