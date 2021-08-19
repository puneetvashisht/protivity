import React, { Component } from 'react'


export default class AddCourse extends Component {

    constructor() {
        super();
        this.state = {
            message: '',
            title: '',
            summary: ''
        }
    }

    handleTitleChange($event){
        console.log($event.target.value);
        this.setState({title: $event.target.value})
    }

    
    handleSummaryChange($event){
        console.log($event.target.value);
        this.setState({summary: $event.target.value})
    }

    addCourse(){
        if(this.state.title.length < 1){
            return;
        }
        fetch('http://localhost:8000/courses', {
            method: "POST",
            body: JSON.stringify({title: this.state.title, summary: this.state.summary}),
            headers: {"Content-type": "application/json; charset=UTF-8"}
        })
        .then(res=>{
            console.log(res);
            console.log(res.status)
            if(res.status === 201){
                this.setState({message: 'Course successfully added'})
            }
            // return res.json()
        })
        // .then(data=>{
            // console.log(data);
            // this.setState({title: "", summary: ""})
            // this.setState({courses: data});
        // })
    }
    render() {
        return (
            <div className="container">
                 <div class="alert alert-primary" role="alert">
                    {this.state.message}
                </div>
                <input type="text" onChange={this.handleTitleChange.bind(this)} placeholder="Enter title" value={this.state.title}></input>
                <input type="text" onChange={this.handleSummaryChange.bind(this)} placeholder="Enter summary" value={this.state.summary}></input>
                <button className="btn btn-primary" onClick={this.addCourse.bind(this)}>Add Course</button>
            </div>
        )
    }
}
