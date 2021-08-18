import React, { Component } from 'react'
import './Card.css';
export default class Card extends Component {

    deleteCourse(){
        // http call to delete from server
        fetch('http://localhost:8000/courses/' +this.props.id, {
            method: 'DELETE'
        })
        .then(res=>res.json())
        .then(data=>console.log(data));
    }

    render() {
        return (
            <div className="card card-width">
            <img src="https://via.placeholder.com/150" className="card-img-top" alt="..."/>
            <div className="card-body">
                <h5 className="card-title">{this.props.title}</h5>
                <p className="card-text">{this.props.summary}</p>
                <a href="#" className="btn btn-primary">Go somewhere</a>
                <button className="btn btn-danger" onClick={this.deleteCourse.bind(this)}> X </button>
            </div>
            </div>
        )
    }
}
