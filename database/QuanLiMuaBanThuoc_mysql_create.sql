CREATE TABLE `Thanh_Phan` (
	`Ma_Thanh_Phan` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`Ten_Thanh_Phan` varchar(50) NOT NULL UNIQUE,
	PRIMARY KEY (`Ma_Thanh_Phan`)
);

CREATE TABLE `Benh` (
	`Ma_Benh` INT NOT NULL AUTO_INCREMENT,
	`Ten_Benh` varchar(50) NOT NULL UNIQUE,
	PRIMARY KEY (`Ma_Benh`)
);

CREATE TABLE `Doi_Tuong_Benh_Nhan` (
	`Ma_Doi_Tuong_Benh_Nhan` INT NOT NULL AUTO_INCREMENT,
	`Ten_Doi_Tuong_Benh_Nhan` varchar(50) NOT NULL UNIQUE,
	PRIMARY KEY (`Ma_Doi_Tuong_Benh_Nhan`)
);

CREATE TABLE `Nhom_Thuoc` (
	`Ma_Nhom` INT NOT NULL AUTO_INCREMENT,
	`Ten_Nhom` varchar(50) NOT NULL UNIQUE,
	PRIMARY KEY (`Ma_Nhom`)
);

CREATE TABLE `Thuoc` (
	`Ma_Thuoc` varchar(5) NOT NULL,
	`Ma_Nhom` INT(5) NOT NULL,
	`Ten_Thuoc` varchar(50) NOT NULL UNIQUE,
	`Dang_Thuoc` varchar(50) NOT NULL,
	`Xuat_Xu` varchar(30),
	`Can_Toa_Bac_Si` varchar(5) NOT NULL,
	PRIMARY KEY (`Ma_Thuoc`)
);

CREATE TABLE `Co_Lieu_Luong_Dung` (
	`Ma_Doi_Tuong_Benh_Nhan` INT NOT NULL,
	`Ma_Thuoc` varchar(5) NOT NULL,
	`Lieu_Luong` varchar(50) NOT NULL,
	PRIMARY KEY (`Ma_Doi_Tuong_Benh_Nhan`,`Ma_Thuoc`)
);

CREATE TABLE `Dung_Cho` (
	`Ma_Thuoc` varchar(5) NOT NULL,
	`Ma_Doi_Tuong_Benh_Nhan` INT NOT NULL,
	PRIMARY KEY (`Ma_Thuoc`,`Ma_Doi_Tuong_Benh_Nhan`)
);

CREATE TABLE `K_Dung_Duoc` (
	`Ma_Thuoc` varchar(5) NOT NULL,
	`Ma_Doi_Tuong_Benh_Nhan` INT NOT NULL,
	PRIMARY KEY (`Ma_Thuoc`,`Ma_Doi_Tuong_Benh_Nhan`)
);

CREATE TABLE `Co_Chi_Dinh` (
	`Ma_Benh` INT NOT NULL,
	`Ma_Thuoc` varchar(5) NOT NULL,
	PRIMARY KEY (`Ma_Benh`,`Ma_Thuoc`)
);

CREATE TABLE `Chong_Chi_Dinh` (
	`Ma_Benh` INT NOT NULL,
	`Ma_Thuoc` varchar(5) NOT NULL,
	PRIMARY KEY (`Ma_Benh`,`Ma_Thuoc`)
);

CREATE TABLE `Co_Thanh_Phan` (
	`Ma_Thuoc` varchar(5) NOT NULL,
	`Ma_Thanh_Phan` INT(5) NOT NULL,
	`Lieu_Lieu_Luong_Thanh_Phan` varchar(50),
	PRIMARY KEY (`Ma_Thuoc`,`Ma_Thanh_Phan`)
);

CREATE TABLE `Nhan_Vien` (
	`Ma_Nhan_Vien` INT NOT NULL AUTO_INCREMENT,
	`Ho_Ten` varchar(50) NOT NULL,
	`Chuc_Vu` varchar(50) NOT NULL,
	`Tuoi` INT NOT NULL,
	`Dia_Chi` varchar(100) NOT NULL,
	`Email` varchar(50) NOT NULL UNIQUE,
	`Ten_Dang_Nhap` varchar(50) NOT NULL UNIQUE,
	`Mat_Khau` varchar(12) NOT NULL,
	`Level` INT NOT NULL,
	PRIMARY KEY (`Ma_Nhan_Vien`)
);

CREATE TABLE `Hoa_Don_Nhap` (
	`So_Chung_Tu_Nhap` INT NOT NULL AUTO_INCREMENT,
	`Ma_Nhan_Vien` INT NOT NULL,
	`Ngay_Gio_Nhap` TIMESTAMP NOT NULL,
	`Ten_Nha_Cung_Cap` varchar(50) NOT NULL,
	`Tong_Tien_Nhap` INT NOT NULL,
	PRIMARY KEY (`So_Chung_Tu_Nhap`)
);

