import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";

export default function AdminPage_Child(props) {

    return (
        <div>

            <div className="options2">
                <label className="admin">Purchase Id: {props.purchadeId}</label>
                <label className="admin">Customer name: {props.customerName}</label>
                <label className="admin">Flight Destination: {props.destination}</label>
                <label className="admin">Amount paid: {props.pricePaid}</label>
                <label className="admin">Purchase date: {props.purchaseDate}</label>
            </div>
        </div>
    )
}