const mongoose = require('mongoose')

const BookSchema = new mongoose.Schema({
  isbn: String,
  title: String,
  autores: Array,
  descripcion: String,
  portada: String
  // published_year: String,
  // publisher: String,
  // updated_date: { type: Date, default: Date.now }
})

module.exports = mongoose.model('Books', BookSchema)
