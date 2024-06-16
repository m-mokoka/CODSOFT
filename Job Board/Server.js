const express = require('express');
const app = express();
const cors = require('cors');
const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/jobboard', { useNewUrlParser: true, useUnifiedTopology: true });

const jobSeekerSchema = new mongoose.Schema({
  // define your schema here
  name: String,
  email: String,
  // ...
});