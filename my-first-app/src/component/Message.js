// class syntax
import React, { Component } from 'react'

class Message extends Component{
    render(){
        return (
            <h2>{this.props.text}</h2>
        )
    }
}


// function syntax

// function Message(props){
//     return (
//         <h2>{props.text}</h2>
//     )
// }

export default Message;