import React from "react";
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

export default function App() {
  return (
    <Router>
      <div>
        <nav>
          <ul>
            <li>
              <Link to="/">View Courses</Link>
            </li>
            <li>
              <Link to="/add">Add Courses</Link>
            </li>
            <li>
              <Link to="/nameform">Uncontrolled component</Link>
            </li>
            <li>
              <Link to="/users">Users</Link>
            </li>
            <li>
              <Link to="/login">login</Link>
            </li>
          </ul>
        </nav>

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Switch>
        <Route exact path="/">
            <CourseList />
          </Route>
          <Route path="/nameform">
            <NameForm />
          </Route>
          <Route path="/users">
            <Users />
          </Route>
          <Route path="/add">
            <AddCourse />
          </Route>
          <Route path="/update/:id">
            <UpdateCourse />
          </Route>
         
          <Route path="/login">
            <LoginForm></LoginForm>
          </Route>
          <Route path="*">
            <NoMatch />
          </Route>
        </Switch>
      </div>
    </Router>
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