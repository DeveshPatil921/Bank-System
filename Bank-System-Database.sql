-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2023 at 05:28 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankmanagementsystem`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `bankdetails` (OUT `empcount` INT(5), OUT `custcount` INT(5), OUT `avaibalance` INT(9))   BEGIN
     SELECT COUNT(employee_recorde.sr) into empcount FROM employee_recorde;
     
     SELECT COUNT(customer_recorde.AccountNumber) into custcount FROM customer_recorde; 
     SELECT SUM(customer_recorde.AMOUNT) into avaibalance FROM customer_recorde;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `customer_recorde`
--

CREATE TABLE `customer_recorde` (
  `AccountNumber` int(12) NOT NULL,
  `Amount` int(8) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Phone` int(10) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Gender` varchar(10) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_recorde`
--

INSERT INTO `customer_recorde` (`AccountNumber`, `Amount`, `Name`, `Phone`, `Address`, `DOB`, `Gender`, `Password`) VALUES
(22005001, 3100, 'Abhay Awachar', 1235469878, 'Akola', '2005-06-07', 'Male', '2005#46Abh'),
(22005002, 1200, 'Chetan Bochare', 1234587963, 'Mumbai', '2004-07-12', 'Male', '2004#15Che'),
(22005003, 900, 'Shreya Borode', 1236548795, 'Amravati', '2004-04-06', 'Female', '2004#82Shr'),
(22005004, 1000, 'Chaityanya Paraskar', 1232569874, 'Amravati', '2004-03-12', 'Male', '2004#48Cha'),
(22005005, 6000, 'Shreyash Gajbhiye', 1236587946, 'Yashodha Nagar, Amravati', '2004-05-06', 'Male', '2004#79Shr'),
(22005006, 5000, 'Shakshi Gayakwad', 1235469871, 'Amravati', '2004-07-13', 'Male', '2004#32Sha'),
(22005007, 4000, 'Yash Ghuge', 1236548795, 'Akola', '2005-03-02', 'Male', '2005#22Yas'),
(22005008, 3000, 'Pratik Ghurde', 1233655498, 'Daryapur', '2004-06-10', 'Male', '2004#98Pra'),
(22005009, 2000, 'Shreyash Gopnarayan', 1236548795, 'Jalgaon', '2004-11-07', 'Male', '2004#46Shr'),
(22005010, 8000, 'Kshitij Hadke', 1234569878, 'Dastur nagar, Amravati', '2004-08-26', 'Male', '2004#41Ksh');

--
-- Triggers `customer_recorde`
--
DELIMITER $$
CREATE TRIGGER `Record_Cust_Transuction` BEFORE UPDATE ON `customer_recorde` FOR EACH ROW BEGIN

   DECLARE vUser varchar(50);

   INSERT INTO transuction
   ( custid,
     amount,
     Balance)
   VALUES
   ( NEW.AccountNumber,
     abs(new.Amount - old.Amount),
     new.Amount );

END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `employee_recorde`
--

CREATE TABLE `employee_recorde` (
  `sr` int(3) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Phone` int(10) NOT NULL,
  `Position` varchar(20) NOT NULL,
  `Salary` int(7) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `Address` varchar(35) NOT NULL,
  `Username` varchar(15) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee_recorde`
--

INSERT INTO `employee_recorde` (`sr`, `Name`, `Phone`, `Position`, `Salary`, `DOB`, `Gender`, `Address`, `Username`, `Password`) VALUES
(1, 'Devesh Patil', 1245782453, 'CEO', 12000, '2005-05-24', 'Male', 'Amravati', 'Emp$DEV2005', '651DEV@2005'),
(2, 'Kshitij Hadke', 1236549878, 'Casher', 9000, '2004-08-26', 'Male', 'Dastur Nagar, Amravati', 'Emp$KSH2004', '692KSH@2004'),
(3, 'Omkar Shelke', 1237894561, 'Manager', 11000, '2005-01-17', 'Male', 'Sai Nagar, Amravati', 'Emp$OMK2005', '176OMK@2005'),
(4, 'Karan Rathod', 1234587965, 'Maintance', 8000, '2004-04-05', 'Male', 'Buldhana', 'Emp$KAR2004', '274KAR@2004'),
(5, 'Karan Rathod', 1526349870, 'Maintance', 9000, '2003-04-04', 'Male', 'Amravati.', 'Emp$KAR2003', '206KAR@2003');

--
-- Triggers `employee_recorde`
--
DELIMITER $$
CREATE TRIGGER `record_del_emp` BEFORE DELETE ON `employee_recorde` FOR EACH ROW BEGIN

        INSERT into XEmployee (USERNAME,PASSWORD,NAME,PHONE,ADDRESS,GENDER,DOB,POSITION)
        VALUES (
                old.Username,
                OLD.Password,
                OLD.Name,
                OLD.Phone,
                OLD.Address,
                OLD.Gender, 
                OLD.DOB,
                OLD.Position
        );

    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `transuction`
--

CREATE TABLE `transuction` (
  `TID` int(3) NOT NULL,
  `CustID` int(10) NOT NULL,
  `Amount` int(7) DEFAULT NULL,
  `Balance` int(7) DEFAULT NULL,
  `last_update` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transuction`
--

INSERT INTO `transuction` (`TID`, `CustID`, `Amount`, `Balance`, `last_update`) VALUES
(1, 22005001, 300, 3710, '2022-11-20'),
(2, 22005001, 10, 3700, '2022-11-22'),
(3, 22005001, 300, 4000, '2022-11-22'),
(4, 22005001, 200, 1000, '2022-12-20'),
(5, 22005001, 100, 900, '2022-12-20'),
(6, 22005001, 1000, 1900, '2022-12-20'),
(7, 22005001, 200, 2100, '2022-12-20'),
(8, 22005001, 2000, 4100, '2022-12-20'),
(9, 22005001, 1000, 3100, '2022-12-20');

-- --------------------------------------------------------

--
-- Table structure for table `xemployee`
--

CREATE TABLE `xemployee` (
  `SrNo` int(11) NOT NULL,
  `USERNAME` varchar(12) NOT NULL,
  `PASSWORD` varchar(9) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `PHONE` int(10) NOT NULL,
  `ADDRESS` varchar(30) NOT NULL,
  `GENDER` varchar(6) NOT NULL,
  `DOB` date NOT NULL,
  `POSITION` varchar(15) NOT NULL,
  `DELETED_AT` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_recorde`
--
ALTER TABLE `customer_recorde`
  ADD PRIMARY KEY (`AccountNumber`);

--
-- Indexes for table `employee_recorde`
--
ALTER TABLE `employee_recorde`
  ADD PRIMARY KEY (`sr`);

--
-- Indexes for table `transuction`
--
ALTER TABLE `transuction`
  ADD PRIMARY KEY (`TID`);

--
-- Indexes for table `xemployee`
--
ALTER TABLE `xemployee`
  ADD PRIMARY KEY (`SrNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer_recorde`
--
ALTER TABLE `customer_recorde`
  MODIFY `AccountNumber` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22005011;

--
-- AUTO_INCREMENT for table `employee_recorde`
--
ALTER TABLE `employee_recorde`
  MODIFY `sr` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transuction`
--
ALTER TABLE `transuction`
  MODIFY `TID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `xemployee`
--
ALTER TABLE `xemployee`
  MODIFY `SrNo` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
