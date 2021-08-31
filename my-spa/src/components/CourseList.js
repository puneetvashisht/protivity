import React, { useEffect, useState } from 'react'
import Card from './Card';

const CourseList = () => {

    // For state initialization use useState hook
    const [courses, setCourses] = useState([]);
    const [filteredCourses, setfilteredCourses] = useState([]);
    const [searchText, setSearchText] = useState('');
    // const [searchServerText, setSearchServerText] = useState('');

    

    // const handleServerSearchChange = (event) => {
    //     setSearchServerText(event.target.value);
    //     if(event.target.value.length > 3){
    //         fetch('http://localhost:8080/courses?title=' + event.target.value)
    //         .then(res => res.json())
    //         .then(data => {
    //             console.log(data);
    //             setCourses(data);
    //             setfilteredCourses(data);
    //         })
    //     }
    // }

    const handleSearchChange = (event) => {
        if (event.target.value == "") {
            setfilteredCourses(courses)
        }

        setSearchText(event.target.value)
        let filteredCourses = courses.filter((course) => course.title.includes(event.target.value));
        console.log(filteredCourses);
        setfilteredCourses(filteredCourses);

    }

    // For component mounting use.. useEffect hook
    useEffect(() => {
        console.log('Called up after component is mounted and running');
        fetch('http://localhost:8080/courses/')
            .then(res => res.json())
            .then(data => {
                console.log(data);
                setCourses(data);
                setfilteredCourses(data);
            })
    }, [])

    return (
        <div className="container">
            <div className="row">
                <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon1">Search By Title</span>
                    <input type="search" onChange={handleSearchChange} value={searchText} class="form-control" placeholder="Enter a Course Title" aria-label="Username" aria-describedby="basic-addon1" />

                </div>
            </div>
            {/* <div className="row">
                <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon1">Search By Title On Server</span>
                    <input type="search" onChange={handleServerSearchChange} value={searchServerText} class="form-control" placeholder="Enter a Course Title" aria-label="Username" aria-describedby="basic-addon1" />

                </div>
            </div> */}
            <div className="row">
                {
                    filteredCourses.map((course, i) => {
                        return <Card key={i} course={course}></Card>
                    })
                }

            </div>
        </div>
    )

}
export default CourseList;
