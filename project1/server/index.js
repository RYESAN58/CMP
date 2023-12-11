const express = require('express')

const path = require('path')
const app = express();

const clientPath = path.resolve(__dirname, '../client/dist')
app.use(express.static(clientPath))

app.get('/', (req, res) => {
  // we'll do some stuff here
  res.sendFile(path.resolve(__dirname, '../client/dist', 'index.html'))
})

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}`)
})





