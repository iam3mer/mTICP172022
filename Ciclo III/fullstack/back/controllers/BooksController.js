const booksModel = require("../models/BooksModel");

module.exports = class BooksController {

  static async getAllBooks (request, response) {
    try {
      const books = await booksModel.find();
      if (books != null) {
        response.status(200).json(books);
      } else {
        response.status(404).json();
      }
    } catch (error) {
      response.status(400).json({message: error.message});
    }
  };

  static async getBookByIsbn (request, response) {
    try {
      const isbn = request.params.isbn;
      const book = await booksModel.findOne({isbn: isbn});
      if (book != null) {
        response.status(200).json(book);
      } else {
        response.status(404).json();
      }
    } catch (error) {
      response.status(400).json({message: error.message});
    }
  };

  static async getBooksByTitle (request, response) {
    try {
      const title = request.params.title;
      const books = await booksModel.find({titulo: title});
      if (books != null) {
        response.status(200).json(books);
      } else {
        response.status(404).json();
      }
    } catch (error) {
      response.status(400).json({message: error.message});
    }
  };

  static async insertBook (request, response) {
    try {
      const document = request.body;
      // Validar la estructura del documento y el tipo de dato
      const book = await booksModel.create(document);
      response.status(201).json(book);
    } catch (error) {
      response.status(400).json({message: error.message});
    }
  };

  static async updateBook (request, response) {
    try {
      const isbn = request.params.isbn;
      const data = request.body;
      const book = await booksModel.updateOne({isbn: isbn}, data);
      if (book.acknowledged != false) {
        response.status(200).json(book);
      } else {
        response.status(200).json({message: `Error al actualizar: no existe un documento con isbn ${isbn}`})
      }
    } catch (error) {
      response.status(400).json({message: error.message});
    }
  };

  static async deleteBook (request, response) {
    try {
      const isbn = request.params.isbn;
      const book = await booksModel.findOneAndDelete({isbn: isbn});
      response.status(200).json();
      // if (book.acknowledged != false) {
      //   response.status(200).json(book);
      // } else {
      //   response.status(200).json({message: `Error al actualizar: no existe un documento con isbn ${isbn}`})
      // }
    } catch (error) {
      response.status(400).json({message: error.message})
    }
  };

}