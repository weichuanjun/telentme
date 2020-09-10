import React from "react";
import "./App.css";
import {
  Switch,
  BrowserRouter as Route,
  Redirect,
  BrowserRouter,
} from "react-router-dom";
import { adminRoutes } from "./routes/index";

function App() {
  return (
    <div className="App">
      <Switch>
        {adminRoutes.map((route) => {
          return (
            <Route
              key={route.path}
              path={route.path}
              exact={route.exact}
              render={(routeProps) => {
                return <route.component {...routeProps} />;
              }}
            />
          );
        })}
        <Redirect to={adminRoutes[0].path} from="/admin" />
      </Switch>
    </div>
  );
}

export default App;
