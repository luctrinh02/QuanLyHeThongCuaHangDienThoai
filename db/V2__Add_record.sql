
insert into NhanVien values
('NV00',N'Nhóm 4','038202007739','0397573143','lucttph17307@fpt.edu.vn','HFS19cfmA3VvhKAYS/ojWg==','LLaY4LkcZAWe4ZFk65pqkQ==',1,1),--pass 123456
('PH17307',N'Trịnh Tiến Lực','038202007738','0397573145','trinhluc003@gmail.com','T2rjoP2bBhQ/A8v/YWnh/Q==','ldZ3MHn4LfP/aqUeck1W4w==',0,1)--pass luc123
insert into KhachHang values
('0123456789',N'Mai Văn Tùng',57600000,640,1),
('0113456789',N'Nguyễn Thanh Tùng',10000000,100,1),
('0122456789',N'Lê Trọng Hoàng',20000000,200,1),
('0123356789',N'Hoàng Thị Mai',25000000,250,1),
('0123455789',N'Trịnh Viết Châu',13000000,130,1)
insert into HangMay values
('HM01','Iphone'),
('HM02','SamSung'),
('HM03','Oppo'),
('HM04','Xiaomi'),
('HM05','Asus')
insert into Mau values
('CL01',N'Xanh đại dương'),
('CL02',N'Vàng gold'),
('CL03',N'Bạc'),
('CL04',N'Đen than chì'),
('CL05',N'Đen')
insert into DongMay values
('tag01','Iphone 11','HM01'),
('tag02','Iphone 12','HM01'),
('tag03','Iphone 13','HM01'),
('tag04','SamSung s21','HM02'),
('tag05','ROG','HM05')
insert into LoaiMay(tag,name) values
('tag01','Iphone 11'),
('tag01','Iphone 11 pro'),
('tag01','Iphone 11 pro max'),
('tag02','Iphone 12'),
('tag02','Iphone 12 pro'),
('tag02','Iphone 12 pro max'),
('tag03','Iphone 13'),
('tag03','Iphone 13 pro'),
('tag03','Iphone 13 pro max'),
('tag04','Samsung s21'),
('tag04','Samsung s21+'),
('tag04','Samsung s21 ultra');
insert into PhienBan values
('PB000','Global'),
('PB001','Lock'),
('PB002',N'Việt Nam'),
('PB003',N'Hàn Quốc')
insert into SanPham values
('SP0001','iphone11_vang.png',N'',1,'64GB','4GB','CL02',1,'PB000',10,10000000,'20211110',1),
('SP0002','iphone11_xanh.png',N'',1,'128GB','8GB','CL01',1,'PB000',10,13000000,'20211110',1),
('SP0003','iphone11pro_bac.png',N'',2,'64GB','4GB','CL03',1,'PB000',10,15000000,'20211110',1),
('SP0004','iphone11promax_vang.png',N'',3,'128GB','4GB','CL02',1,'PB000',10,17000000,'20211110',1),
('SP0005','iphone12_vang.png',N'',4,'64GB','4GB','CL02',1,'PB000',10,20000000,'20211110',1),
('SP0006','iphone12_bac.png',N'',4,'128GB','4GB','CL03',1,'PB000',10,20000000,'20211110',1),
('SP0007','iphone12pro_than.png',N'',5,'64GB','4GB','CL04',1,'PB000',10,25000000,'20211110',1),
('SP0008','iphone12pro_vang.png',N'',5,'128GB','4GB','CL02',1,'PB000',10,25000000,'20211110',1),
('SP0009','iphone12promax_xanh.png',N'',6,'512GB','4GB','CL01',1,'PB000',10,27000000,'20211110',1),
('SP0010','iphone13_xanh.png',N'',7,'128GB','4GB','CL01',1,'PB000',10,25000000,'20211110',1),
('SP0011','iphone13pro_xanh.png',N'',8,'128GB','4GB','CL01',1,'PB000',10,27000000,'20211110',1),
('SP0012','iphone13pro_vang.png',N'',8,'128GB','4GB','CL02',1,'PB000',10,27000000,'20211110',1),
('SP0013','iphone13pro_than.png',N'',8,'128GB','4GB','CL03',1,'PB000',10,27000000,'20211110',1),
('SP0014','iphone13promax_xanh.png',N'',9,'128GB','4GB','CL01',1,'PB000',10,32000000,'20211110',1),
('SP0015','iphone13promax_than.png',N'',9,'128GB','4GB','CL04',1,'PB000',10,32000000,'20211110',1),
('SP0016','samsungs21_xanh.png',N'',10,'128GB','12GB','CL01',1,'PB000',10,17000000,'20211110',1),
('SP0017','samsungs21_vang.png',N'',10,'128GB','12GB','CL02',1,'PB000',10,17000000,'20211110',1),
('SP0018','samsungs21_bac.png',N'',10,'128GB','12GB','CL03',1,'PB000',10,17000000,'20211110',1),
('SP0019','samsungs21_than.png',N'',10,'128GB','12GB','CL04',1,'PB000',10,17000000,'20211110',1),
('SP0020','samsungs21plus_xanh.png',N'',11,'128GB','12GB','CL01',1,'PB000',10,20000000,'20211110',1),
('SP0021','samsungs21plus_den.png',N'',11,'128GB','12GB','CL05',1,'PB000',10,20000000,'20211110',1)

insert into MaKhuyenMai values
('None',0,1),
('KTCH',10,1),
('NGVN',10,1);
insert into HoaDon(IdGuest,date,totalMoney,promoCode,usePoint,IdStaff) values 
('0123456789','20211110',57600000,'KTCH',0,'PH17307'),
('0113456789','20211110',10000000,'None',0,'PH17307'),
('0122456789','20211110',20000000,'None',0,'PH17307'),
('0123356789','20211110',25000000,'None',0,'PH17307'),
('0123455789','20211110',13000000,'None',0,'PH17307');
insert into HoaDonCHiTiet values
(1,'SP0014',1,32000000),
(1,'SP0015',1,32000000),
(2,'SP0001',1,10000000),
(3,'SP0020',1,20000000),
(4,'SP0014',1,25000000),
(5,'SP0014',1,13000000);
select * from HoaDonCHiTiet
select * from SanPham join LoaiMay on SanPham.modelId = LoaiMay.modelId where status = 1 AND name like '% %'

