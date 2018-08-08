import React, {Component} from 'react';
import './App.css';
import NewTask from "./NewTask";
import TaskList from "./TaskList";
import Header from "./Header";


class App extends Component {
    render() {
        return (
            <div className="App">
                <Header/>
                <NewTask/>
                <TaskList/>
            </div>
        );
    }
}

export default App;
