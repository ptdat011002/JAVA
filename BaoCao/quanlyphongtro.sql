CREATE DATABASE QLPhongTro2

use QLPhongTro2

drop database QLPhongTro2

-- Bảng khách thuê
create TABLE KhachThue(
    cmnd VARCHAR(50) PRIMARY KEY,
    ten NVARCHAR(100),
    tuoi VARCHAR(50),
    queQuan NVARCHAR(500),
    gioiTinh NVARCHAR(5),
	sdt varchar(20),
)

select * from KhachThue

-- Bảng UserLogin
CREATE TABLE UserLogin(
    taiKhoan VARCHAR(50) PRIMARY KEY,
    matKhau VARCHAR(50)
)
insert into UserLogin(taiKhoan,matKhau) VALUES ('admin','123')

-- Bảng Phong
CREATE TABLE Phong(
    id VARCHAR(50) PRIMARY KEY,
    tang INT, 
    trangThai NVARCHAR(50)
)

insert into Phong(id,tang,trangThai) values
('201','2','chua thue'),
('202','2','chua thue'),
('301','3','chua thue'),
('302','3','chua thue'),
('401','4','chua thue'),
('402','4','chua thue'),
('501','5','chua thue'),
('502','5','chua thue'),
('601','6','chua thue'),
('602','6','chua thue')

delete from Phong where id = '201'

-- Bảng dichVu
CREATE TABLE dichVu(
    id VARCHAR(50) PRIMARY KEY,
    tenDV NVARCHAR(50),
)

-- Bảng hợp đồng
CREATE TABLE HopDong(
    id VARCHAR(50) PRIMARY KEY,
    cmnd VARCHAR(50),
    id_phong VARCHAR(50),
    giaPhong BIGINT,
    ngayVaoO DATE,
	trangThai NVarchar(50),
    CONSTRAINT fk_cmnd FOREIGN KEY (cmnd) REFERENCES KhachThue(cmnd) ON DELETE CASCADE,
    CONSTRAINT fk_id_phong FOREIGN KEY (id_phong) REFERENCES Phong(id) ON DELETE CASCADE,
)

--Bảng đơn giá

CREATE TABLE DonGia(
    id VARCHAR(50) PRIMARY KEY,
    id_HopDong VARCHAR(50),
    id_dv VARCHAR(50),
    donGia BIGINT,
    CONSTRAINT fk_HopDong FOREIGN KEY (id_HopDong) REFERENCES HopDong(id)ON DELETE CASCADE,
    CONSTRAINT fk_dv_DonGia FOREIGN KEY (id_dv) REFERENCES DichVu(id)ON DELETE CASCADE,
	
)
SELECT * FROM DonGia
-- Bảng ChiTietDichVu
CREATE TABLE ChiTietDichVu(
    id VARCHAR(50) PRIMARY KEY,
    id_dv VARCHAR(50),
	id_hoaDon VARCHAR(50),
    soLuongSuDung INT
    CONSTRAINT fk_dv FOREIGN KEY (id_dv) REFERENCES dichVu(id)
	ON DELETE CASCADE
)

drop table ChiTietDichVu

SELECT * FROM ChiTietDichVu

-- Bảng HoaDon
CREATE TABLE HoaDon(
    id VARCHAR(50) PRIMARY KEY,
    id_HopDong VARCHAR(50),
    thang INT,
    trangThai VARCHAR(50),
    CONSTRAINT fk_HoaDon FOREIGN KEY (id_HopDong) REFERENCES HopDong(id)ON DELETE CASCADE,
	tongTien BigINT,
)

drop table HoaDon

GO 
CREATE TRIGGER TongTien_ThanhToan ON ChiTietDichVu FOR INSERT
AS
BEGIN
	DECLARE @DonGia BigINT;
	SELECT @DonGia = DonGia FROM DonGia, HopDong, HoaDon, dichVu, ChiTietDichVu WHERE HopDong.id = HoaDon.id_HopDong AND DonGia.id_HopDong = HopDong.id 
	AND DonGia.id_dv = dichVu.id AND dichVu.id = (SELECT id_dv FROM inserted)

	
	UPDATE HoaDon 
		SET tongTien = tongTien + (SELECT soLuongSuDung FROM INSERTED) * @DonGia WHERE id = (SELECT id_hoaDon FROM INSERTED)
END

insert into ChiTietDichVu(id,id_dv,soLuongSuDung,id_hoaDon) values ('1n8','1',50,'93de798a-a673-4934-82f5-38740ec1239b')

SELECT * FROM HoaDon

drop trigger TongTien_ThanhToan

GO
CREATE PROC CapNhatTongTien_KhiChuaTraPhong
@id  VARCHAR(50),
@id_HopDong VARCHAR(50)
AS
BEGIN
    UPDATE HoaDon 
        SET tongTien = tongTien + (SELECT giaPhong FROM HopDong WHERE id = @id_HopDong)
        WHERE id = @id
END

DROP PROC CapNhatTongTien_KhiChuaTraPhong

--EXEC CapNhatTongTien_KhiChuaTraPhong @id ='HD01', @id_HopDong='1';

ALTER TABLE HoaDon
ALTER COLUMN trangThai nvarchar(50)

DROP TRIGGER TongTien_ThanhToan

SELECT * FROM HoaDon where trangThai = N'Chưa đóng' and id_HopDong = 'ptd202'

Select id from HoaDon where trangThai = N'Chưa đóng' and id_HopDong = '1' and thang = '6'

Select id_phong from HopDong , HoaDon where HopDong.id = HoaDon.id_HopDong and  HoaDon.id_HopDong = '1'

select tenDV,soLuongSuDung from ChiTietDichVu,dichVu where ChiTietDichVu.id_dv = dichVu.id and id_hoaDon = '7a4c95d5-566e-46f5-82af-255d901285be'

insert into ChiTietDichVu(id,id_dv,soLuongSuDung,id_hoaDon) values ('1nj78','1',50,'93de798a-a673-4934-82f5-38740ec1239b')

select id_HopDong from HoaDon,ChiTietDichVu where ChiTietDichVu.id_hoaDon = HoaDon.id And id_hoaDon = 'e37399a9-1402-44a7-ab8d-20b3b7c9e347'

select * from ChiTietDichVu where id_hoaDon = '7a4c95d5-566e-46f5-82af-255d901285be'


select * from HoaDon where thang = '1'

select sum(tongTien) as tong from HoaDon where thang = '1'