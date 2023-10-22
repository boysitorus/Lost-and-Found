CREATE DATABASE k05;

USE `k05`;

CREATE TABLE users(
	`nim` VARCHAR(8) NOT NULL PRIMARY KEY,
	`nama` VARCHAR(20) NOT NULL,
	`kata_sandi` VARCHAR(30) NOT NULL,
	`email` VARCHAR(100) NOT NULL,
	`no_hp` VARCHAR(20) NOT NULL,
	`roles` VARCHAR(9) NOT NULL
);

CREATE TABLE barang(
	`no_barang` INT AUTO_INCREMENT PRIMARY KEY,
	`nama_barang` VARCHAR(30) NOT NULL,
	`lokasi` VARCHAR(30) NOT NULL,
	`waktu` DATE NOT NULL,
	`ciri` VARCHAR(100),
	`nama` VARCHAR(20) NOT NULL,
	`nim` VARCHAR(30) NOT NULL,
	`no_hp` VARCHAR(20),
	`tipe` VARCHAR(10) NOT NULL
);

CREATE TABLE barang_balik(
	`no_barang` INT PRIMARY KEY,
	`pembuat_laporan` VARCHAR(20) NOT NULL,
	`nim_pembuat_laporan` VARCHAR(8) NOT NULL,
	`no_hp` VARCHAR(20) NOT NULL,
	`waktu_laporan_dibuat` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);


SELECT * FROM users;
SELECT * FROM barang;
SELECT * FROM barang_balik;





