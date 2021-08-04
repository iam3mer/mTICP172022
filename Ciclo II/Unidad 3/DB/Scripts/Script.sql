DELETE FROM books WHERE isbn = 'sdgfsdgf';

SELECT COUNT() FROM sales s JOIN books b WHERE s.id_book = b.id AND b.isbn = 'dfgdfg';

SELECT b.id as id_book, b.title, SUM(s.amount) as bAmount FROM books b, sales s WHERE b.id = s.id_book AND b.isbn = 'sdfgsg34';

SELECT book.title, SUM(book.amount), SUM(amount) FROM sales s JOIN (SELECT b.id as id_book, b.title, SUM(s.amount) FROM books b, sales s WHERE b.id = s.id_book AND b.isbn = 'sdfgsg34') as book WHERE book.id_book = s.id_book;