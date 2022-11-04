import React, { useEffect, useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import AdminPage_Child from "./AdminPage_Child";
import axios from 'axios';
import { useNavigate } from "react-router-dom";



const api = axios.create({ baseURL: 'http://localhost:8082/api/v1/analytics' })

export default function Admin_Page() {

  const [data, setData] = useState([]);
  const navigate = useNavigate();


  useEffect(() => {
    api.get()
      .then((response) => {
        // handle success
        setData(response.data)

      })

  }, []);

  const signOut = (e) =>{
    e.preventDefault();
    navigate('/');
  }


  return (
    <div>
      <div className="create">
        <h2>Admin console</h2>
        <h4>The list of purchases</h4>

        {data.map(({ id, name, destination, price, purchaseDate }) => {
          return <AdminPage_Child purchadeId={id} customerName={name} destination={destination} pricePaid ={price} purchaseDate ={purchaseDate}/>
        })}


        

        <div className="submit">
          <button onClick={signOut}>Sign out</button>
          <label>Number of purchases made -</label>
        </div>


      </div>
    </div>
  );
};