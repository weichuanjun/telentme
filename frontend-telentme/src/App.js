import React from "react";
import "./App.css";
import { Switch, Route } from "react-router-dom";
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
        {/* <Redirect to={"/login"} from="/" /> */}
      </Switch>
    </div>
  );
}

export default App;
