import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";

export default function Chosen_Flight(props) {
  const [counter, setCounter] = useState(0);
  const [currentPrice, setCurrentPrice] =useState(0)
  
  props.getPrice(props.price *counter)
  
  // console.log();

  return (
    <div>
      <Button onClick={() => setCounter(counter - 1)}>-</Button>
      <Button onClick={() => setCounter(counter + 1)}>+</Button>

      <p textAlign='right' >{counter}</p>
    </div>
  );
};