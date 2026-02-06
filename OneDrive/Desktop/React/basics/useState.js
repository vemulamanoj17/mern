import React,{useState} from 'react'

const App = () => {
  const [data,setData]=useState({
    "name":"Manooj",
    "age":20
  })
  return (
    <div>
      <center>
        <h1>Hello {data.name}!</h1>  
      </center>
    </div>
  )
}

export default App
