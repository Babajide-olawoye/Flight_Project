import { Link, useLocation } from "react-router-dom";

import { render } from '@testing-library/react';
import { Component, useState, useEffect } from 'react';
import axios from 'axios';
import Flight_Option from "./FlightOptions/Flight_Option";
import GetData from "./GetData";

const api = axios.create({ baseURL: 'http://localhost:8081/api/v1/flight' })
var random = [];

export default function Selection_Page(props) {
  // console.log(props.location.state);

  const [data, setData] = useState([]);
  const location = useLocation()
  const {departure} = location.state
  const {arrival} = location.state

  console.log(departure.counterRef.current)
  console.log(arrival.destinationRef.current)

  useEffect(() => {
    api.get('/' +departure.counterRef.current +'/' +arrival.destinationRef.current)
      .then((response) => {
        // handle success
        setData(response.data)
        
      })

  }, []);



  return (
    <div className="create1">

      <h2>Please select a Flight</h2>
      <h4>All flight from {departure.counterRef.current} to {arrival.destinationRef.current}</h4>

      {data.map(({ airline, price, fly_out_time }) => {
        return <Flight_Option airline={airline} price={price} flight={fly_out_time} />
      })}

      {console.log(random)}


      <div className="submit">
        <label id="date">Date 20-Nov-2022</label>
        <button>
        <Link to="/Luggage" className="btn btn-primary" state={{luggageType: data.airline}}>Continue</Link>
        </button>
      </div>


    </div>
  );
}

