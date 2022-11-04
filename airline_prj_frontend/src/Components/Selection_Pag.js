import { Link, useLocation } from "react-router-dom";

import { render } from '@testing-library/react';
import { Component, useState, useEffect } from 'react';
import axios from 'axios';
import Flight_Option from "./FlightOptions/Flight_Option";

const api = axios.create({ baseURL: 'http://localhost:8081/api/v1/flight' })
var random = [];

export default function Selection_Page(props) {
  // console.log(props.location.state);

  const [data, setData] = useState([]);
  const location = useLocation()
  const { departure } = location.state
  const { arrival } = location.state
  const { departDate } = location.state
  const [currentPrice, setCurrentPrice] = useState(0);
  let count = 1;

  let price = 0;

  useEffect(() => {
    api.get('/' + departure.counterRef.current + '/' + arrival.destinationRef.current)
      .then((response) => {
        // handle success
        setData(response.data)

      })

  }, []);

  const getPriceFromChosenFlight = (currentPrice) => {
    console.log(currentPrice)
    setCurrentPrice(currentPrice)
  }


  return (
    <div className="create1">

      <h2>Please select a Flight</h2>
      <h4>All flight from {departure.counterRef.current} to {arrival.destinationRef.current}</h4>

      {data.map(({ airline, price, fly_out_time }) => {

        return <Flight_Option getSubPrice={getPriceFromChosenFlight} airline={airline} price={price} flight={fly_out_time} count={count++} />;

      })}




      <div className="submit">
        <label id="date">Date selected: {departDate.startDateRef.current}</label>
        <button>
          <Link to="/Luggage"
            state={{
              destination: arrival.destinationRef.current,
              departDate: departDate.startDateRef.current,
              subTotal: currentPrice
            }}
          >Continue</Link>
        </button>
      </div>


    </div>
  );
}

