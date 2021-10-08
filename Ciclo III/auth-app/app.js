const express = require("express");
const path = require("path");
const favicon = require("serve-favicon");
const logger = require("morgan");
// var bodyParser = require("body-parser");
const auth = require("./routes/auth");

const book = require("./routes/book");
const app = express();
const mongoose = require("mongoose");

mongoose.Promise = require("bluebird");
mongoose
  .connect(
    // "mongodb+srv://jhsw2s:0123456789@cluster0.ierv8.mongodb.net/database_app?retryWrites=true&w=majority",
    "mongodb+srv://jhsw2s:0123456789@cluster0.ssyar.mongodb.net/database_app?retryWrites=true&w=majority",
    {
      promiseLibrary: require("bluebird")
    }
  )
  .then(() => console.log("connection succesful"))
  .catch(err => console.error(err));

app.use(logger("dev"));
app.use(express.json());
app.use(express.urlencoded({ extended: "false" }));
app.use(express.static(path.join(__dirname, "dist")));
app.use("/book", express.static(path.join(__dirname, "dist")));
app.use("/books", book);
app.use("/api/auth", auth);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error("Not Found");
  err.status = 404;
  next(err);
});

// restful api error handler
app.use(function(err, req, res, next) {
  console.log(err);

  if (req.app.get("env") !== "development") {
    delete err.stack;
  }

  res.status(err.statusCode || 500).json(err);
});

module.exports = app;