CREATE TABLE `Lo` (
	`Ma_Lo` varchar(5) NOT NULL,
	`So_Chung_Tu_Nhap` INT NOT NULL,
	`Ma_Thuoc` varchar(5) NOT NULL,
	`Ngay_San_Xuat` TIMESTAMP NOT NULL,
	`Han_Su_Dung` TIMESTAMP NOT NULL,
	`Gia_Ban` INT NOT NULL,
	`So_Luong` INT NOT NULL,
	`Don_Gia_Von` INT NOT NULL,
	PRIMARY KEY (`Ma_Lo`)
);

CREATE TABLE `Hoa_Don_Xuat` (
	`So_Chung_Tu_Xuat` INT NOT NULL AUTO_INCREMENT,
	`Ma_Nhan_Vien` INT NOT NULL,
	`Ngay_Gio_Xuat` TIMESTAMP NOT NULL,
	`Tong_Tien_Ban` INT NOT NULL,
	PRIMARY KEY (`So_Chung_Tu_Xuat`)
);

CREATE TABLE `Chi_Tiet_Hoa_Don_Xuat` (
	`So_Chung_Tu_Xuat` INT NOT NULL,
	`Ma_Thuoc` varchar(5) NOT NULL,
	`So_Luong_Xuat` INT NOT NULL,
	PRIMARY KEY (`So_Chung_Tu_Xuat`,`Ma_Thuoc`)
);

ALTER TABLE `Thuoc` ADD CONSTRAINT `Thuoc_fk0` FOREIGN KEY (`Ma_Nhom`) REFERENCES `Nhom_Thuoc`(`Ma_Nhom`);

ALTER TABLE `Co_Lieu_Luong_Dung` ADD CONSTRAINT `Co_Lieu_Luong_Dung_fk0` FOREIGN KEY (`Ma_Doi_Tuong_Benh_Nhan`) REFERENCES `Doi_Tuong_Benh_Nhan`(`Ma_Doi_Tuong_Benh_Nhan`);

ALTER TABLE `Co_Lieu_Luong_Dung` ADD CONSTRAINT `Co_Lieu_Luong_Dung_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `Dung_Cho` ADD CONSTRAINT `Dung_Cho_fk0` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `Dung_Cho` ADD CONSTRAINT `Dung_Cho_fk1` FOREIGN KEY (`Ma_Doi_Tuong_Benh_Nhan`) REFERENCES `Doi_Tuong_Benh_Nhan`(`Ma_Doi_Tuong_Benh_Nhan`);

ALTER TABLE `K_Dung_Duoc` ADD CONSTRAINT `K_Dung_Duoc_fk0` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `K_Dung_Duoc` ADD CONSTRAINT `K_Dung_Duoc_fk1` FOREIGN KEY (`Ma_Doi_Tuong_Benh_Nhan`) REFERENCES `Doi_Tuong_Benh_Nhan`(`Ma_Doi_Tuong_Benh_Nhan`);

ALTER TABLE `Co_Chi_Dinh` ADD CONSTRAINT `Co_Chi_Dinh_fk0` FOREIGN KEY (`Ma_Benh`) REFERENCES `Benh`(`Ma_Benh`);

ALTER TABLE `Co_Chi_Dinh` ADD CONSTRAINT `Co_Chi_Dinh_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `Chong_Chi_Dinh` ADD CONSTRAINT `Chong_Chi_Dinh_fk0` FOREIGN KEY (`Ma_Benh`) REFERENCES `Benh`(`Ma_Benh`);

ALTER TABLE `Chong_Chi_Dinh` ADD CONSTRAINT `Chong_Chi_Dinh_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `Co_Thanh_Phan` ADD CONSTRAINT `Co_Thanh_Phan_fk0` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `Co_Thanh_Phan` ADD CONSTRAINT `Co_Thanh_Phan_fk1` FOREIGN KEY (`Ma_Thanh_Phan`) REFERENCES `Thanh_Phan`(`Ma_Thanh_Phan`);

ALTER TABLE `Hoa_Don_Nhap` ADD CONSTRAINT `Hoa_Don_Nhap_fk0` FOREIGN KEY (`Ma_Nhan_Vien`) REFERENCES `Nhan_Vien`(`Ma_Nhan_Vien`);

ALTER TABLE `Lo` ADD CONSTRAINT `Lo_fk0` FOREIGN KEY (`So_Chung_Tu_Nhap`) REFERENCES `Hoa_Don_Nhap`(`So_Chung_Tu_Nhap`);

ALTER TABLE `Lo` ADD CONSTRAINT `Lo_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

ALTER TABLE `Hoa_Don_Xuat` ADD CONSTRAINT `Hoa_Don_Xuat_fk0` FOREIGN KEY (`Ma_Nhan_Vien`) REFERENCES `Nhan_Vien`(`Ma_Nhan_Vien`);

ALTER TABLE `Chi_Tiet_Hoa_Don_Xuat` ADD CONSTRAINT `Chi_Tiet_Hoa_Don_Xuat_fk0` FOREIGN KEY (`So_Chung_Tu_Xuat`) REFERENCES `Hoa_Don_Xuat`(`So_Chung_Tu_Xuat`);

ALTER TABLE `Chi_Tiet_Hoa_Don_Xuat` ADD CONSTRAINT `Chi_Tiet_Hoa_Don_Xuat_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `Thuoc`(`Ma_Thuoc`);

