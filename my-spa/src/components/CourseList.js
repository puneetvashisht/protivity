import React, { useEffect, useState } from 'react'
import Card from './Card';

const CourseList = () =>{

    // For state initialization use useState hook
    const [courses, setCourses] = useState([]);

    // For component mounting use.. useEffect hook
    useEffect(() => {
        console.log('Called up after component is mounted and running');
        fetch('http://localhost:8000/courses')
        .then(res=>res.json())
        .then(data=>{
            console.log(data);
            setCourses(data);
        })     
    }, [])

    return (
                <div className="container">
                    <div className="row">
                        {
                            courses.map((course, i) => {
                                return <Card key={i} id={course.id} title={course.title} summary={course.summary}></Card>
                            })
                        }
                    </div>
                </div>
    )

}
export default CourseList;
