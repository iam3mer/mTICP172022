import httpClient from "./httpClient";

const END_POINT = "/api/books";

const getAllBooks = () => httpClient.get(END_POINT);
const getBookByIsbn = (isbn) => httpClient.get(`${END_POINT}/isbn/${isbn}`);
const getBooksByTitle = (titulo) => httpClient.get(`${END_POINT}/title/${titulo}`);
const insertBook = (book) => httpClient.post(END_POINT, book);
const updateBook = (isbn, data) => httpClient.put(`${END_POINT}/isbn/${isbn}`, data);
const deleteBook = (isbn) => httpClient.delete(`${END_POINT}/isbn/${isbn}`);

export {
  getAllBooks,
  getBookByIsbn,
  getBooksByTitle,
  insertBook,
  updateBook,
  deleteBook
}