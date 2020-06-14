import React, { Component } from 'react'
import {Button, message} from 'antd'
/**
 * 登录界面
 */
export default class Login extends Component {
    handleClick = () => {
        message.success('Success!')
        this.props.history.replace('/')
    }

    render(){
        return (
            <div><Button type='primary' onClick={this.handleClick}>Login</Button></div>
        )
    }
}