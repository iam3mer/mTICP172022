const express = require('express')
const router = express.Router()
// var mongoose = require('mongoose')
const Book = require('../models/Book.js')
const passport = require('passport')
require('../config/passport')(passport)

/* GET ALL BOOKS */
router.get('/', passport.authenticate('jwt', { session: false }), function (
  req,
  res
) {
  var token = getToken(req.headers)
  if (token) {
    Book.find(function (err, books, next) {
      if (err) return next(err)
      res.json(books)
    })
  } else {
    return res.status(403).send({ success: false, msg: 'Unauthorized.' })
  }
})

/* GET SINGLE BOOK BY ID */
router.get('/:id', function (req, res, next) {
  Book.findById(req.params.id, function (err, post) {
    if (err) return next(err)
    res.json(post)
  })
})

/* SAVE BOOK */
router.post('/', passport.authenticate('jwt', { session: false }), function (
  req,
  res
) {
  var token = getToken(req.headers)
  if (token) {
    Book.create(req.body, function (err, post, next) {
      if (err) return next(err)
      res.json(post)
    })
  } else {
    return res.status(403).send({ success: false, msg: 'Unauthorized.' })
  }
})

/* UPDATE BOOK */
router.put('/:id', function (req, res, next) {
  Book.findByIdAndUpdate(req.params.id, req.body, function (err, post) {
    if (err) return next(err)
    res.json(post)
  })
})

/* DELETE BOOK */
router.delete('/:id', function (req, res, next) {
  Book.findByIdAndRemove(req.params.id, req.body, function (err, post) {
    if (err) return next(err)
    res.json(post)
  })
})

const getToken = function (headers) {
  if (headers && headers.authorization) {
    var parted = headers.authorization.split(' ')
    if (parted.length === 2) {
      return parted[1]
    } else {
      return null
    }
  } else {
    return null
  }
}

module.exports = router
