import React, { useState,useEffect } from 'react'
import {
    useParams
  } from "react-router-dom";
const UpdateCourse = () => {

    const [title, setTitle] = useState('');
    const [summary, setSummary] = useState('');
    const [message, setMessage] = useState('');

    let { id } = useParams();

    useEffect(() => {
        fetch('http://localhost:8000/courses/'+id)
        .then(res=>res.json())
        .then(data=>{
            setTitle(data.title);
            setSummary(data.summary);
        })
    }, [])

    const handleTitleChange = ($event) => {
        console.log($event.target.value);
        setTitle($event.target.value)
    }
    const handleSummaryChange = ($event) => {
        console.log($event.target.value);
        setSummary($event.target.value)
    }

    const updateCourse = () => {
        if(title.length < 1){
            return;
        }
        fetch('http://localhost:8000/courses/' + id, {
            method: "PUT",
            body: JSON.stringify({title, summary}),
            headers: {"Content-type": "application/json; charset=UTF-8"}
        })
        .then(res=>{
            console.log(res);
            console.log(res.status)
            if(res.status === 200){
                setMessage('Course successfully updated')
            }
        })
    }


    return (
        <div className="container">
                 <div className="alert alert-primary" role="alert">
                    {message}
                </div>
                <input type="text" onChange={handleTitleChange} placeholder="Enter title" value={title}></input>
                <input type="text" onChange={handleSummaryChange} placeholder="Enter summary" value={summary}></input>
                <button className="btn btn-primary" onClick={updateCourse}>Update Course</button>
            </div>
    )
}

export default  UpdateCourse