import React from 'react';
import { Link } from 'react-router-dom';
import {useAuth} from '../context/auth'
import { useHistory } from "react-router-dom";
import classes from './Navigation.module.css';


const Navigation = (props) => {
    const {isLoggedIn, setIsLoggedIn} = useAuth();
    let history = useHistory();
    console.log('In navigation comp: ', isLoggedIn)
  return (
    <nav className={classes.nav}>
      <ul>
      <li>
            {isLoggedIn &&<Link to="/">View Courses</Link>}
            </li>
            <li>
            {isLoggedIn && <Link to="/add">Add Courses</Link>}
            </li>
            <li>
            {isLoggedIn && <Link to="/users">Users</Link>}
            </li>
            <li>
            {!isLoggedIn && <Link to="/login">Login</Link>}
            </li>
            <li>
            {!isLoggedIn && <Link to="/register">Register</Link>}
            </li>
            <li>
            {isLoggedIn && <a href="#" onClick={()=>{setIsLoggedIn(false); history.push('/login')}}>Logout</a>}
            </li>
      </ul>
    </nav>
  );
};

export default Navigation;