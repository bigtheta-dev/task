import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import axios from "axios";

class App extends Component {
    state = {
        filter: '',
        tasks: []
    };


    componentDidMount() {
        console.log("component mount");
        axios.get(`http://localhost:8080/task`)
            .then(resp => {
                console.log(resp.data);
                this.setState(() => ({
                    tasks: resp.data
                }));
            })
            .catch(function (error) {
                console.log(error);
            });
    }

    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <h1 className="App-title">Welcome to React</h1>
                </header>
                <p className="App-intro">
                    To get started, edit <code>src/App.js</code> and save to reload.
                </p>
                <div className="flex-container">
                    {this.state.tasks.map((task) => <div key={task.id} className="taskValue"> {task.value} </div>)}
                </div>
            </div>
        );
    }
}

export default App;
