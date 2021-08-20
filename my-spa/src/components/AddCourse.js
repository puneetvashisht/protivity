import React, { useState } from 'react'

const AddCourse = () => {

    const [title, setTitle] = useState('');
    const [summary, setSummary] = useState('');
    const [message, setMessage] = useState('');
    const [titleMessage, setTitleMessage] = useState();

    const handleTitleChange = ($event) => {
        console.log($event.target.value);
       
        setTitle($event.target.value)
        if(title.length < 6){
            setTitleMessage('Length is less than 6')
            // return;
        }
        else{
            setTitleMessage('')
        }
    }
    const handleSummaryChange = ($event) => {
        console.log($event.target.value);
        setSummary($event.target.value)
    }

    const addCourse = () => {
      
        fetch('http://localhost:8000/courses', {
            method: "POST",
            body: JSON.stringify({title, summary}),
            headers: {"Content-type": "application/json; charset=UTF-8"}
        })
        .then(res=>{
            console.log(res);
            console.log(res.status)
            if(res.status === 201){
                setMessage('Course successfully added')
            }
        })
    }


    return (
        <div className="container">
                 <div className="alert alert-primary" role="alert">
                    {message}
                </div>
                <input type="text" onChange={handleTitleChange} placeholder="Enter title" value={title}></input> 
                {titleMessage  && titleMessage}
                <input type="text" onChange={handleSummaryChange} placeholder="Enter summary" value={summary}></input>
                <button className="btn btn-primary" onClick={addCourse}>Add Course</button>
            </div>
    )
}

export default  AddCourse