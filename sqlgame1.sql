drop database Game1
go

create database Game1
go 

use Game1
go

create table ROLES
(
	RoleID int identity(0, 1) primary key,
	RoleName nvarchar(50) unique
)

create table USERS
(
	UserID nvarchar (20) primary key,
	Name nvarchar (50) unique,
	Pass nvarchar (50) not null,
	RoleID int foreign key(RoleID) references ROLES(RoleID) --default 0
)

create table RESULTS 
(
	ResultID int identity primary key,
	TimeResult datetime default GETDATE(),
	UserMark int check (UserMark>=0),
	UserID nvarchar (20) foreign key (UserID) references USERS(UserID)
)
go

insert into ROLES (RoleName) values (N'Người chơi')
insert into ROLES (RoleName) values (N'Quản trị')
insert into USERS values ('yen',N'Yến Trần ','123', 1)
insert into USERS values ('xuan',N'Xuân Võ','123', 0)
go


create proc ThemUser (@useid nvarchar (20), @name nvarchar (50) ,@pass nvarchar (20), @role int, @kq nvarchar (300) output )
as 
set @kq = ''
if exists (select *from USERS where UserID = @useid)
	set @kq = N'Tên đăng nhập đã có!' + char(10)
if exists (select *from USERS where Name = @name)
	set  @kq += N'Trùng tên tài khoản!' + char(10)
if @role not in (0, 1)
	set @kq += N'Quyền phải là 0, 1'  
if @kq = ''
begin
	insert into USERS values (@useid, @name, @pass, @role)
	set @kq = N'Đã đăng kí tài khoản mới thành công.'
end
go

create proc ThemAccount (@useid nvarchar (20), @name nvarchar (50) ,@pass nvarchar (20), @role int, @kq nvarchar (300) output )
as 
set @kq = ''
if exists (select *from USERS where UserID = @useid)
	set @kq = N'Tên đăng nhập đã có!' + char(10)
if exists (select *from USERS where Name = @name)
	set  @kq += N'Trùng tên tài khoản!' + char(10)
if @kq = ''
begin
	insert into USERS values (@useid, @name, @pass, @role)
	set @kq = N'Đã đăng kí tài khoản mới thành công.'
end
go


create proc ThemResult (@userMark int, @userID nvarchar(20), @kq nvarchar(300) output )
as 
set @kq = ''
if @userMark < 0 
	set @kq += N'Điểm phải lớn hơn hoặc bằng 0' + char(10)
if not exists (select * from users where userID = @userID)
	set @kq += N'Tên đăng nhập không hợp lệ' + char(10)
if @kq = ''
begin
	insert into RESULTS(UserMark, UserID) values (@userMark, @userID)
	set @kq = N'Đã ghi lịch sử lượt chơi'
end
go


create proc UpdateUser (@useid nvarchar (20), @name nvarchar (50) ,@pass nvarchar (20), @role int, @kq nvarchar (300) output )
as 
set @kq = ''
if not exists (select *from USERS where UserID = @useid)
	set @kq += N'Tên đăng nhập không trùng khớp!' + char(10)
if @kq = ''
begin
	update USERS  set UserID = @useid, Name = @name, Pass = @pass, RoleID = @role where UserID = @useid
	set @kq += N'Đã cập nhật tài khoản thành công!' + char(10)
end
go


create proc UpdateAccountAdmin (@useid nvarchar (20), @name nvarchar (50) ,@pass nvarchar (20), @role int ,@kq nvarchar (300) output )
as 
set @kq = ''
if not exists (select *from USERS where UserID = @useid)
	set @kq += N'Tên đăng nhập không trùng khớp!' + char(10)
if @kq = ''
begin
	update USERS  set UserID = @useid, Name = @name, Pass = @pass, RoleID = @role where UserID = @useid and RoleID = @role
	set @kq += CONCAT(N'Đã cập nhật tài khoản thành công'+ char(10), N'Tên đăng nhập: '+ @useid +char(10), N'Tên tài khoản: '+@name +char(10), N'Mật khẩu: '+ @pass +char(10))
end
go


create proc DeleteAccountAdmin (@useid nvarchar (20), @name nvarchar (50) ,@pass nvarchar (20), @role int ,@kq nvarchar (300) output )
as 
set @kq = ''
if not exists (select * from USERS where UserID = @useid or RoleID = @role)
	set @kq += N'Tên đăng nhập không trùng khớp!' + char(10)
if not exists (select * from USERS where Name = @name)
	set @kq += N'Tên tài khoản không trùng khớp!' + char(10)
if not exists (select * from USERS where Pass = @pass)
	set @kq += N'Mật khẩu không trùng khớp!' + char(10)
if @kq = ''
begin
	delete from USERS where UserID = @useid and RoleID = @role
	set @kq += CONCAT(N'Đã xoá tài khoản "' + @name, N'" thành công!' +char(10))
end
go




select * from USERS

select * from RESULTS where userID='cong'

delete USERS where userID=N'trường'




SELECT DISTINCT TOP(10)  UserMark, Name FROM RESULTS, USERS 
WHERE RESULTS.USERID = USERS.USERID 
ORDER BY RESULTS.UserMark DESC ;



