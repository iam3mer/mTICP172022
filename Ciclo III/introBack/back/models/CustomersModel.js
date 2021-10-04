const mongoose = require("mongoose");

const customersSchema = mongoose.Schema({
  username: String,
  name: String,
  address: String,
  birthdate: Date,
  email: String,
  accounts: Array,
  tier_and_details: Object
});

module.exports = mongoose.model("customers", customersSchema);