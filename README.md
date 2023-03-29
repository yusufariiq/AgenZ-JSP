# CompanyProfile-JSP
Sebuah project kelompok tentang Company Profile yang dimana terdapat fitur CRUD atau Create, Read, Update, Delete dengan menggunakan JSP(Java Servlet Page)


## Features

- Create or Add employee data
- Read employee data
- Update employee data
- Delete employee data
- Read incoming message from form in the contact page

## Tech

We uses a number of open source projects to work properly:

- [HTML] - Membuat halaman web dan menampilkan berbagai informasi di dalam sebuah browser Internet.
- [CSS] - Mengubah serta mempercantik tampilan situs.
- [JavaScript] - Membuat fitur untuk meningkatkan tampilan situs.
- [Bootstrap] - Framework untuk menyederhanakan pengembangan tampilan situs.
- [JSP] - Mengontrol isi atau tampilan halaman web melalui penggunaan servlet dan program kecil yang dijalankan di server Web.
- [jQuery] - Library JavaScript yang membantu mengatur interaksi antara JavaScript dan HTML atau website.


## Installation

TUTORIAL MEMBUAT DATABASE SESUAI DENGAN SOURCE CODE JSP
1. Buka **XAMPP** dan nyalakan **SQL** dan **APACHE**
2. Lalu buka **localhost** di browser
3. Membuat database dengan nama **agenz**, caranya :
    ```
    CREATE DATABASE `agenz`;
    ```

4. Membuat tabel dengan nama **admin**, caranya :
    ```
    CREATE TABLE `admin` (
      `email` varchar(50) DEFAULT NULL,
      `password` varchar(50) DEFAULT NULL
    );
    ```
    (Data pada tabel admin digunakan untuk login ke admin page)

4. Membuat tabel dengan nama **employee**, caranya :
    ```
    CREATE TABLE `employee` (
      `id` int(11) NOT NULL,
      `name` varchar(100) NOT NULL,
      `email` varchar(50) NOT NULL,
      `phone` varchar(18) NOT NULL,
      `department` varchar(50) NOT NULL,
      `address` varchar(100) NOT NULL
    );
    ```
    (Tabel employee digunakan untuk **menambah** data employee, **menampilkan** data employee, **merubah** data employe, dan **menghapus** data employee)

5. Membuat tabel dengan nama **contact**, caranya :
    ```
    CREATE TABLE `contact` (
    `name` varchar(50) DEFAULT NULL,
    `email` varchar(50) DEFAULT NULL,
    `message` text DEFAULT NULL
    );
    ```
    (Tabel contact digunakan untuk menambahkan data message dari page contact)


#

## License

MIT

## Contact
Ariiq Yusuf - yusufariiq3@gmail.com
