import React from 'react';
import ReactDOM from 'react-dom';
// import Main from './Main';
import * as serviceWorker from './serviceWorker';
import App from './App';

const h1 = <h1>Hello, {new Date().toLocaleTimeString()}</h1>

//通过类的方式
class Clock extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date()
        }
    }

    componentDidMount() {
        this.timeId = setInterval(() => this.tick(), 1000);
    }

    componentWillUnmount() {
        clearInterval(this.timeId)
    }

    tick() {
        this.setState({
            date: new Date()
        })
    }

    render() {
        return (
            <h1>time: {this.state.date.toLocaleTimeString()}</h1>
        )
    }
}

// 通过函数方式创建组件
// function Time(props) {
//     return (
//         <h1>time:{props.time.toLocaleTimeString()}</h1>
//     )
// }


function App() {
    return (
        <div>
            
        </div>
    )
}

function render() {
    ReactDOM.render(<Clock />, document.getElementById('root'));
}

setInterval(render, 1000)

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
