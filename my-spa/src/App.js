import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link,
  useLocation
} from "react-router-dom";
import AddCourse from "./components/AddCourse";
import CourseList from "./components/CourseList";
import LoginForm from "./components/login-form";
import NameForm from './components/NameForm'
import UpdateCourse from "./components/UpdateCourse";
import Register from "./components/Register";
import Login from "./components/Login";
import MainHeader from "./components/MainHeader";
import { AuthContext } from './context/auth';

import './App.css'; 
import PrivateRoute from './components/PrivateRoute';

export default function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [userId, setUserId] = useState('');
  const loginHandler = (login) => {
    setIsLoggedIn(login);
  }

  const handleSetUserId = (userId) => {
    setUserId(userId);
  }

  return (
    <AuthContext.Provider value={{isLoggedIn:isLoggedIn, setIsLoggedIn: loginHandler, userId, setUserId: handleSetUserId}}>
    <Router>
      <div className="container">
      <div className="row">
        <MainHeader></MainHeader>
      </div>
      <div className="row">
        <div className="content">
        

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Switch>
        <PrivateRoute exact path="/"  component={CourseList}>
          </PrivateRoute>
          <Route path="/nameform">
            <NameForm />
          </Route>
          <PrivateRoute path="/users" component={Users}>
            {/* <Users /> */}
          </PrivateRoute>
          <Route path="/add">
            <AddCourse />
          </Route>
          <Route path="/update/:id">
            <UpdateCourse />
          </Route>
         
          <Route path="/login" component={Login}>
            
          </Route>
          <Route path="/register">
            <Register></Register>
          </Route>
          <Route path="*">
            <NoMatch />
          </Route>
        </Switch>
          </div>
        </div>
      </div>
    </Router>
    </AuthContext.Provider>
  );
}

function Home() {
  return <h2>Home</h2>;
}

function About() {
  return <h2>About</h2>;
}

function Users() {
  return <h2>Users</h2>;
}


function NoMatch() {
  let location = useLocation();

  return (
    <div>
      <h3>
        No match for <code>{location.pathname}</code>
      </h3>
    </div>
  );
}