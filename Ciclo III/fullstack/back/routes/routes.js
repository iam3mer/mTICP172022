const express = require("express");

const BooksController = require("../controllers/BooksController");

const router = express.Router();

// Rutes Books
router.get('/books', BooksController.getAllBooks);
router.get('/books/isbn/:isbn', BooksController.getBookByIsbn);
router.get('/books/title/:titulo', BooksController.getBooksByTitle);
router.post('/books', BooksController.insertBook);
router.put('/books/isbn/:isbn', BooksController.updateBook);
router.delete('/books/isbn/:isbn', BooksController.deleteBook);

module.exports = router;