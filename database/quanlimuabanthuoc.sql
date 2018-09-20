-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th9 12, 2018 lúc 04:40 PM
-- Phiên bản máy phục vụ: 10.1.31-MariaDB
-- Phiên bản PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlimuabanthuoc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `benh`
--

CREATE TABLE `benh` (
  `Ma_Benh` int(11) NOT NULL,
  `Ten_Benh` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `benh`
--

INSERT INTO `benh` (`Ma_Benh`, `Ten_Benh`) VALUES
(13, 'Bạch sản niêm mạc miệng'),
(19, 'Báng bụng'),
(16, 'Biến dạng ngón chân cái'),
(22, 'Bọ chét cắn'),
(15, 'Bong gân bàn chân'),
(21, 'Bỏng hóa chất'),
(17, 'Bong tróc móng'),
(20, 'Bong võng mạc'),
(18, 'Bụi phổi'),
(10, 'Bứu giáp'),
(12, 'Bứu máu'),
(24, 'Căng cơ'),
(23, 'Căng thẳng thần kinh'),
(37, 'Cận lão'),
(28, 'Chàm'),
(40, 'Chán ăn tâm thần'),
(25, 'Chảy máu mũi'),
(31, 'Chấn thương'),
(34, 'Chấn thương dây chằng chéo sau'),
(43, 'Chấn thương đầu ở trẻ em'),
(32, 'Chấn thương lưng'),
(27, 'Chí rận'),
(44, 'Choáng'),
(30, 'Chóng mặt'),
(33, 'Chuột rút co cứng'),
(41, 'Chứng buồn ngủ ban ngày'),
(39, 'Chứng đỏ mặt'),
(35, 'Chứng khó nuốt'),
(26, 'Chứng mất trí'),
(38, 'Côn trùng cắn'),
(29, 'Cơn hen phế quản'),
(42, 'Cúm dạ dày'),
(36, 'Cúm gà'),
(45, 'Dập móng tay'),
(46, 'Di ứng cao su'),
(47, 'Di ứng thực phẩm'),
(57, 'Đau bụng kinh'),
(51, 'Đau dạ dày không do viêm loét'),
(55, 'Đau gân cốt bắp thịt'),
(50, 'Đau lưng'),
(56, 'Đau mắt đỏ'),
(49, 'Đau nữa đầu'),
(59, 'Đau nữa đầu thân nền'),
(58, 'Đau răng'),
(53, 'Đau thắt lưng'),
(52, 'Đau thắt ngực'),
(48, 'Đau thần kinh hông'),
(54, 'Đau toàn thân'),
(60, 'Gai cột sống'),
(62, 'Gặp ác mộng'),
(61, 'Giãn phế nan'),
(63, 'Hoang tưởng lo lắng'),
(64, 'Leo mi mắt'),
(65, 'Mày đay'),
(67, 'Mọc răng sữa'),
(66, 'Mụt lẹo'),
(69, 'Nấm da'),
(71, 'Nghiến răng ban đêm'),
(70, 'Ngứa'),
(72, 'Nhện lông cắn'),
(68, 'Nhiễm giun lươn'),
(5, 'Nhiễm ký sinh trùng'),
(8, 'Nhức đầu'),
(73, 'Phát ban da'),
(74, 'Quáng gà'),
(75, 'Rụng tóc'),
(6, 'Sùi mào gà'),
(7, 'Sưng mặt'),
(4, 'Sưng môi'),
(9, 'Tự kỷ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chi_tiet_hoa_don_xuat`
--

CREATE TABLE `chi_tiet_hoa_don_xuat` (
  `So_Chung_Tu_Xuat` int(11) NOT NULL,
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `So_Luong_Xuat` int(11) NOT NULL,
  `GiaBanDuaVaoSoLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `chi_tiet_hoa_don_xuat`
--

INSERT INTO `chi_tiet_hoa_don_xuat` (`So_Chung_Tu_Xuat`, `Ma_Thuoc`, `So_Luong_Xuat`, `GiaBanDuaVaoSoLuong`) VALUES
(4, '13236', 1, 1000),
(4, 'VN-15', 1, 1000),
(4, 'VN2', 5, 5000),
(34, '13236', 7, 6000),
(34, '13393', 2, 6000),
(34, '14957', 2, 0),
(34, '16303', 2, 6000),
(34, '17264', 2, 6000),
(34, '17970', 2, 0),
(35, '14957', 2, 4000),
(35, '6843', 2, 0),
(35, '7529', 2, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chong_chi_dinh`
--

CREATE TABLE `chong_chi_dinh` (
  `Ma_Benh` int(11) NOT NULL,
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `chong_chi_dinh`
--

INSERT INTO `chong_chi_dinh` (`Ma_Benh`, `Ma_Thuoc`) VALUES
(4, 'VN18'),
(15, '13236'),
(15, 'VN-15'),
(16, 'VN-15'),
(33, '14957'),
(44, '10245'),
(44, '14957'),
(49, '10245'),
(49, '6843'),
(49, 'VN90'),
(49, 'VN95'),
(67, '14957'),
(67, 'VN18');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `co_chi_dinh`
--

CREATE TABLE `co_chi_dinh` (
  `Ma_Benh` int(11) NOT NULL,
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `co_chi_dinh`
--

INSERT INTO `co_chi_dinh` (`Ma_Benh`, `Ma_Thuoc`) VALUES
(4, 'VN14'),
(5, '7529'),
(5, 'VN18'),
(13, '13236'),
(13, 'VN-15'),
(13, 'VN2'),
(15, 'VN2'),
(19, '13236'),
(19, 'VN2'),
(50, '13393'),
(55, '13393'),
(57, 'VN14'),
(57, 'VN18'),
(67, 'VN14'),
(74, 'VN14');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `co_lieu_luong_dung`
--

CREATE TABLE `co_lieu_luong_dung` (
  `Ma_Doi_Tuong_Benh_Nhan` int(11) NOT NULL,
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Lieu_Luong` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `co_lieu_luong_dung`
--

INSERT INTO `co_lieu_luong_dung` (`Ma_Doi_Tuong_Benh_Nhan`, `Ma_Thuoc`, `Lieu_Luong`) VALUES
(3, '13393', 'Theo bác sĩ'),
(3, '16303', 'Theo bác sĩ'),
(3, '17970', 'Theo bác sĩ'),
(3, 'VN-15', '2 lần/ngày'),
(3, 'VN14', 'Theo bác sĩ'),
(3, 'VN18', 'Theo bác sĩ'),
(3, 'VN2', '3 lần/ngày'),
(8, 'GC00', 'Theo bác sĩ'),
(11, '10245', 'Theo bác sĩ'),
(11, '14957', 'Theo bác sĩ'),
(11, '17264', 'Theo bác sĩ'),
(11, 'VD118', 'Theo bác sĩ'),
(12, '9924', 'Theo bác sĩ'),
(12, 'VN90', 'Theo bác sĩ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `co_thanh_phan`
--

CREATE TABLE `co_thanh_phan` (
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ma_Thanh_Phan` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `co_thanh_phan`
--

INSERT INTO `co_thanh_phan` (`Ma_Thuoc`, `Ma_Thanh_Phan`) VALUES
('10245', 7),
('11383', 7),
('13236', 1),
('13236', 5),
('13236', 6),
('13236', 10),
('13393', 6),
('13393', 10),
('VN-15', 3),
('VN11', 10),
('VN11', 12),
('VN11', 16),
('VN90', 10),
('VN90', 12);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `doi_tuong_benh_nhan`
--

CREATE TABLE `doi_tuong_benh_nhan` (
  `Ma_Doi_Tuong_Benh_Nhan` int(11) NOT NULL,
  `Ten_Doi_Tuong_Benh_Nhan` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `doi_tuong_benh_nhan`
--

INSERT INTO `doi_tuong_benh_nhan` (`Ma_Doi_Tuong_Benh_Nhan`, `Ten_Doi_Tuong_Benh_Nhan`) VALUES
(6, ' Tuổi 2-3'),
(5, 'Tuổi 0-1'),
(8, 'Tuổi 13 - 19 (Thanh Thiếu niên)'),
(10, 'Tuổi 20- 35 (Thanh niên)'),
(7, 'Tuổi 3-5'),
(11, 'Tuổi 35 - 60 (Trung niên)'),
(3, 'Tuổi 6-12 (Thiếu niên)'),
(12, 'Tuổi 60- (Cao niên)');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dung_cho`
--

CREATE TABLE `dung_cho` (
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ma_Doi_Tuong_Benh_Nhan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `dung_cho`
--

INSERT INTO `dung_cho` (`Ma_Thuoc`, `Ma_Doi_Tuong_Benh_Nhan`) VALUES
('10245', 11),
('11383', 11),
('13236', 3),
('13236', 10),
('13236', 11),
('13236', 12),
('13393', 8),
('14957', 11),
('16303', 11),
('17264', 8),
('17264', 11),
('17970', 8),
('19606', 8),
('6843', 8),
('7529', 8),
('9924', 8),
('GC00', 8),
('GC00', 11),
('VD118', 11),
('VD193', 8),
('VN2', 3),
('VN90', 8);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don_nhap`
--

CREATE TABLE `hoa_don_nhap` (
  `So_Chung_Tu_Nhap` int(11) NOT NULL,
  `Ma_Nhan_Vien` int(11) NOT NULL,
  `Ngay_Gio_Nhap` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Ten_Nha_Cung_Cap` varchar(200) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Tong_Tien_Nhap` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `hoa_don_nhap`
--

INSERT INTO `hoa_don_nhap` (`So_Chung_Tu_Nhap`, `Ma_Nhan_Vien`, `Ngay_Gio_Nhap`, `Ten_Nha_Cung_Cap`, `Tong_Tien_Nhap`) VALUES
(21, 9, '2018-08-25 17:00:00', 'Dược Phẩm Davinci', 1000000),
(28, 9, '2018-09-11 17:00:00', 'Dược phẩm Trúc Tâm', 5000000),
(29, 9, '2018-09-08 17:00:00', 'Dược phẩm Trường Thọ', 2000000),
(30, 9, '2018-08-12 17:00:00', 'TNHH Tuệ Linh', 3000000),
(31, 9, '2018-09-11 17:00:00', 'Dược Phẩm Việt Hùng', 1500000),
(32, 9, '2018-08-12 17:00:00', 'Dược phẩm Việt Đức', 3000000),
(33, 9, '2018-09-01 17:00:00', 'Dược phẩm VIMEDIMEX', 4000000),
(34, 9, '2018-08-14 17:00:00', 'Dược phẩm Vinacare', 2000000),
(35, 9, '2018-06-30 17:00:00', 'Dược phẩm Bạch Mã Vạn Xuân', 1000000),
(36, 9, '2018-06-11 17:00:00', 'Dược Phẩm TW3 chi nhánh Hà nội', 1500000),
(37, 9, '2018-07-15 17:00:00', 'TNHH Zuelig Pharma Việt nam', 2500000),
(38, 9, '2018-07-24 17:00:00', 'Dược phẩm Hoa Linh', 4500000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don_xuat`
--

CREATE TABLE `hoa_don_xuat` (
  `So_Chung_Tu_Xuat` int(11) NOT NULL,
  `Ma_Nhan_Vien` int(11) NOT NULL,
  `Ngay_Gio_Xuat` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Tong_Tien_Ban` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `hoa_don_xuat`
--

INSERT INTO `hoa_don_xuat` (`So_Chung_Tu_Xuat`, `Ma_Nhan_Vien`, `Ngay_Gio_Xuat`, `Tong_Tien_Ban`) VALUES
(4, 2, '2018-08-12 17:00:00', 10000),
(34, 2, '2018-09-11 17:00:00', 24000),
(35, 12, '2018-09-11 17:00:00', 4000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `k_dung_duoc`
--

CREATE TABLE `k_dung_duoc` (
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ma_Doi_Tuong_Benh_Nhan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `k_dung_duoc`
--

INSERT INTO `k_dung_duoc` (`Ma_Thuoc`, `Ma_Doi_Tuong_Benh_Nhan`) VALUES
('10245', 6),
('11383', 5),
('11383', 6),
('13236', 5),
('13393', 5),
('14957', 5),
('16303', 5),
('17970', 5),
('9924', 5),
('VN-15', 3),
('VN11', 5),
('VN12', 5),
('VN2', 3),
('VN2', 6),
('VN90', 5),
('VN90', 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lo`
--

CREATE TABLE `lo` (
  `Ma_Lo` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `So_Chung_Tu_Nhap` int(11) NOT NULL,
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ngay_San_Xuat` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Han_Su_Dung` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Gia_Ban` int(11) NOT NULL,
  `So_Luong` int(11) NOT NULL,
  `Don_Gia_Von` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `lo`
--

INSERT INTO `lo` (`Ma_Lo`, `So_Chung_Tu_Nhap`, `Ma_Thuoc`, `Ngay_San_Xuat`, `Han_Su_Dung`, `Gia_Ban`, `So_Luong`, `Don_Gia_Von`) VALUES
('Lo1', 21, '13236', '2018-04-30 17:00:00', '2018-09-29 17:00:00', 2000, 24, 1000),
('Lo10', 29, '17264', '2018-06-02 17:00:00', '2018-11-19 17:00:00', 3000, 24, 2000),
('Lo11', 29, 'VN2', '2018-06-02 17:00:00', '2018-11-19 17:00:00', 3000, 24, 2000),
('Lo12', 29, 'VN18', '2018-06-02 17:00:00', '2018-11-28 17:00:00', 3000, 24, 2000),
('Lo13', 35, '14957', '2017-12-31 17:00:00', '2018-09-26 17:00:00', 2000, 24, 1000),
('Lo14', 35, '14957', '2017-12-31 17:00:00', '2018-09-26 17:00:00', 2000, 24, 1000),
('Lo15', 35, '17264', '2017-12-31 17:00:00', '2018-09-26 17:00:00', 2000, 24, 1000),
('Lo16', 36, '17264', '2017-12-31 17:00:00', '2018-09-09 17:00:00', 2000, 24, 1000),
('Lo17', 37, 'VN90', '2018-09-12 14:27:22', '2018-09-09 17:00:00', 2000, 24, 1000),
('Lo2', 28, 'VN-15', '2018-04-30 17:00:00', '2018-09-29 17:00:00', 3000, 24, 2000),
('Lo3', 29, 'VN2', '2017-12-31 17:00:00', '2018-11-18 17:00:00', 3000, 24, 2000),
('Lo4', 29, '10245', '2018-04-30 17:00:00', '2018-09-29 17:00:00', 2500, 24, 1000),
('Lo5', 30, '11383', '2018-04-30 17:00:00', '2018-09-29 17:00:00', 2500, 24, 1000),
('Lo6', 21, '13393', '2018-05-08 17:00:00', '2018-09-17 17:00:00', 3000, 24, 2000),
('Lo7', 28, '13236', '2018-06-03 17:00:00', '2018-11-17 17:00:00', 3000, 24, 2000),
('Lo8', 28, '16303', '2018-06-03 17:00:00', '2018-11-17 17:00:00', 3000, 24, 2000),
('Lo9', 35, '13393', '2017-12-31 17:00:00', '2018-09-26 17:00:00', 2000, 24, 1000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_vien`
--

CREATE TABLE `nhan_vien` (
  `Ma_Nhan_Vien` int(11) NOT NULL,
  `Ho` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Chuc_Vu` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `Tuoi` int(11) DEFAULT NULL,
  `Dia_Chi` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SDT` varchar(11) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `Ten_Dang_Nhap` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Mat_Khau` varchar(200) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhan_vien`
--

INSERT INTO `nhan_vien` (`Ma_Nhan_Vien`, `Ho`, `Ten`, `Chuc_Vu`, `Tuoi`, `Dia_Chi`, `SDT`, `Email`, `Ten_Dang_Nhap`, `Mat_Khau`, `Level`) VALUES
(2, 'Danh Xuân', 'Thừa', 'Cửa hàng trưởng', 25, 'Kp.Sơn Thịnh, TT.Sóc Sơn, Hòn Đất, Kiên Giang', '01692445797', 'danhxuanthua@gmal.com', 'admin', '823d0c57423a0fde8fb1ed28479fbd08', 1),
(9, 'Huỳnh Nhựt', 'Nam', 'Thủ kho', 21, 'Sóc sơn, Hòn Đất, Kiên Giang', '0942779134', 'danhthua@gmail.com', 'thukho', '823d0c57423a0fde8fb1ed28479fbd08', 3),
(11, 'Nguyễn Chí', 'Hậu', 'Dược sĩ', 21, 'Sóc sơn, Hòn Đất, Kiên Giang', '0942779134', 'nguyenchihau@gmail.com', 'duocsi', '823d0c57423a0fde8fb1ed28479fbd08', 2),
(12, 'Danh', 'Hoàn', 'Nhân viên bán hàng', 21, 'Sóc sơn, Hòn Đất, Kiên Giang', '0942779134', 'danhhoan@gmail.com', 'banhang', '823d0c57423a0fde8fb1ed28479fbd08', 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhom_thuoc`
--

CREATE TABLE `nhom_thuoc` (
  `Ma_Nhom` int(11) NOT NULL,
  `Ten_Nhom` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhom_thuoc`
--

INSERT INTO `nhom_thuoc` (`Ma_Nhom`, `Ten_Nhom`) VALUES
(27, 'Các chất điện giải chính'),
(25, 'Các dịch điều chỉnh rối loạn dinh dưỡng'),
(26, 'Các dịch thay thế huyết tương'),
(16, 'Histamin và thuốc histamin'),
(9, 'Hormon tuyến cận giáp'),
(11, 'Hormon tuyến giáp'),
(4, 'Hormon tuyến sinh dục'),
(5, 'Hormon tuyến tụy'),
(12, 'Hormon tuyến yên'),
(6, 'Hormon vỏ thượng thận'),
(44, 'Thuốc  tê'),
(39, 'Thuốc an thần kinh'),
(38, 'Thuốc bình thần'),
(49, 'Thuốc chống amip'),
(47, 'Thuốc chống giun sán'),
(53, 'Thuốc chống lao'),
(54, 'Thuốc chống nấm'),
(37, 'Thuốc chống trầm cảm'),
(14, 'Thuốc chống ung thư'),
(30, 'Thuốc chữa đau thắt ngực'),
(35, 'Thuốc chữa động kinh'),
(40, 'Thuốc chữa gout'),
(34, 'Thuốc chữa Parkinson'),
(20, 'Thuốc chữa rối loạn hô hấp'),
(29, 'Thuốc chữa tăng huyết áp'),
(19, 'Thuốc chữa thiếu máu'),
(48, 'Thuốc diệt Trichomonas'),
(23, 'Thuốc diều chỉnh rối loạn tiêu hóa'),
(24, 'Thuốc điều chỉnh thăng bằng acid base'),
(36, 'Thuốc điều hòa động tâm thần'),
(31, 'Thuốc điều trị loạn nhịp tim'),
(52, 'Thuốc điều trị phong'),
(50, 'Thuốc điều trị sốt rét'),
(42, 'Thuốc giảm đau gây ngủ'),
(33, 'Thuốc giãn cơ vân'),
(17, 'Thuốc hạ glucose máu'),
(18, 'Thuốc hạ lipoprotein máu'),
(41, 'Thuốc hạ sốt-giảm đau-chống viêm'),
(10, 'Thuốc kháng giáp trạng tông hợp'),
(55, 'Thuốc kháng sinh'),
(51, 'Thuốc kháng virus'),
(28, 'Thuốc lợi niệu'),
(45, 'Thuốc mê'),
(43, 'Thuốc ngủ'),
(46, 'Thuốc sát khuẩn-Thuốc tẩy uế'),
(2, 'Thuốc tác dụng co bóp tử cung'),
(13, 'Thuốc tác dụng lên hệ thống miễn dịch'),
(8, 'Thuốc tránh thai'),
(32, 'Thuốc trợ tim'),
(15, 'Vitamin và khoáng chất');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thanh_phan`
--

CREATE TABLE `thanh_phan` (
  `Ma_Thanh_Phan` int(11) NOT NULL,
  `Ten_Thanh_Phan` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `thanh_phan`
--

INSERT INTO `thanh_phan` (`Ma_Thanh_Phan`, `Ten_Thanh_Phan`) VALUES
(3, 'Barbiturates'),
(13, 'Bidiphar'),
(5, 'Bosentan'),
(6, 'Carbamazepine'),
(7, 'Felbamate'),
(8, 'Griseofulvin'),
(15, 'Kabi'),
(1, 'Nicotine'),
(9, 'Oxcarbazepine'),
(10, 'Phenytoin'),
(11, 'Rifampin'),
(16, 'Salbutamol'),
(12, 'Topiramate');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thuoc`
--

CREATE TABLE `thuoc` (
  `Ma_Thuoc` varchar(5) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ma_Nhom` int(5) NOT NULL,
  `Ten_Thuoc` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Dang_Thuoc` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Xuat_Xu` varchar(30) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `Can_Toa_Bac_Si` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `thuoc`
--

INSERT INTO `thuoc` (`Ma_Thuoc`, `Ma_Nhom`, `Ten_Thuoc`, `Dang_Thuoc`, `Xuat_Xu`, `Can_Toa_Bac_Si`) VALUES
('10245', 12, 'Gonapeptyl', 'Hộp 7 ống x 1ml', 'Germany', 'Cần toa BS'),
('11383', 15, 'Vitamin C 0,5g', 'Hộp 10 ống x 5ml', 'China', 'Cần toa BS'),
('13236', 4, 'Ginoderm Gel 0,06%', 'Hộp 03 miếng dán', 'Chilê', 'Cần toa BS'),
('13393', 13, 'Mycophenolate mofetil 250 mg', 'Hộp 3 vỉ x 10 viên', 'Việt Nam', 'Cần toa BS'),
('14957', 13, 'Trancept Capsule 250mg', 'Hộp 1 vỉ x 10 viên', 'Korea', 'Cần toa BS'),
('16303', 15, 'Potassium Chloride Proamp 0,10g/ml', 'Hộp 50 ống PP', 'France', 'Cần toa BS'),
('17264', 15, 'Biotine Bayer 0.5 pour cent', 'Hộp 6 ống x 1ml', 'France', 'Cần toa BS'),
('17970', 13, 'Micocept 250mg', 'Hộp 3 vỉ x 10 viên', 'Việt Nam', 'Cần toa BS'),
('19605', 13, 'Introcell 250', 'Hộp 3 vỉ x 10 viên', 'Việt Nam', 'Cần toa BS'),
('19606', 13, 'Introcell 500', 'Hộp 3 vỉ x 10 viên', 'Việt Nam', 'Cần toa BS'),
('375', 5, 'Tyrozet Forte 1.000/5 mg', 'Hộp 10 vỉ x 10 viên', 'Việt Nam', 'Cần toa BS'),
('6843', 5, 'Mixtard 30HM-100 IU/ml', 'Hộp 1 lọ 10 ml', 'Việt Nam', 'Cần toa BS'),
('7529', 5, 'Maninil-1.75 mg', 'Viên nén', 'Việt Nam', 'Cần toa BS'),
('9924', 12, 'Diphereline-0.1mg', 'Hộp 7 lọ + 7 ống dung môi', 'Việt Nam', 'Cần toa BS'),
('GC00', 4, 'Dexacin 0.5mg', 'Viên nén', 'Việt Nam', 'Cần toa BS'),
('VD118', 27, 'Dexamethasone 0,5mg', 'viên nén - DP Mekophar', 'Việt Nam', 'Cần toa BS'),
('VD13', 4, 'Nadeper', 'Viên nén', 'Việt Nam', 'Không cần toa BS'),
('VD19', 4, 'Cor F', 'Viên nén', 'Việt Nam', 'Cần toa BS'),
('VD193', 4, 'Neo Dexa', 'Viên nén', 'Việt Nam', 'Cần toa BS'),
('VN-15', 8, 'Evra', 'Hộp 03 miếng dán', 'Thailand', 'Không cần toa BS'),
('VN11', 6, 'Dipafen inj', 'Viên nén', 'Korea', 'Cần toa BS'),
('VN12', 4, 'Bogotop', 'Viên nén', 'Việt Nam', 'Cần toa BS'),
('VN14', 4, 'Clesspra DX', 'Viên nén', 'India', 'Cần toa BS'),
('VN18', 4, 'Auricularum', 'Viên nén', 'Việt Nam', 'Cần toa BS'),
('VN2', 8, 'Ella', 'Hộp 1 vỉ x 1 viên', 'Singapore', 'Không cần toa BS'),
('VN90', 5, 'Plariche 1,75mg', 'Hộp 10 vỉ x 10 viên', 'Việt Nam', 'Cần toa BS'),
('VN95', 4, 'Tobradex 3.5g', 'Viên nén', 'Việt Nam', 'Cần toa BS');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `benh`
--
ALTER TABLE `benh`
  ADD PRIMARY KEY (`Ma_Benh`),
  ADD UNIQUE KEY `Ten_Benh` (`Ten_Benh`);

--
-- Chỉ mục cho bảng `chi_tiet_hoa_don_xuat`
--
ALTER TABLE `chi_tiet_hoa_don_xuat`
  ADD PRIMARY KEY (`So_Chung_Tu_Xuat`,`Ma_Thuoc`),
  ADD KEY `Chi_Tiet_Hoa_Don_Xuat_fk1` (`Ma_Thuoc`);

--
-- Chỉ mục cho bảng `chong_chi_dinh`
--
ALTER TABLE `chong_chi_dinh`
  ADD PRIMARY KEY (`Ma_Benh`,`Ma_Thuoc`),
  ADD KEY `Chong_Chi_Dinh_fk1` (`Ma_Thuoc`);

--
-- Chỉ mục cho bảng `co_chi_dinh`
--
ALTER TABLE `co_chi_dinh`
  ADD PRIMARY KEY (`Ma_Benh`,`Ma_Thuoc`),
  ADD KEY `Co_Chi_Dinh_fk1` (`Ma_Thuoc`);

--
-- Chỉ mục cho bảng `co_lieu_luong_dung`
--
ALTER TABLE `co_lieu_luong_dung`
  ADD PRIMARY KEY (`Ma_Doi_Tuong_Benh_Nhan`,`Ma_Thuoc`),
  ADD KEY `Co_Lieu_Luong_Dung_fk1` (`Ma_Thuoc`);

--
-- Chỉ mục cho bảng `co_thanh_phan`
--
ALTER TABLE `co_thanh_phan`
  ADD PRIMARY KEY (`Ma_Thuoc`,`Ma_Thanh_Phan`),
  ADD KEY `Co_Thanh_Phan_fk1` (`Ma_Thanh_Phan`);

--
-- Chỉ mục cho bảng `doi_tuong_benh_nhan`
--
ALTER TABLE `doi_tuong_benh_nhan`
  ADD PRIMARY KEY (`Ma_Doi_Tuong_Benh_Nhan`),
  ADD UNIQUE KEY `Ten_Doi_Tuong_Benh_Nhan` (`Ten_Doi_Tuong_Benh_Nhan`);

--
-- Chỉ mục cho bảng `dung_cho`
--
ALTER TABLE `dung_cho`
  ADD PRIMARY KEY (`Ma_Thuoc`,`Ma_Doi_Tuong_Benh_Nhan`),
  ADD KEY `Dung_Cho_fk1` (`Ma_Doi_Tuong_Benh_Nhan`);

--
-- Chỉ mục cho bảng `hoa_don_nhap`
--
ALTER TABLE `hoa_don_nhap`
  ADD PRIMARY KEY (`So_Chung_Tu_Nhap`),
  ADD KEY `Hoa_Don_Nhap_fk0` (`Ma_Nhan_Vien`);

--
-- Chỉ mục cho bảng `hoa_don_xuat`
--
ALTER TABLE `hoa_don_xuat`
  ADD PRIMARY KEY (`So_Chung_Tu_Xuat`),
  ADD KEY `Hoa_Don_Xuat_fk0` (`Ma_Nhan_Vien`);

--
-- Chỉ mục cho bảng `k_dung_duoc`
--
ALTER TABLE `k_dung_duoc`
  ADD PRIMARY KEY (`Ma_Thuoc`,`Ma_Doi_Tuong_Benh_Nhan`),
  ADD KEY `K_Dung_Duoc_fk1` (`Ma_Doi_Tuong_Benh_Nhan`);

--
-- Chỉ mục cho bảng `lo`
--
ALTER TABLE `lo`
  ADD PRIMARY KEY (`Ma_Lo`),
  ADD KEY `Lo_fk0` (`So_Chung_Tu_Nhap`),
  ADD KEY `Lo_fk1` (`Ma_Thuoc`);

--
-- Chỉ mục cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD PRIMARY KEY (`Ma_Nhan_Vien`),
  ADD UNIQUE KEY `Ten_Dang_Nhap` (`Ten_Dang_Nhap`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- Chỉ mục cho bảng `nhom_thuoc`
--
ALTER TABLE `nhom_thuoc`
  ADD PRIMARY KEY (`Ma_Nhom`),
  ADD UNIQUE KEY `Ten_Nhom` (`Ten_Nhom`);

--
-- Chỉ mục cho bảng `thanh_phan`
--
ALTER TABLE `thanh_phan`
  ADD PRIMARY KEY (`Ma_Thanh_Phan`),
  ADD UNIQUE KEY `Ma_Thanh_Phan` (`Ma_Thanh_Phan`),
  ADD UNIQUE KEY `Ten_Thanh_Phan` (`Ten_Thanh_Phan`);

--
-- Chỉ mục cho bảng `thuoc`
--
ALTER TABLE `thuoc`
  ADD PRIMARY KEY (`Ma_Thuoc`),
  ADD UNIQUE KEY `Ten_Thuoc` (`Ten_Thuoc`),
  ADD KEY `Thuoc_fk0` (`Ma_Nhom`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `benh`
--
ALTER TABLE `benh`
  MODIFY `Ma_Benh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;

--
-- AUTO_INCREMENT cho bảng `doi_tuong_benh_nhan`
--
ALTER TABLE `doi_tuong_benh_nhan`
  MODIFY `Ma_Doi_Tuong_Benh_Nhan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `hoa_don_nhap`
--
ALTER TABLE `hoa_don_nhap`
  MODIFY `So_Chung_Tu_Nhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT cho bảng `hoa_don_xuat`
--
ALTER TABLE `hoa_don_xuat`
  MODIFY `So_Chung_Tu_Xuat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  MODIFY `Ma_Nhan_Vien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `nhom_thuoc`
--
ALTER TABLE `nhom_thuoc`
  MODIFY `Ma_Nhom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT cho bảng `thanh_phan`
--
ALTER TABLE `thanh_phan`
  MODIFY `Ma_Thanh_Phan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chi_tiet_hoa_don_xuat`
--
ALTER TABLE `chi_tiet_hoa_don_xuat`
  ADD CONSTRAINT `Chi_Tiet_Hoa_Don_Xuat_fk0` FOREIGN KEY (`So_Chung_Tu_Xuat`) REFERENCES `hoa_don_xuat` (`So_Chung_Tu_Xuat`),
  ADD CONSTRAINT `Chi_Tiet_Hoa_Don_Xuat_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`);

--
-- Các ràng buộc cho bảng `chong_chi_dinh`
--
ALTER TABLE `chong_chi_dinh`
  ADD CONSTRAINT `Chong_Chi_Dinh_fk0` FOREIGN KEY (`Ma_Benh`) REFERENCES `benh` (`Ma_Benh`),
  ADD CONSTRAINT `Chong_Chi_Dinh_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`);

--
-- Các ràng buộc cho bảng `co_chi_dinh`
--
ALTER TABLE `co_chi_dinh`
  ADD CONSTRAINT `Co_Chi_Dinh_fk0` FOREIGN KEY (`Ma_Benh`) REFERENCES `benh` (`Ma_Benh`),
  ADD CONSTRAINT `Co_Chi_Dinh_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`);

--
-- Các ràng buộc cho bảng `co_lieu_luong_dung`
--
ALTER TABLE `co_lieu_luong_dung`
  ADD CONSTRAINT `Co_Lieu_Luong_Dung_fk0` FOREIGN KEY (`Ma_Doi_Tuong_Benh_Nhan`) REFERENCES `doi_tuong_benh_nhan` (`Ma_Doi_Tuong_Benh_Nhan`),
  ADD CONSTRAINT `Co_Lieu_Luong_Dung_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`);

--
-- Các ràng buộc cho bảng `co_thanh_phan`
--
ALTER TABLE `co_thanh_phan`
  ADD CONSTRAINT `Co_Thanh_Phan_fk0` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`),
  ADD CONSTRAINT `Co_Thanh_Phan_fk1` FOREIGN KEY (`Ma_Thanh_Phan`) REFERENCES `thanh_phan` (`Ma_Thanh_Phan`);

--
-- Các ràng buộc cho bảng `dung_cho`
--
ALTER TABLE `dung_cho`
  ADD CONSTRAINT `Dung_Cho_fk0` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`),
  ADD CONSTRAINT `Dung_Cho_fk1` FOREIGN KEY (`Ma_Doi_Tuong_Benh_Nhan`) REFERENCES `doi_tuong_benh_nhan` (`Ma_Doi_Tuong_Benh_Nhan`);

--
-- Các ràng buộc cho bảng `hoa_don_nhap`
--
ALTER TABLE `hoa_don_nhap`
  ADD CONSTRAINT `Hoa_Don_Nhap_fk0` FOREIGN KEY (`Ma_Nhan_Vien`) REFERENCES `nhan_vien` (`Ma_Nhan_Vien`);

--
-- Các ràng buộc cho bảng `hoa_don_xuat`
--
ALTER TABLE `hoa_don_xuat`
  ADD CONSTRAINT `Hoa_Don_Xuat_fk0` FOREIGN KEY (`Ma_Nhan_Vien`) REFERENCES `nhan_vien` (`Ma_Nhan_Vien`);

--
-- Các ràng buộc cho bảng `k_dung_duoc`
--
ALTER TABLE `k_dung_duoc`
  ADD CONSTRAINT `K_Dung_Duoc_fk0` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`),
  ADD CONSTRAINT `K_Dung_Duoc_fk1` FOREIGN KEY (`Ma_Doi_Tuong_Benh_Nhan`) REFERENCES `doi_tuong_benh_nhan` (`Ma_Doi_Tuong_Benh_Nhan`);

--
-- Các ràng buộc cho bảng `lo`
--
ALTER TABLE `lo`
  ADD CONSTRAINT `Lo_fk0` FOREIGN KEY (`So_Chung_Tu_Nhap`) REFERENCES `hoa_don_nhap` (`So_Chung_Tu_Nhap`),
  ADD CONSTRAINT `Lo_fk1` FOREIGN KEY (`Ma_Thuoc`) REFERENCES `thuoc` (`Ma_Thuoc`);

--
-- Các ràng buộc cho bảng `thuoc`
--
ALTER TABLE `thuoc`
  ADD CONSTRAINT `Thuoc_fk0` FOREIGN KEY (`Ma_Nhom`) REFERENCES `nhom_thuoc` (`Ma_Nhom`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
