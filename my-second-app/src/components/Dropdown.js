import React, { Component } from 'react'
import DropdownItem from './DropdownItem';

export default class Dropdown extends Component {
    constructor(){
        super();
        this.state = {show: false, caption: 'Select your cuisine', cuisines:['South Indian', 'Mexican', 'Japanese']}
    }

    toggle(){
        this.setState({show : !this.state.show});
        console.log(this.state.show)
    }

    handleItemClick(text){
        console.log('In the parent component ...', text)
        this.setState({caption: text, show: false});
    }

    render() {

        var cuisineList = this.state.cuisines.map((cuisine, i)=>{
            return <DropdownItem key={i} text={cuisine} whenItemClicked={this.handleItemClick.bind(this)}></DropdownItem>
        })

        return (
            <div className="dropdown">
            <button className="btn btn-secondary dropdown-toggle" type="button" onClick={this.toggle.bind(this)} id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                {this.state.caption}
            </button>
            <ul className={this.state.show?'dropdown-menu show': 'dropdown-menu'} aria-labelledby="dropdownMenuButton1">
                {cuisineList}
            </ul>
            </div>
        )
    }


}
