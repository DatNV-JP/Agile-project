USE [master]
GO
/****** Object:  Database [FPT_APP]    Script Date: 14/11/2021 8:22:59 PM ******/
CREATE DATABASE [FPT_APP]
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FPT_APP].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [FPT_APP] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [FPT_APP] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [FPT_APP] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [FPT_APP] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [FPT_APP] SET ARITHABORT OFF 
GO
ALTER DATABASE [FPT_APP] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [FPT_APP] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [FPT_APP] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [FPT_APP] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [FPT_APP] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [FPT_APP] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [FPT_APP] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [FPT_APP] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [FPT_APP] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [FPT_APP] SET  DISABLE_BROKER 
GO
ALTER DATABASE [FPT_APP] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [FPT_APP] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [FPT_APP] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [FPT_APP] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [FPT_APP] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [FPT_APP] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [FPT_APP] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [FPT_APP] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [FPT_APP] SET  MULTI_USER 
GO
ALTER DATABASE [FPT_APP] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [FPT_APP] SET DB_CHAINING OFF 
GO
ALTER DATABASE [FPT_APP] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [FPT_APP] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [FPT_APP] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [FPT_APP] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [FPT_APP] SET QUERY_STORE = OFF
GO
USE [FPT_APP]
GO
/****** Object:  User [FPL_DB]    Script Date: 14/11/2021 8:22:59 PM ******/

/****** Object:  Table [dbo].[Grade]    Script Date: 14/11/2021 8:22:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Grade](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[maSV] [nvarchar](50) NULL,
	[tiengAnh] [float] NULL,
	[tinHoc] [float] NULL,
	[GDTC] [float] NULL,
 CONSTRAINT [PK_Grade] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 14/11/2021 8:22:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[maSV] [nvarchar](50) NOT NULL,
	[hoTen] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[sdt] [varchar](15) NULL,
	[diaChi] [nvarchar](300) NULL,
	[gioiTinh] [bit] NULL,
	[hinh] [image] NULL,
 CONSTRAINT [PK_Student] PRIMARY KEY CLUSTERED 
(
	[maSV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 14/11/2021 8:22:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NULL,
	[role] [nvarchar](30) NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Grade]  WITH CHECK ADD  CONSTRAINT [FK_Grade_Student] FOREIGN KEY([maSV])
REFERENCES [dbo].[Student] ([maSV])
GO
ALTER TABLE [dbo].[Grade] CHECK CONSTRAINT [FK_Grade_Student]
GO
USE [master]
GO
ALTER DATABASE [FPT_APP] SET  READ_WRITE 
GO