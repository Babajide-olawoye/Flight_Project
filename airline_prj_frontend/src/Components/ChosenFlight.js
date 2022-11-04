import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";

export default function Chosen_Flight() {
  const [counter, setCounter] = useState(0);

  return (
    <div>
      <Button onClick={() => setCounter(counter + 1)}>+</Button>

      <span className="ml-3">{counter}</span>
    </div>
  );
};