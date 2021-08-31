import React, { useState } from 'react'
import { Button } from 'react-bootstrap';
import Toast from 'react-bootstrap/Toast'
import ToastHeader from 'react-bootstrap/ToastHeader'

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
      
        fetch('http://localhost:8080/courses/', {
            method: "POST",
            body: JSON.stringify({title, description:summary}),
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
            <Toast show={message} onClose={()=>setMessage(null)}>
            <Toast.Header>
                <img src="holder.js/20x20?text=%20" className="rounded me-2" alt="" />
                <strong className="me-auto">Successfully Added</strong>
                <small>Just Now</small>
            </Toast.Header>
            <Toast.Body>{title} course added!!</Toast.Body>
            </Toast>
                 {/* <div className="alert alert-primary" role="alert">
                    {message}
                </div> */}
                <input type="text" onChange={handleTitleChange} placeholder="Enter title" value={title}></input> 
                {titleMessage  && titleMessage}
                <input type="text" onChange={handleSummaryChange} placeholder="Enter summary" value={summary}></input>
                <Button variant="secondary" onClick={addCourse}>Add Course</Button>
            </div>
    )
}

export default  AddCourse