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