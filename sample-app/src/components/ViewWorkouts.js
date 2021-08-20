import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom';

const ViewWorkouts = () =>{

    // For state initialization use useState hook
    const [workouts, setWorkouts] = useState([]);

    // For component mounting use.. useEffect hook
    useEffect(() => {
        console.log('Called up after component is mounted and running');
        fetch('http://localhost:8000/workouts')
        .then(res=>res.json())
        .then(data=>{
            console.log(data);
            setWorkouts(data);
        })     
    }, [])

    return (
                <div className="container">
                    <div className="row">
                    <table className="table">
                    <thead>
                        <tr>
                        <th scope="col">#</th>
                        <th scope="col">Workout Title</th>
                        <th scope="col">Calories Burnt Per Miniute(cbpm)</th>
                        <th scope="col">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            workouts.map((workout, i) => {
                                return (<tr>
                                <th scope="row">{i+1}</th>
                                <td>{workout.title}</td>
                                <td>{workout.cbpm}</td>
                                <td><Link to={'/operation/' + workout.id}>Start Workout</Link></td>
                              </tr>);
                            })
                        }
                    </tbody>
                    </table>
                    </div>
                </div>
    )

}
export default ViewWorkouts;
