import React, { useState } from 'react'

const onChange = () => {
  const [name, setName] = useState('')
  return (
    <div>
      <center>
        Name: {name};
        <input type='text' name='name' onChange={(e)=>setName(e.target.value)}></input>)}
      </center>
    </div>
  )
}

export default onChange
