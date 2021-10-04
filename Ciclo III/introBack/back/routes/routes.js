const express = require("express");
const ExampleController = require("../controllers/ExampleController");
const CustomersController = require("../controllers/CustomersController");

const router = express.Router();

// Rutes
// router.get('/', (request, response) => {
//   response.send('Hola Tripulantes!');
// });
router.get('/', ExampleController.saludoUno);

// router.get('/saludo', (request, response) => {
//   response.status(200).json({menssage: 'Hola Tripulantes', group: 'P17'});
// });
router.get('/saludo', ExampleController.saludoDos);

// Rutes Customers
router.get('/customers/all', CustomersController.getAll);
router.get('/customers/:id', CustomersController.getById);
router.get('/customers/address/:address', CustomersController.getByAddress);
router.get('/customers/:name/:address', CustomersController.getByNameAddress);
router.post('/customers/', CustomersController.insert);
router.delete('/customers/:id', CustomersController.delete);
router.put('/customers/:id/', CustomersController.update);

module.exports = router;