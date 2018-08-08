import React, {Component} from 'react';
import axios from "axios";
import Task from "./Task";

class TaskList extends Component {

    state = {tasks: []};

    componentDidMount() {
        axios.get(`http://localhost:8080/task`)
            .then(resp => {
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
            <div>
                <h3>task list</h3>
                {this.state.tasks.map((task) => <Task key={task.id} {...task}/>)}
            </div>
        )
    }
}

export default TaskList;