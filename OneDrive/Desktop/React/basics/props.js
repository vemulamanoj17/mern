// In app.js
import React from "react"
import Test from "./Test";
class app extends React.Component{
  state={
      name:"Manoj",
      age:22
    }
  render(){
    let namee="kumar";
    return(
      <div>
        <h1>im from class component {this.state.name} als0 {namee} and age is {this.state.age}</h1>
        <Test name={this.state.name} age={this.state.age} />
      </div>  
    )
  }
}
export default app;

// In test.js

import React from "react";
class test extends React.Component{
    render(){
        return(
            <div>
                <h1>Hi my name is {this.props.name} and age is {this.props.age}</h1>
            </div>
        )
    }
}
export default test;