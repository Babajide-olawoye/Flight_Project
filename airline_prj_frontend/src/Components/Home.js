import React, { useEffect } from "react";
import { Link } from "react-router-dom";
import useState from 'react-usestateref'

import axios from 'axios';
import Date from "./Date";
import Arrival_Option from "./FlightOptions/Arrival_Option";
//import './Styling/Hme.css'
const api = axios.create({ baseURL: 'http://localhost:8081/api/v1/flight' })


export default function Home() {
  const [departureChoice, setDepartureChoice, counterRef] = useState(" ");
  const [destination, setDestination, destinationRef] = useState(" ");
  const[startDate, setStartDate, startDateRef] = useState(' ');

  const getDepartDate = (event) =>{
    setStartDate(''+event.target.value)
    console.log(startDateRef)
  }
  
  const useComponentDidUpdate = e => {
      setDepartureChoice(e.target.value)
      console.log(counterRef.current)
  }

  const getDestination = (destination) =>{
    setDestination(destination);
    console.log(destination)
  }
  
    return (
    <div>  
        <div className="create">
          <h2>Please select a Flight</h2>
          <form>
            <label>Departure</label>
            <select id="dpt" onChange={useComponentDidUpdate}>
                    <option value="none" selected disabled hidden>Select...</option>
                    <option id="svl" value="Seville">Seville</option>
                    <option id="dbl" value="Dublin">Dublin</option>
                    <option id="lnd" value="London">London</option>
                    <option id="brl"value="Berlin">Berlin</option>
                    <option id="vln" value="Vilnius">Vilnius</option>
              </select>

            <label>Destinations</label>
            <Arrival_Option opt={counterRef.current} getDest={getDestination} id="sls"/>

            <label>Departure date</label>

          <input id="input1" placeholder="Departure Day" required onChange={getDepartDate} />

          {/* <input type="date" id="input1" placeholder="Departure Day" required /> */}
          <label>Return date</label>
          {/* <input type="date" ></input> */}
          <input id="input2" placeholder="Return Date" required />

          <Link to="/Flight" state={{departure: {counterRef}, arrival:{destinationRef}, departDate: {startDateRef}}} >
            <button id="continue">Continue</button>
          </Link>
        </form>      
      </div>
      
      <div className="create">
          <h5>Admin login</h5>
          <button className="admin">Login</button>
      </div>

    </div>

    );
  
}