// Import the Express module
const express = require('express');

// Initialize the Express application
const app = express();
app.use(express.json());

// Define the network port
const PORT = 3000;

let tasks = [
    { id: 1, title: "Initial Task", done: false },
    { id: 2, title: "Second Task", done: true }
];

// Set up a standard GET route for the home page
app.get('/', (req, res) => {
    res.send({
        name: "Sakshi",
        version: "v1",
        endpoint: '/'
    });
});

app.get('/health', (req, res) => {
    res.status(200).json({ status: "ok" });
})

// return all task
app.get('/task', (req, res) => {
    res.json(tasks);
})

app.get('/task/:id', (req, res) => {
    const taskID = req.params.id;
    const task = tasks.find(t => t.id === parseInt(taskID));

    if (task) {
        res.json(task);
    } else {
        res.status(404).json({ error: "Not Found" });
    }
})

app.post('/user-task', (req, res) => {
    const { title } = req.body;
    if (!title) {
        res.status(400).json({ error: "Title is required" });
    } else {
        const newTask = {
            id: tasks.length + 1,
            title: title,
            done: false
        }
        tasks.push(newTask)
        res.status(201).json(newTask)
    }
})

app.delete('/task/:id', (req, res) => {
    const taskID = req.params.id;
    const tid = tasks.findIndex(t => t.id === parseInt(taskID))
    if (tid != -1) {
        tasks.splice(tid, 1);
        res.status(204).send();
    } else {
        res.status(404).json({ error: "Not Found" });
    }
})

app.put('/modified-task/:id', (req, res) => {
    const taskID = req.params.id;
    const tid = tasks.findIndex(t => t.id === parseInt(taskID))

    if (tid != -1) {
        const { title, done } = req.body;
        if (title !== undefined) tasks[tid].title = title;
        if (done !== undefined) tasks[tid].done = done;
        res.json(tasks);
    } else {
        res.status(404).json({ error: "Not Found" });
    }
})

// Bind and listen for connections on the specified port
app.listen(PORT, () => {
    console.log(`Server is operating live at http://localhost:${PORT}`);
});
