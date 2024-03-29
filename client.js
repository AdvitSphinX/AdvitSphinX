fetch('/api/ip')
  .then(response => response.json())
  .then(data => {
    document.getElementById('ip-address').textContent = data.ip;
  })
  .catch(error => {
    console.error('Error fetching IP address:', error);
  });