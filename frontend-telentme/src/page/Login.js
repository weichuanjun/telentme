import React, { Component } from "react";
import { Form, Input, Button, Card, message } from "antd";
import "./Login.css";

class Login extends Component {
  state = {};

  render() {
    const onFinsh = (values) => {
      if (values) {
        message.err("dd");
      }
    };
    return (
      <Card title="Login" className="login">
        <Form name="login" onFinish={onFinsh}>
          <Form.Item name="username">
            <Input></Input>
          </Form.Item>
          <Button htmlType="submit">Comfire</Button>
        </Form>
      </Card>
    );
  }
}

export default Login;
