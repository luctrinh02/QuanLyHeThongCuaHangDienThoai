
create table NhanVien(
	IdStaff varchar(7) primary key,
	name nvarchar(50) not null,
	CCCD varchar(12) unique,
	phoneNumber varchar(10) unique,
	email nvarchar(50) unique,
	salt varchar(50) not null,
	hash varchar(50) not null,
	role bit default 0,
	status bit default 1
);

create table KhachHang(
	IdGuest varchar(10) primary key,
	name nvarchar(50) not null,
	totalMoney money default 0,
	point decimal(8,2) default 0, 
	status bit default 1,
);

create table HangMay(
	typeId varchar(7) primary key,
	name nvarchar(50) not null,
);

create table Mau(
	colorid varchar(7) primary key,
	colorName nvarchar(50) not null,
);

create table DongMay(
	tag varchar(7) primary key,
	name nvarchar(50) not null,
	typeId varchar(7) not null,	
	foreign key (typeId) references HangMay(typeId) ON DELETE NO ACTION ON UPDATE CASCADE
);

create table LoaiMay(
	modelId int identity(1,1) primary key,
	tag varchar(7) not null,
	name nvarchar(50) not null,
	foreign key (tag) references DongMay(tag) ON DELETE NO ACTION ON UPDATE CASCADE
);

create table PhienBan(
	versionId varchar(7) primary key,
	name nvarchar(50) not null,
);

create table SanPham(
	IdProduct varchar(7) primary key,
	image nvarchar(50) not null,
	note nvarchar(50) not null,
	modelId int not null,
	size varchar(7) not null,
	ram varchar(7) not null,
	colorId varchar(7) not null,
	isNew bit default 1,
	versionId varchar(7),
	count int not null,
	price money not null,
	date date not null,
	status bit default 1,
	foreign key (colorId) references Mau(colorId) ON DELETE NO ACTION ON UPDATE CASCADE,
	foreign key (modelId) references LoaiMay(modelId) ON DELETE NO ACTION ON UPDATE CASCADE,
	foreign key (versionId) references PhienBan(versionId) ON DELETE NO ACTION ON UPDATE CASCADE,
);

create table MaKhuyenMai(
	promoCode varchar(7) primary key,
	value int not null,
	status bit default 1
);

create table HoaDon(
	IdBill int identity(1,1) primary key,
	IdGuest varchar(10) not null,
	date date not null,
	totalMoney money not null,
	promoCode varchar(7) not null,
	usePoint bit default 0,
	IdStaff varchar(7) not null,
	foreign key (IdGuest) references KhachHang(IdGuest) ON DELETE NO ACTION ON UPDATE CASCADE,
	foreign key (IdStaff) references NhanVien(IdStaff) ON DELETE NO ACTION ON UPDATE CASCADE,
	foreign key (promoCode) references MaKhuyenMai(promoCode) ON DELETE NO ACTION ON UPDATE CASCADE
);

create table HoaDonCHiTiet(
	IdBill int not null,
	IdProduct varchar(7) not null,
	count int not null,
	price money not null,
	primary key(IdBill,IdProduct),
	foreign key (IdBill) references HoaDon(IdBill) ON DELETE NO ACTION ON UPDATE CASCADE,
	foreign key (IdProduct) references SanPham(IdProduct) ON DELETE NO ACTION ON UPDATE CASCADE
);




