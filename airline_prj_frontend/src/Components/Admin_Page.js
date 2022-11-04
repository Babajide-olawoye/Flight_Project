import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";

export default function Admin_Page() {

  return (
    <div>
         <div className="create">
          <h2>Admin console</h2>
          <h4>The list of purchases</h4>
        

          <div className="options2">
            <label className="admin">Purchase Id -</label>
            <label className="admin">Customer name -</label>
            <label className="admin">Flight Destination -</label>
            <label className="admin">Amount paid -</label>
            <label className="admin">Purchase date - </label>
          </div>

          <div className="options2">
            <label className="admin">Purchase Id -</label>
            <label className="admin">Customer name -</label>
            <label className="admin">Flight Destination -</label>
            <label className="admin">Amount paid -</label>
            <label className="admin">Purchase date - </label>
          </div>

          <div className="submit">
                <button >Sign out</button>
                <label>Number of purchases made -</label>
            </div>


        </div>
    </div>
  );
};