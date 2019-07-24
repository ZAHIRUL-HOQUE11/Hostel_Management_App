-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 24, 2019 at 12:44 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bachelor_point`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_cost_chart`
--

CREATE TABLE `add_cost_chart` (
  `User_Name` varchar(20) NOT NULL,
  `User_Password` varchar(20) NOT NULL,
  `Member_Name` varchar(20) NOT NULL,
  `Room_No` varchar(10) NOT NULL,
  `Sit_No` varchar(5) NOT NULL,
  `Date` varchar(15) NOT NULL,
  `Taka` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_cost_chart`
--

INSERT INTO `add_cost_chart` (`User_Name`, `User_Password`, `Member_Name`, `Room_No`, `Sit_No`, `Date`, `Taka`) VALUES
('zahirul', '688574', 'ayat', '1', '2', '01-04-2019', '320'),
('zahirul', '688574', 'zubair', '2', '1', '02-04-2019', '670');

-- --------------------------------------------------------

--
-- Table structure for table `add_extra_cost_chart`
--

CREATE TABLE `add_extra_cost_chart` (
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `date` varchar(15) NOT NULL,
  `taka` varchar(10) NOT NULL,
  `comment` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_extra_cost_chart`
--

INSERT INTO `add_extra_cost_chart` (`user_name`, `password`, `date`, `taka`, `comment`) VALUES
('zahirul', '688574', '01-04-2019', '135', '1)vim 2)saban 3)harfik\n\n');

-- --------------------------------------------------------

--
-- Table structure for table `add_meal_chart`
--

CREATE TABLE `add_meal_chart` (
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `day` varchar(10) NOT NULL,
  `memberName` varchar(20) NOT NULL,
  `roomNo` varchar(10) NOT NULL,
  `sitNo` varchar(5) NOT NULL,
  `meal` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_meal_chart`
--

INSERT INTO `add_meal_chart` (`userName`, `password`, `day`, `memberName`, `roomNo`, `sitNo`, `meal`) VALUES
('zahirul', '688574', '1', 'zahir', '1', '1', '2'),
('zahirul', '688574', '1', 'ayat', '1', '2', '2'),
('zahirul', '688574', '1', 'zubair', '2', '1', '2'),
('zahirul', '688574', '1', 'piyas', '2', '2', '2.5');

-- --------------------------------------------------------

--
-- Table structure for table `deposit_chart`
--

CREATE TABLE `deposit_chart` (
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `roomNo` varchar(10) NOT NULL,
  `sitNo` varchar(5) NOT NULL,
  `taka` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit_chart`
--

INSERT INTO `deposit_chart` (`userName`, `password`, `name`, `roomNo`, `sitNo`, `taka`) VALUES
('zahirul', '688574', 'zahir', '1', '1', '1200'),
('zahirul', '688574', 'ayat', '1', '2', '0'),
('zahirul', '688574', 'zubair', '2', '1', '0'),
('zahirul', '688574', 'piyas', '2', '2', '1500'),
('zahirul', '688574', 'Apu', '2', '3', '0');

-- --------------------------------------------------------

--
-- Table structure for table `member_information`
--

CREATE TABLE `member_information` (
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `roomNo` varchar(10) NOT NULL,
  `sitNo` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member_information`
--

INSERT INTO `member_information` (`userName`, `password`, `name`, `roomNo`, `sitNo`) VALUES
('zahirul', '688574', 'zahir', '1', '1'),
('zahirul', '688574', 'ayat', '1', '2'),
('zahirul', '688574', 'zubair', '2', '1'),
('zahirul', '688574', 'piyas', '2', '2'),
('zahirul', '688574', 'Apu', '2', '3');

-- --------------------------------------------------------

--
-- Table structure for table `per_parson_total_meal`
--

CREATE TABLE `per_parson_total_meal` (
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `roomNo` varchar(10) NOT NULL,
  `sitNo` varchar(5) NOT NULL,
  `totalMeal` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `per_parson_total_meal`
--

INSERT INTO `per_parson_total_meal` (`userName`, `password`, `name`, `roomNo`, `sitNo`, `totalMeal`) VALUES
('zahirul', '688574', 'zahir', '1', '1', '2.0'),
('zahirul', '688574', 'ayat', '1', '2', '2.0'),
('zahirul', '688574', 'zubair', '2', '1', '2.0'),
('zahirul', '688574', 'piyas', '2', '2', '2.5'),
('zahirul', '688574', 'Apu', '2', '3', '0');

-- --------------------------------------------------------

--
-- Table structure for table `user_information`
--

CREATE TABLE `user_information` (
  `Name` varchar(20) NOT NULL,
  `Mobile_Number` varchar(15) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `Year` varchar(10) NOT NULL,
  `Member` varchar(5) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_information`
--

INSERT INTO `user_information` (`Name`, `Mobile_Number`, `Month`, `Year`, `Member`, `Password`) VALUES
('zahirul', '01815009474', 'April', '2019', '5', '688574');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_information`
--
ALTER TABLE `user_information`
  ADD PRIMARY KEY (`Mobile_Number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
