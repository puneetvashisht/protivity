import {useState} from 'react'

import {
    useParams
  } from "react-router-dom";

const WorkoutOperation = (props) =>{

    let { id } = useParams();
    const [workout, setWorkout] = useState();

 // Calculate time difference
    function timeDiffCalc(dateFuture, dateNow) {
        var startTime = dateFuture; 
        var endTime =dateNow;
        var difference = endTime.getTime() - startTime.getTime(); // This will give difference in milliseconds
        var resultInMinutes = Math.round(difference / 60000);
        return resultInMinutes;
      }

    const startWorkout = (start) =>{
        let body = {endTime: new Date()};
        if(start){
            body = {startTime: new Date()};
        }
        
        fetch('http://localhost:8000/workouts/' + id, {
            method: "PATCH",
            body: JSON.stringify(body),
            headers: {"Content-type": "application/json; charset=UTF-8"}
        })
        .then(res=>{
            console.log(res);
            console.log(res.status)
            if(res.status === 200){
                console.log('Workout successfully updated')
            }
            return res.json();
        })
        .then(data=>{
            setWorkout(data);
        })
    }

    return (
        <>
        <h2>{workout && workout.title}</h2>
        <h3>{workout && new Date(workout.startTime).toLocaleTimeString()}</h3>
        <h3>{workout && new Date(workout.endTime).toLocaleTimeString()}</h3>

        <h2>Total calories burnt : {workout && (workout.cbpm * timeDiffCalc(new Date(workout.startTime), new Date(workout.endTime)))}</h2>
        <button className="btn btn-primary" onClick={()=> startWorkout(true)}>Start Workout</button>
        <button className="btn btn-primary" onClick={() => startWorkout(false)}>End Workout</button>
        </>
    )
}

export default WorkoutOperation;