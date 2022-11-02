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
            <select id="dpt" onChange={this.handleChange}>
                  <option value="none" selected disabled hidden>Select...</option>
                  <option id="svl" value="Seville">Seville</option>
                  <option id="dbl" value="Dublin">Dublin</option>
                  <option id="lnd" value="London">London</option>
                  <option id="brl"value="Berlin">Berlin</option>
                  <option id="vln" value="Vilnius">Vilnius</option>
            </select>

            <label>Destinations</label>
            <select id="dst" onChange={this.handleChange}>
                  <option value="none" selected disabled hidden>Select...</option>
                  <option id="svl1" value="Seville">Seville</option>
                  <option id="dbl1" value="Dublin">Dublin</option>
                  <option id="lnd1" value="London">London</option>
                  <option id="brl1" value="Berlin">Berlin</option>
                  <option id="vln1" value="Vilnius">Vilnius</option>
            </select>

            <label>Departure date</label>
            {/* <input type="date" ></input> */}
            <input id="input1" placeholder="Departure Day" required/>
            <label>Return date</label>
            {/* <input type="date" ></input> */}
            <input id="input2" placeholder="Return Date" required/>
            

            <button id="continue">Continue</button>
      </form>
    </div>

    );
  }
}