require("dotenv").config();

const express = require("express");
const cors = require("cors");
const mongoose = require("mongoose");

const port = process.env.PORT;

const app = express();
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({extended: true}));

// Routes ---------------------------------------------------------------------
app.use('/api', require('./routes/routes'));

// app.get('/', (request, response) => {
//   response.send('Hola Tripulantes!');
// });

// app.get('/saludo', (request, response) => {
//   response.status(200).json({menssage: 'Hola Tripulantes', group: 'P17'});
// });

// DB ---------------------------------------------------------------------
mongoose.connect(process.env.URI_DB)
  .then(() => console.log("Conexión establecida con la base de datos!"))
  .catch(err => console.error(err));

// Servidor ---------------------------------------------------------------------
app.listen(port, () => {
  console.log(`Servidor escuchando a traves de http://localhost:${port}`);
});