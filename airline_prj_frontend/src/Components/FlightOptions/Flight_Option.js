import { render } from "@testing-library/react"
import { useState } from 'react';
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";
import ChosenFlight from "../ChosenFlight";



export default function Flight_Option(props) {

    const [popoverOpen, setPopoverOpen] = useState(false);

    const toggle = () => setPopoverOpen(!popoverOpen);

    // console.log(props.airline)
    return (
        <div className="white">
            <label>Option {props.count}</label>
            <div className="options" type="button" id="Popover1">
                <div className="details">
                    <h3>Airline name</h3>
                    <label id={props.airline}>{props.airline}</label>
                </div>
                <div className="details">
                    <h3>Price</h3>
                    <label id={props.price} >€{props.price}</label>
                </div>
                <div className="details">
                    <h3>Departure time</h3>
                    <label id={props.flight}>{props.flight}</label>
                </div>

            </div>

            <Popover
                placement="right"
                isOpen={popoverOpen}
                target="Popover1"
                toggle={toggle}
            >
                <PopoverHeader>How many passengers</PopoverHeader>
                <PopoverBody>
                    <ChosenFlight />
                </PopoverBody>
            </Popover>
        </div>

    )
}