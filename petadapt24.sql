-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 18, 2024 at 01:33 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petadapt24`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_adopted`
--

CREATE TABLE `tbl_adopted` (
  `a_id` int(20) NOT NULL,
  `a_name` varchar(50) DEFAULT NULL,
  `a_age` varchar(50) NOT NULL,
  `a_gender` varchar(50) NOT NULL,
  `a_breed` varchar(50) NOT NULL,
  `Date_Adopted` varchar(50) NOT NULL,
  `a_image` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_adopted`
--

INSERT INTO `tbl_adopted` (`a_id`, `a_name`, `a_age`, `a_gender`, `a_breed`, `Date_Adopted`, `a_image`) VALUES
(2, 'Mic', '2 years old', 'Male', 'Siberian Husky', '(13-06-2024) - (01:11)', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pet`
--

CREATE TABLE `tbl_pet` (
  `p_id` int(20) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_age` varchar(50) NOT NULL,
  `p_gender` varchar(50) NOT NULL,
  `p_breed` varchar(50) NOT NULL,
  `Date_Adopted` varchar(50) NOT NULL,
  `p_image` varchar(1000) NOT NULL,
  `Date_Added` varchar(50) NOT NULL,
  `p_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_pet`
--

INSERT INTO `tbl_pet` (`p_id`, `p_name`, `p_age`, `p_gender`, `p_breed`, `Date_Adopted`, `p_image`, `Date_Added`, `p_status`) VALUES
(3, 'dio', '2', 'Male', 'pomeranian', '(11-06-2024) - (01:08)', '', '(11-06-2024) - (17:08)', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_report`
--

CREATE TABLE `tbl_report` (
  `Total_Customers` int(20) NOT NULL,
  `Total_Pets` int(20) NOT NULL,
  `Total_Adopted` int(20) NOT NULL,
  `Total_Returned` int(20) NOT NULL,
  `Total_Died` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_report`
--

INSERT INTO `tbl_report` (`Total_Customers`, `Total_Pets`, `Total_Adopted`, `Total_Returned`, `Total_Died`) VALUES
(1, 20, 1, 0, 0),
(2, 19, 1, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_contact` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_email`, `u_password`, `u_type`, `u_status`, `u_contact`) VALUES
(1, 'Krystel', 'Abogada', 'tel', 'maekrystel@gmail.com', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Admin', 'Active', '09166035697'),
(2, 'Anjo', 'Derecho', 'anjo', 'anjoWorld@gmail.com', 'F3VjFevUe3EQNZ/HsWgXm/by3zZG/MiIvIqgXHizisE=', 'User', 'Active', '09647480635');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_adopted`
--
ALTER TABLE `tbl_adopted`
  ADD PRIMARY KEY (`a_id`);

--
-- Indexes for table `tbl_pet`
--
ALTER TABLE `tbl_pet`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `tbl_report`
--
ALTER TABLE `tbl_report`
  ADD PRIMARY KEY (`Total_Customers`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_adopted`
--
ALTER TABLE `tbl_adopted`
  MODIFY `a_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_pet`
--
ALTER TABLE `tbl_pet`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_report`
--
ALTER TABLE `tbl_report`
  MODIFY `Total_Customers` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
