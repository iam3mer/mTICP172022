create table books (
	id integer not null primary key,
	title varchar(60) not null,
	isbn varchar(60) not null unique,
	year numeric(4) not null
);

create table stock (
	id_book integer not null primary key,
	amount integer not null,
	foreign key (id_book) references books (id)
);

create table sales (
	sale_date date not null,
	id_book integer not null,
	amount integer not null,
	primary key (sale_date, id_book),
	foreign key (id_book) references books (id)
);

-- Obtener libro por ISBN
select * from books where isbn = 'tyrety';

-- Consultar todos los libros
SELECT * FROM books;

-- Obtener existencias de un libro por id
SELECT amount FROM stock WHERE id_book = 1;

-- Realizar venta
-- Comprobar existencias
-- getStock()
-- Anotar la venta
INSERT INTO sales (sale_date,id_book,amount) VALUES (datetime('now'), 1, 5);
-- Actualizar el stock
UPDATE stock SET amount = 15 WHERE id_book = 1;