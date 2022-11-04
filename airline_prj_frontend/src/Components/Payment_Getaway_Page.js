import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import logo from '../payment.png'
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";
import { useLocation, useNavigate } from "react-router-dom";

export default function Payment_Getaway_Page() {

  const location = useLocation()
  const { totalPrice } = location.state
  const navigate = useNavigate();

  const onSubmit = (e) =>{
    e.preventDefault()
    window.alert("Payment successful")
    navigate('/');

  }

  return (
    <div>
      <div className="create">
        <h2>Pay Invoice</h2>
        <img src={logo} alt="Logo" />

        <div className="options2">
          <label>Payment amount</label>
          <h2>€{totalPrice}</h2>

            <label>Name on card</label>
            <input id="" placeholder="Name on card" required />
            <label>Card number</label>
            <input id="" placeholder="Card number" required />
            <label>Expiry date</label>
            <input id="" placeholder="Expiry code" required />
            <label>Security code</label>
            <input id="" placeholder="Security code" required />
            <label>ZIP/Postal code</label>
            <input id="" placeholder="ZIP/Postal code" required />


            <div className="submit">
              <button onClick={onSubmit}>Click to purchase</button>

            </div>

        </div>

      </div>
    </div>
  );
};