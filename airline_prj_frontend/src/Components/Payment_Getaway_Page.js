import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import logo from '../payment.png'
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";

export default function Payment_Getaway_Page() {

  return (
    <div>
        <div className="create">
          <h2>Pay Invoice</h2>
          <img src={logo} alt="Logo" />

          <div className="options2">
            <label>Payment amount</label>
            <h2>€500.00</h2>
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
                  <button >Click to purchase</button>
            </div>

          </div>

        </div>
    </div>
  );
};