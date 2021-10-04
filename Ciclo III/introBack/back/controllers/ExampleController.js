module.exports = class ExampleController {
  static async saludoUno (request, response) {
    response.send('Hola Tripulantes');
  };

  static async saludoDos (request, response) {
    response.status(200).json({menssage: 'Hola Tripulantes', group: 'P17'});
  }
}