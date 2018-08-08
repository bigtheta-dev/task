import React, {Component} from 'react';

class Header extends Component {

    componentDidMount() {
        console.log('mount');
    }

    render() {
        return (
            <div>
                <header className="App-header">
                    <h1 className="App-title">Tasks App</h1>
                </header>
            </div>
        )
    }
}

export default Header;