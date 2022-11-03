import React, { useEffect } from "react";
import { Link } from "react-router-dom";
import useState from 'react-usestateref'

import axios from 'axios';
import Date from "./Date";


export default function GetData(props) {
  var destination = props.destData
  var arrival = props.arrivalData
  console.log(destination)
  

  if ('data' in props) {
    props.data(destination, arrival)
    
  }

}