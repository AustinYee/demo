import React, {Component} from 'react'
// import logo from './logo.svg';
import './App.css'
import 'antd/dist/antd.less'

import { message } from 'antd'
import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Login from './pages/login/login'
import Admin from './pages/admin/admin'


class App extends Component {

  render() {
    return (
      <BrowserRouter>
        <Switch>
          <Route path='/login' component={Login}></Route>
          <Route path='/' component={Admin}></Route>  
        </Switch>
      </BrowserRouter>
      //
    );
  }
}

export default App;

    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>