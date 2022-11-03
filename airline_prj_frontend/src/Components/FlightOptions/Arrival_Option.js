import React from "react";
import axios from 'axios';
import { Component, useState, useEffect } from 'react';
import GetData from "../GetData";


const api = axios.create({ baseURL: 'http://localhost:8081/api/v1/flight' })

export default class Arrival_Option extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            selectOption: "",
            resultOpt: []

        };
        this.componentDidUpdate.bind(this);
    }
    
    name = (selectOption) => {
        api.get('/'+selectOption+'/options')
        .then((res)=>{
            this.setState({resultOpt: res.data})
        })
    }
    componentDidUpdate(){

        if(this.state.selectOption != this.props.opt){
            
            this.setState({selectOption: this.props.opt})
            this.name(this.props.opt);
            // this.props.getDest()
        }
        // console.log(this.state.resultOpt)
        // console.log(this.state.resultOpt)
    }

    useComponentDidUpdate = e => {  
        this.props.getDest(e.target.value)
    }

    retrieveData = (destination, arrival) =>{
        console.log(destination);
        console.log(arrival);
    }


    render() {
        return (
            <div>
                <GetData />
                <select id="dpr" onChange={this.useComponentDidUpdate}>
                    <option value="none" >Select available arrival options</option>
                    {this.state.resultOpt.map((option) => (
                        <option value={option}>{option}</option>
                    ))}
                </select>
            </div>


        );
    }
}

