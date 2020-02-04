import React, { Component } from "react";

class App extends Component {
  state = {
    helloString: ""
  };

  componentDidMount() {
	fetch("http://localhost:8080/helloWorld")
      .then(response => response.text())
      .then(res => this.setState({helloString: res}))
  }

  render() {
	return <div>{this.state.helloString}</div>;
  }
}

export default App;
