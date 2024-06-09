-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2024 at 12:33 AM
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
  `a_name` varchar(50) NOT NULL,
  `a_age` varchar(50) NOT NULL,
  `a_gender` varchar(50) NOT NULL,
  `a_breed` varchar(50) NOT NULL,
  `Date_Adopted` varchar(50) NOT NULL,
  `a_image` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_adopted`
--

INSERT INTO `tbl_adopted` (`a_id`, `a_name`, `a_age`, `a_gender`, `a_breed`, `Date_Adopted`, `a_image`) VALUES
(2, 'Mic', '2 years old', 'Male', 'Siberian Husky', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_archived_customers`
--

CREATE TABLE `tbl_archived_customers` (
  `c_id` int(20) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_age` int(20) NOT NULL,
  `c_gender` varchar(10) NOT NULL,
  `c_contact` varchar(10) NOT NULL,
  `c_address` varchar(255) NOT NULL,
  `c_email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_archived_customers`
--

INSERT INTO `tbl_archived_customers` (`c_id`, `c_name`, `c_age`, `c_gender`, `c_contact`, `c_address`, `c_email`) VALUES
(1, 'Anjo', 21, 'Male', '9166035697', 'Lipata', 'anjoWorld@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_archived_pets`
--

CREATE TABLE `tbl_archived_pets` (
  `a_id` int(20) NOT NULL,
  `a_name` varchar(50) NOT NULL,
  `a_age` varchar(50) NOT NULL,
  `a_gender` varchar(50) NOT NULL,
  `a_breed` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_archived_pets`
--

INSERT INTO `tbl_archived_pets` (`a_id`, `a_name`, `a_age`, `a_gender`, `a_breed`) VALUES
(1, 'Bell', '2 years old', 'Female', 'Pomeranian');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customers`
--
-- Error reading structure for table petadapt24.tbl_customers: #1932 - Table &#039;petadapt24.tbl_customers&#039; doesn&#039;t exist in engine
-- Error reading data for table petadapt24.tbl_customers: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near &#039;FROM `petadapt24`.`tbl_customers`&#039; at line 1

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
  `p_image` varchar(10000) NOT NULL,
  `Date_Adopted` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_pet`
--

INSERT INTO `tbl_pet` (`p_id`, `p_name`, `p_age`, `p_gender`, `p_breed`, `p_image`, `Date_Adopted`) VALUES
(2, 'Mic', '2 years old', 'Male', 'Siberian Husky', '', ''),
(3, 'dio', '2', 'Male', 'pomeranian', 'src/userimages/images (2).jpg', '');

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
-- Table structure for table `tbl_returned`
--

CREATE TABLE `tbl_returned` (
  `p_id` int(20) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_age` varchar(50) NOT NULL,
  `p_breed` varchar(50) NOT NULL,
  `p_gender` varchar(50) NOT NULL,
  `p_image` varchar(10000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_returned`
--

INSERT INTO `tbl_returned` (`p_id`, `p_name`, `p_age`, `p_breed`, `p_gender`, `p_image`) VALUES
(1, 'Bella', '3 years old', 'Female', 'Golden Retriever', ''),
(4, 'mic', '30', 'Male', 'beafle', 'src/userimages/images (2).jpg'),
(5, 'bus', '1', 'Male', 'poodle', 'src/userimages/https___tf-cmsv2-smithsonianmag-media.s3.amazonaws.com_filer_public_55_95_55958815-3a8a-4032-ac7a-ff8c8ec8898a_gettyimages-1067956982.jpg');

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
  `u_contact` varchar(20) NOT NULL,
  `u_image` varchar(1000) NOT NULL,
  `u_date` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_email`, `u_password`, `u_type`, `u_status`, `u_contact`, `u_image`, `u_date`) VALUES
(1, 'Krystel', 'Abogada', 'tel', 'maekrystel@gmail.com', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Admin', 'Active', '09166035697', '', 0),
(2, 'Anjo', 'Derecho', 'anjo', 'anjoWorld@gmail.com', 'F3VjFevUe3EQNZ/HsWgXm/by3zZG/MiIvIqgXHizisE=', 'User', 'Active', '09647480635', '', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_adopted`
--
ALTER TABLE `tbl_adopted`
  ADD PRIMARY KEY (`a_id`);

--
-- Indexes for table `tbl_archived_customers`
--
ALTER TABLE `tbl_archived_customers`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `tbl_archived_pets`
--
ALTER TABLE `tbl_archived_pets`
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
-- Indexes for table `tbl_returned`
--
ALTER TABLE `tbl_returned`
  ADD PRIMARY KEY (`p_id`);

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
-- AUTO_INCREMENT for table `tbl_archived_customers`
--
ALTER TABLE `tbl_archived_customers`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_archived_pets`
--
ALTER TABLE `tbl_archived_pets`
  MODIFY `a_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
-- AUTO_INCREMENT for table `tbl_returned`
--
ALTER TABLE `tbl_returned`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
