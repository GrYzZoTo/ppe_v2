-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : db
-- Généré le : lun. 16 nov. 2020 à 22:30
-- Version du serveur :  5.7.31
-- Version de PHP : 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ppe`
--

-- --------------------------------------------------------

--
-- Structure de la table `bonCommande`
--

CREATE TABLE `bonCommande` (
  `idBonCommande` int(11) NOT NULL,
  `facture` varchar(50) DEFAULT NULL,
  `dateAchat` date DEFAULT NULL,
  `idVente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `idCat` int(11) NOT NULL,
  `nomCat` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`idCat`, `nomCat`) VALUES
(1, 'Nike'),
(2, 'Nike SB');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idClient` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(50) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idClient`, `nom`, `prenom`, `mail`, `telephone`) VALUES
(3, 'Siniak', 'Bistien', 'Basrien.lepd@gmail.com', 7696969),
(4, 'oui', 'oui', 'oui', 890),
(5, 'Maza', 'Yoan', 'zoepgze', 123456);

-- --------------------------------------------------------

--
-- Structure de la table `personel`
--

CREATE TABLE `personel` (
  `idPersonnel` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(50) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL,
  `mdp` varchar(50) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL,
  `idProfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `personel`
--

INSERT INTO `personel` (`idPersonnel`, `nom`, `prenom`, `telephone`, `mdp`, `mail`, `idProfil`) VALUES
(4, 'Polo', 'Theo', 456, 'theolebg', 'theo.polo888@gmail.com', 1),
(5, 'toto', 'toto', 456, 'tt', 'theo.polo888@gmail.com', 2),
(6, 'Siniak', 'bstn', 911, 'bb', 'bbbbb', 2),
(7, 'ggg', 'ggg', 999, 'ggg', 'ggg', 1);

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE `produit` (
  `idProduit` int(11) NOT NULL,
  `nomProduit` varchar(50) DEFAULT NULL,
  `tarif` decimal(19,4) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `popularite` double DEFAULT NULL,
  `id_categorie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`idProduit`, `nomProduit`, `tarif`, `stock`, `image`, `popularite`, `id_categorie`) VALUES
(5, 'test', '3000.0000', 2, NULL, 4.8, 1),
(6, 'iuiii', '2000.0000', 2, NULL, 3.9, 1),
(7, 'test', '12.0000', 2, NULL, 5, 2),
(8, 'Blazer', '100.0000', 23, NULL, 4.9, 2);

-- --------------------------------------------------------

--
-- Structure de la table `profil`
--

CREATE TABLE `profil` (
  `idProfil` int(11) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `profil`
--

INSERT INTO `profil` (`idProfil`, `libelle`) VALUES
(1, 'Admin'),
(2, 'Employer');

-- --------------------------------------------------------

--
-- Structure de la table `relier`
--

CREATE TABLE `relier` (
  `idProduit` int(11) NOT NULL,
  `idCat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

CREATE TABLE `vente` (
  `idVente` int(11) NOT NULL,
  `date_vente` date DEFAULT NULL,
  `nomPersonnel` varchar(255) NOT NULL,
  `idPersonnel` int(11) NOT NULL,
  `idClient` int(11) NOT NULL,
  `nomProduit` text NOT NULL,
  `qte` int(11) NOT NULL,
  `nomClient` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `vente`
--

INSERT INTO `vente` (`idVente`, `date_vente`, `nomPersonnel`, `idPersonnel`, `idClient`, `nomProduit`, `qte`, `nomClient`) VALUES
(19, '2020-11-09', 'Polo', 0, 3, 'test', 1, 'Siniak'),
(20, '2020-11-09', 'Polo', 0, 3, 'iuiii', 1, 'Siniak'),
(21, '2020-11-09', 'Polo', 0, 3, 'iuiii', 1, 'Siniak'),
(22, '2020-11-09', 'Polo', 1, 3, 'iuiii', 1, 'Siniak');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `bonCommande`
--
ALTER TABLE `bonCommande`
  ADD PRIMARY KEY (`idBonCommande`),
  ADD KEY `idVente` (`idVente`);

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`idCat`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idClient`);

--
-- Index pour la table `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`idPersonnel`),
  ADD KEY `idProfil` (`idProfil`);

--
-- Index pour la table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`idProduit`),
  ADD KEY `produit.categorie` (`id_categorie`);

--
-- Index pour la table `profil`
--
ALTER TABLE `profil`
  ADD PRIMARY KEY (`idProfil`);

--
-- Index pour la table `relier`
--
ALTER TABLE `relier`
  ADD PRIMARY KEY (`idProduit`,`idCat`),
  ADD KEY `idCat` (`idCat`);

--
-- Index pour la table `vente`
--
ALTER TABLE `vente`
  ADD PRIMARY KEY (`idVente`),
  ADD KEY `idClient` (`idClient`),
  ADD KEY `idPersonnel` (`idPersonnel`),
  ADD KEY `nomClient` (`nomClient`(11)),
  ADD KEY `nomPersonnel` (`nomPersonnel`(11));

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `bonCommande`
--
ALTER TABLE `bonCommande`
  MODIFY `idBonCommande` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `idCat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `idClient` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `personel`
--
ALTER TABLE `personel`
  MODIFY `idPersonnel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `produit`
--
ALTER TABLE `produit`
  MODIFY `idProduit` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `profil`
--
ALTER TABLE `profil`
  MODIFY `idProfil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `vente`
--
ALTER TABLE `vente`
  MODIFY `idVente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `bonCommande`
--
ALTER TABLE `bonCommande`
  ADD CONSTRAINT `bonCommande_ibfk_1` FOREIGN KEY (`idVente`) REFERENCES `vente` (`idVente`);

--
-- Contraintes pour la table `personel`
--
ALTER TABLE `personel`
  ADD CONSTRAINT `personel_ibfk_1` FOREIGN KEY (`idProfil`) REFERENCES `profil` (`idProfil`);

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `produit.categorie` FOREIGN KEY (`id_categorie`) REFERENCES `categorie` (`idCat`);

--
-- Contraintes pour la table `relier`
--
ALTER TABLE `relier`
  ADD CONSTRAINT `relier_ibfk_1` FOREIGN KEY (`idProduit`) REFERENCES `produit` (`idProduit`),
  ADD CONSTRAINT `relier_ibfk_2` FOREIGN KEY (`idCat`) REFERENCES `categorie` (`idCat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
