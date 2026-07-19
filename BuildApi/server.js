// Import the Express module
const express = require('express');

// Initialize the Express application
const app = express();

// Define the network port
const PORT = 3000;

// Set up a standard GET route for the home page
app.get('/', (req, res) => {
    res.send('Hello World! Your Express server is running.');
});

// Bind and listen for connections on the specified port
app.listen(PORT, () => {
    console.log(`Server is operating live at http://localhost:${PORT}`);
});
