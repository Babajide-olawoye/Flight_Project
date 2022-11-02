import React from "react";
import Date from "./Date";
import Arrival_Option from "./FlightOptions/Arrival_Option";
import './Styling/Hme.css'


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
      <div className='home'>
        <form className="form">
          <div className="form__description">
            <label>Departure from:</label>
          </div>
          <div>
            <select onChange={this.handleChange}>
              <option value="none" selected disabled hidden>Select available arrival options</option>
              <option value="Seville">Seville</option>
              <option value="Dublin">Dublin</option>
              <option value="London">London</option>
              <option value="Berlin">Berlin</option>
              <option value="Vilnius">Vilnius</option>

            </select>
          </div>
          <div className="form__description">
            <label>Arriving at:</label>
          </div>
          <div>
            <Arrival_Option opt={this.state.departureChoice} />
          </div>
          <div>

          </div>

        </form>

      </div>

    );
  }
}