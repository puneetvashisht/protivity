import React, { Component } from 'react'
import Card from './Card';

export default class CourseList extends Component {

    constructor() {
        super();
        this.state = {
            courses: [
                { title: 'Angular', summary: 'Framework from Google!!' },
                { title: 'Node', summary: 'Server side JS!!' },
                { title: 'React', summary: 'Library from Facebook!!' },
                { title: 'Java', summary: 'Object oriented from Oracle!!' }
            ]
        }
    }

    render() {

        console.log(this.state.courses);
        let list = this.state.courses.map((course, i) => {
            // return <li>{course.title}</li>
            return <Card key={i} title={course.title} summary={course.summary}></Card>
        })

        return (
            <div className="container">
                <div className="row">
                    {list}
                </div>

            </div>
        )
    }
}
