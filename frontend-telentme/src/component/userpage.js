import React, { Component } from "react";

class Userpage extends Component {
  state = {
    user: [],
  };

  async componentDidMount() {
    const response = await fetch("/api/user");
    const body = await response.json();
    this.setState({ user: body });
    console.log(this.state);
  }

  render() {
    const { user } = this.state;
    return (
      <div>
        {user.map((usr) => (
          <li key={usr.id}>{usr.name}</li>
        ))}
      </div>
    );
  }
}

export default Userpage;
