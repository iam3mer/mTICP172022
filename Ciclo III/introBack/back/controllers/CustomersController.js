const customersModel = require("../models/CustomersModel");

module.exports = class CustomersController {
  static async getAll (request, response) {
    try {
      const customers = await customersModel.find();
      response.status(200).json(customers);
    } catch (err) {
      response.status(400).json({message: err.message});
    }
  }

  static async getById (request, response) {
    try {
      const id = request.params.id;
      const customer = await customersModel.findById({_id: id});
      if (customer != null) {
        response.status(200).json(customer);
      } else {
        response.status(404).json();
      }
    } catch (err) {
      response.status(400).json({message: err.message});
    }
  };

  static async getByAddress (request, response) {
    try {
      const address = request.params.address;
      const customers = await customersModel.find({address: address});
      if (customers != null) {
        response.status(200).json(customers);
      } else {
        response.status(404).json();
      } 
    }catch (err) {
      response.status(400).json({message: err.message});
    }
  };

  static async getByNameAddress (request, response) {
    try {
      const name = request.params.name;
      const address = request.params.address;
      const customers = await customersModel.find({name: name, address: address});
      if (customers != null) {
        response.status(200).json(customers);
      } else {
        response.status(404).json();
      }
    } catch (err) {
      response.status(400).json({message: err.message});
    }
  };

  static async insert (request, response) {
    try {
      const document = request.body;
      // Falta validar la estructura del documento
      const customer = await customersModel.create(document);
      response.status(201).json(customer);
    } catch (err) {
      response.status(400).json({message: err.message});
    }
  };

  static async delete (request, response) {
    try {
      const id = request.params.id;
      await customersModel.deleteOne({_id: id});
      response.status(200).json();
    } catch (err) {
      response.status(400).json({message: err.message});
    }
  };

  static async update (request, response) {
    try {
      const id = request.params.id;
      const data = request.body;
      const customer = await customersModel.updateOne({_id: id}, data);
      response.status(200).json(customer);
    } catch (error) {
      response.status(400).json({message: err.message});
    }
  };
}