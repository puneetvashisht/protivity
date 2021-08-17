import React, { Component } from 'react'

export default class BadgeUsingClass extends Component {

    constructor(){
        super();
        this.state = {count: 0};
    }

    incrementCount(){
        this.setState({count: ++this.state.count});
    }

    render() {
        return (
            
        <button type="button" class="btn btn-primary" onClick={this.incrementCount.bind(this)}>
            {this.props.caption} <span class="badge bg-secondary">{this.state.count}</span>
        </button>
           
        )
    }
}
