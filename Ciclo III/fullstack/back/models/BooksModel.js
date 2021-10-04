const mongoose = require("mongoose");

const booksSchema = mongoose.Schema({
  isbn: String,
  titulo: String,
  descripcion: String,
  genero: String,
  autores: Array
})

module.exports = mongoose.model("books", booksSchema);