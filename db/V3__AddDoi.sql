create table HoaDonDoiHang(
	idbill int,
	idproduct varchar(7),
	count int,
	date date,
	primary key (idbill,idproduct),
	foreign key (idbill) references HoaDon(idbill),
	foreign key (idproduct) references SanPham(idproduct)
);