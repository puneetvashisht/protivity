import React, { Component } from 'react'
import './Card.css';
export default class Card extends Component {
    render() {
        return (
            <div className="card card-width">
            <img src="https://via.placeholder.com/150" className="card-img-top" alt="..."/>
            <div className="card-body">
                <h5 className="card-title">{this.props.title}</h5>
                <p className="card-text">{this.props.summary}</p>
                <a href="#" className="btn btn-primary">Go somewhere</a>
            </div>
            </div>
        )
    }
}
