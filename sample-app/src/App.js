import React from "react";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import Header from "./components/Header";
import ViewUsers from "./components/ViewUsers";
import ViewWorkouts from "./components/ViewWorkouts";
import WorkoutOperation from "./components/WorkoutOperation";

export default function App() {
  return (
    <Router>
      <div>
        <Header></Header>
        <hr />
        <Switch>
          <Route exact path="/">
            <ViewWorkouts />
          </Route>
          <Route path="/viewusers">
            <ViewUsers />
          </Route>
          <Route path="/operation/:id">
            <WorkoutOperation />
          </Route>
      
        </Switch>
      </div>
    </Router>
  );
}


