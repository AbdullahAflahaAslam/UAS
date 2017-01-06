-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2017 at 06:47 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `peminjam`
--

CREATE TABLE `peminjam` (
  `id_peminjam` int(11) NOT NULL,
  `Nama_Depan` varchar(50) NOT NULL,
  `Nama_Belakang` varchar(50) NOT NULL,
  `Tempat_Lahir` varchar(20) NOT NULL,
  `Tanggal_Lahir` varchar(20) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Alamat` text NOT NULL,
  `No_Telp` varchar(15) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `No_Identitas` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjam`
--

INSERT INTO `peminjam` (`id_peminjam`, `Nama_Depan`, `Nama_Belakang`, `Tempat_Lahir`, `Tanggal_Lahir`, `Jenis_Kelamin`, `Alamat`, `No_Telp`, `Status`, `No_Identitas`) VALUES
(1, 'Abdullah', 'Aflaha Aslam', 'Sukoharjo', '31 Mei 1996', 'Laki Laki', '', '087736387081', 'Mahasiswa', '123123123'),
(2, 'Abdullah', 'Aflaha Aslam', 'Sukoharjo', '31 Mei 1996', 'Laki Laki', '', '087736387081', 'Mahasiswa', '123123123'),
(5, 'Abdullah', 'Aflaha Aslam', 'Sukoharjo', '31 Mei 1996', 'Laki Laki', 'sukoharjo', '087736387081', 'Mahasiswa', '123123123'),
(7, 'Regina', 'fitrianingsih', 'Depok', '09 desember 1994', 'Perempuan', 'Depok', '1231203', 'Lajang', '129321');

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `Id_sewa` int(20) NOT NULL,
  `Id_karyawan` int(20) NOT NULL,
  `Id_pelanggan` int(20) NOT NULL,
  `Tanggal_Pinjam` date NOT NULL,
  `Tanggal_Kembali` date NOT NULL,
  `Total Biaya` int(11) NOT NULL,
  `Total_Denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`Id_sewa`, `Id_karyawan`, `Id_pelanggan`, `Tanggal_Pinjam`, `Tanggal_Kembali`, `Total Biaya`, `Total_Denda`) VALUES
(1, 1, 1, '2017-01-06', '2017-01-07', 200000, 0),
(2, 1, 1, '2017-01-06', '2017-01-07', 200000, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`id_peminjam`);

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`Id_sewa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `peminjam`
--
ALTER TABLE `peminjam`
  MODIFY `id_peminjam` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `sewa`
--
ALTER TABLE `sewa`
  MODIFY `Id_sewa` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
