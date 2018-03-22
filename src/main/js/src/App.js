import React, {Component} from 'react';
// import logo from './logo.svg';
import './App.css';
import Data from './Data';

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <Data/>
        </div>
      </div>
    );
  }
}

export default App;
