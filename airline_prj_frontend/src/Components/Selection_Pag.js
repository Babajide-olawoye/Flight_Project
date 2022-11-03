import { Link } from "react-router-dom";

import { render } from '@testing-library/react';
import { Component, useState, useEffect } from 'react';
import axios from 'axios';
import Flight_Option from "./FlightOptions/Flight_Option";

const api = axios.create({ baseURL: 'http://localhost:8081/api/v1/flight' })
var random = [];

export default function Selection_Page(props) {
  // console.log(props.location.state);

  const [data, setData] = useState([]);

  useEffect(() => {
    api.get('/Seville/London')
      .then((response) => {
        // handle success
        setData(response.data)
        
      })

  }, []);


  return (
    <div className="create1">
      <h2>Please select a Flight</h2>

      {data.map(({ airline, price, fly_out_time }) => {
        return <Flight_Option airline={airline} price={price} flight={fly_out_time} />
      })}

      {console.log(random)}

      <button>
        <Link to="/Luggage" className="btn btn-primary">Continue</Link>
      </button>

    </div>
  );
}

