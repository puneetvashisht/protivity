import React, { Component } from 'react'
import Card from './Card';

export default class CourseList extends Component {

    constructor() {
        super();
        this.state = {
            message: '',
            title: '',
            summary: '',
            courses: [
                // { title: 'Angular', summary: 'Framework from Google!!' },
                // { title: 'Node', summary: 'Server side JS!!' },
                // { title: 'React', summary: 'Library from Facebook!!' },
                // { title: 'Java', summary: 'Object oriented from Oracle!!' }
            ]
        }
    }

    componentDidMount() {
        console.log('Called up after component is mounted and running');
        //http call to backend -- dummy json server  
        // http call to real backed -- java/.net application

        // fetch to get data from backend.
        fetch('http://localhost:8000/courses')
        .then(res=>res.json())
        .then(data=>{
            console.log(data);
            this.setState({courses: data});
        })
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

    handleTitleChange($event){
        console.log($event.target.value);
        this.setState({title: $event.target.value})
    }

    
    handleSummaryChange($event){
        console.log($event.target.value);
        this.setState({summary: $event.target.value})
    }
    

    render() {

        console.log(this.state.courses);
        let list = this.state.courses.map((course, i) => {
            // return <li>{course.title}</li>
            return <Card key={i} id={course.id} title={course.title} summary={course.summary}></Card>
        })

        return (
            <div className="container">
                <div class="alert alert-primary" role="alert">
                    {this.state.message}
                </div>
                <input type="text" onChange={this.handleTitleChange.bind(this)} placeholder="Enter title" value={this.state.title}></input>
                <input type="text" onChange={this.handleSummaryChange.bind(this)} placeholder="Enter summary" value={this.state.summary}></input>
                <button className="btn btn-primary" onClick={this.addCourse.bind(this)}>Add Course</button>
                <hr/>
                <div className="row">
                    {list}
                </div>

            </div>
        )
    }
}
