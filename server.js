const express = require('express');
const request = require('request');
const fs = require('fs');

const app = express();
const port = 3000;

app.use(express.static('public'));

app.get('/api/ip', (req, res) => {
  request('https://api.ipify.org?format=json', (error, response, body) => {
    if (!error && response.statusCode === 200) {
      const ip = JSON.parse(body).ip;
      fs.appendFile('ip-addresses.txt', ip + '\n', (err) => {
        if (err) {
          console.error('Error writing to file:', err);
        } else {
          console.log('IP address saved to file');
        }
      });
      res.json({ ip });
    } else {
      console.error('Error fetching IP address:', error);
      res.status(500).json({ error: 'Error fetching IP address' });
    }
  });
});

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});