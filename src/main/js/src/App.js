import React, { Component } from 'react';
// import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor(){
    super();
    this.state = {
      image: []
    }
  }

  componentDidMount(){
    let url = 'http://localhost:8080/user/details';
    fetch(url)
    .then(response => {
      if(response.status >= 400){
        throw new Error("Bad Response");
      }
      return response.json();
    })
    .then(data => {
      this.setState({image: data.imageUrl});
    }).catch(e => {
      console.log(e);
    });
  }
  render() {
    return (
      <div className="App">
        <div>
          {this.state.image}
        </div>
      </div>
    );
  }
}

export default App;
