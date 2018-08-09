import React, {Component} from 'react';
import {Button} from 'react-bootstrap';
import './Task.css';

class Task extends Component {

    componentDidMount() {
        console.log('mount');
    };

    handleClick = (event) => {
        alert('delete');
    };

    render() {
        return (
            <div className="Task">
                <div className="task">
                    <div className="taskId">
                        {this.props.id}
                    </div>
                    <div className="taskValue">
                        {this.props.value}
                    </div>
                    <div className="taskGroup">
                        {this.props.group}
                    </div>
                    <div className="taskStatus">
                        {this.props.status}
                    </div>
                    <Button className="taskButton" bsStyle="success" onClick={this.handleClick}>✖</Button>
                </div>
            </div>
        )
    }
}

export default Task;