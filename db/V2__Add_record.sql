
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
('HM05','Realme')
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
('tag05','Realme 6','HM05'),
('tag06','Realme 7','HM05'),
('tag07','Realme 8','HM05');
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
('tag04','Samsung s21 ultra'),
('tag05','Realme 6'),
('tag05','Realme 6 pro'),
('tag06','Realme 7'),
('tag06','Realme 7 pro'),
('tag07','Realme 8'),
('tag07','Realme 8 pro');
insert into PhienBan values
('PB000',N'Global'),
('PB001',N'Lock'),
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

if OBJECT_ID('baoCaoHangHoa') is not null
	drop proc baoCaoHangHoa
go
create proc baoCaoHangHoa 
	@date date as
begin
	select a.IdProduct 'Mã',c.name 'Tên',SUM(a.count) 'Số lượng',SUM(a.price*a.count) 'Doanh thu'
	from HoaDonCHiTiet a join SanPham b on a.IdProduct=b.IdProduct join LoaiMay c on b.modelId=c.modelId join HoaDon d on a.IdBill=d.IdBill
	where d.date=@date
	group by a.IdProduct,c.name 
end
go
exec baoCaoHangHoa '2021-11-10'
select MIN(date) 'date' from HoaDon

select COUNT(*) from HoaDon where date='2021-11-10'
select sum(count) from HoaDonCHiTiet a join HoaDon b on a.IdBill=b.IdBill where date='2021-11-10'
select top 1 IdProduct from  HoaDonCHiTiet a join HoaDon b on a.IdBill=b.IdBill
where date='2021-11-10'
group by IdProduct
order by count(IdProduct) desc 
select sum(price*count) from HoaDonCHiTiet a join HoaDon b on a.IdBill=b.IdBill where date='2021-11-10'

if OBJECT_ID('thongKeKhachHang') is not null
drop proc thongKeKhachHang
go
create proc thongKeKhachHang 
as
begin
	select a.IdGuest 'Ma',a.name 'Ten',a.totalMoney 'Tien',sum(count) 'SoLuong' from KhachHang a join HoaDon b on a.IdGuest=b.IdGuest
	join HoaDonCHiTiet c on b.IdBill=c.IdBill 
	group by a.IdGuest,a.name,a.totalMoney
	order by a.totalMoney desc
end
go
exec thongKeKhachHang
select * from HoaDonCHiTiet join HoaDon on HoaDon.IdBill=HoaDonCHiTiet.IdBill where IdGuest='0123456789'
if OBJECT_ID('top5') is not null
drop proc top5
go
create proc top5 
as
begin
	select top 5 a.IdGuest 'Ma',a.name 'Ten',a.totalMoney 'Tien',sum(count) 'SoLuong' from KhachHang a join HoaDon b on a.IdGuest=b.IdGuest
	join HoaDonCHiTiet c on b.IdBill=c.IdBill 
	group by a.IdGuest,a.name,a.totalMoney
	order by a.totalMoney desc
end
go

select date 'date',sum(totalMoney) 'Tien' from HoaDon 
group by date

if OBJECT_ID('thongKeNhanVien') is not null
drop proc thongKeNhanVien
go
create proc thongKeNhanVien 
as
begin
	select a.IdStaff 'ma',a.name 'ten',a.phoneNumber 'sdt',SUM(c.count) 'So'
	from NhanVien a left join HoaDon b on a.IdStaff=b.IdStaff left join HoaDonCHiTiet c on b.IdBill=c.IdBill
	group by a.IdStaff,a.name,a.phoneNumber
	order by SUM(c.count) desc
end
go

if OBJECT_ID('thongKeSanPham') is not null
drop proc thongKeSanPham
go
create proc thongKeSanPham 
as
begin
	select top 5 a.IdProduct 'ma',c.name 'ten',SUM(b.count) 'so',SUM(b.count*b.price) 'tien'
	from SanPham a join HoaDonCHiTiet b on a.IdProduct = b.IdProduct join LoaiMay c on a.modelId=c.modelId
	group by a.IdProduct,c.name
end
go

if OBJECT_ID('thongKeSanPhamAll') is not null
drop proc thongKeSanPhamAll
go
create proc thongKeSanPhamAll 
as
begin
	select a.IdProduct 'ma',c.name 'ten',SUM(b.count) 'so',SUM(b.count*b.price) 'tien'
	from SanPham a join HoaDonCHiTiet b on a.IdProduct = b.IdProduct join LoaiMay c on a.modelId=c.modelId
	group by a.IdProduct,c.name
	order by SUM(b.count*b.price) desc
end
go