import React, { Component } from 'react'
import Card from './Card';

export default class CourseList extends Component {

    constructor() {
        super();
        this.state = {
           
            courses: [
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
    shouldComponentUpdate(){
        return true;
    }

    render() {

        console.log(this.state.courses);
        let list = this.state.courses.map((course, i) => {
            // return <li>{course.title}</li>
            return <Card key={i} id={course.id} title={course.title} summary={course.summary}></Card>
        })

        return (
            <div className="container">
               
                <hr/>
                <div className="row">
                    {list}
                </div>

            </div>
        )
    }
}
