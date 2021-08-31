import React, { Component } from 'react'
import './Card.css';
import {
    Link
  } from "react-router-dom";

export default class Card extends Component {

    deleteCourse(){
        // http call to delete from server
        fetch('http://localhost:8080/courses/' +this.props.course.id, {
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
                <h5 className="card-title"><Link to={'/update/' + this.props.id}>{this.props.course.title}</Link></h5>
                <p className="card-text">{this.props.course.description}</p>
                <p className="card-text">{this.props.course.price}</p>
                <button className="btn btn-danger" onClick={this.deleteCourse.bind(this)}> X </button>
            </div>
            </div>
        )
    }
}
