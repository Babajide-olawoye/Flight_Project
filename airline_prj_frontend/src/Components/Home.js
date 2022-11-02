import React from "react";
import Date from "./Date";
import Arrival_Option from "./FlightOptions/Arrival_Option";
//import './Styling/Hme.css'


export default class Home extends React.Component{
  constructor(){
    super();
    this.state = {
      departureChoice: ""
    }
    this.componentDidUpdate.bind(this);
  }
  componentDidUpdate = e => {
    this.setState({departureChoice: e.target.value})
    console.log("From home "+this.state.departureChoice)
  }

  render() {
    return (
      <div className="create">
          <h2>Please select a Flight</h2>
          <form>
          <label>Departure</label>
            <select onChange={this.handleChange}>
                  <option value="none" selected disabled hidden>Select...</option>
                  <option value="Seville">Seville</option>
                  <option value="Dublin">Dublin</option>
                  <option value="London">London</option>
                  <option value="Berlin">Berlin</option>
                  <option value="Vilnius">Vilnius</option>
            </select>

            <label>Destinations</label>
            <select onChange={this.handleChange}>
                  <option value="none" selected disabled hidden>Select...</option>
                  <option value="Seville">Seville</option>
                  <option value="Dublin">Dublin</option>
                  <option value="London">London</option>
                  <option value="Berlin">Berlin</option>
                  <option value="Vilnius">Vilnius</option>
            </select>

            <label>Departure date</label>
            <input type="date" ></input>
            <label>Return date</label>
            <input type="date" ></input>

            <button>Continue</button>
      </form>
    </div>

    );
  }
}