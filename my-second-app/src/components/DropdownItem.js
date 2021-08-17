import React, { Component } from 'react'

export default class DropdownItem extends Component {

    handleItemClick(){
        console.log('Item clicked: ' + this.props.text);
        this.props.whenItemClicked(this.props.text)
    }

    render() {
        return (
            <li><a className="dropdown-item" href="#" onClick={this.handleItemClick.bind(this)}>{this.props.text}</a></li>
        )
    }
}
