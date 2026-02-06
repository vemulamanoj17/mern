import React from "react"
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
      </div>  
    )
  }
}
export default app;