import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './component/App';
import registerServiceWorker from './registerServiceWorker';
import styles from 'bootstrap/dist/css/bootstrap.css';

ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();
