import React, {Component} from 'react';

class Task extends Component {

    componentDidMount() {
        console.log('mount');
    }

    render() {
        return (
            <div className="item">
                <div className="task">
                    <div className="taskId">
                        {this.props.id}
                    </div>
                    <div className="taskValue">
                        {this.props.value}
                    </div>
                    <div className="taskStatus">
                        {this.props.status}
                    </div>
                    {/*<Button className="taskButton" bsStyle="success" onClick={this.handleClick}>✖</Button>*/}
                </div>
            </div>
        )
    }
}

export default Task;