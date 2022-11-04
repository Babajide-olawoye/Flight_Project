import axios from 'axios';
import { Component } from 'react';
import { Link, useLocation } from "react-router-dom";
import useState from 'react-usestateref'



const api = axios.create({ baseURL: 'http://localhost:8082/api/v1/analytics' })





export default function Information_Page() {

  const [firstName, setFirstName, firstNameRef] = useState(" ");
  const [lastName, setLastName, lastNameRef] = useState(" ");
  const [passportNum, setPassportNum, passportNumRef] = useState(' ');

  const location = useLocation()
  const { destination } = location.state
  const { purchaseDate } = location.state
  const { totalPrice } = location.state

  
  var FormData = require('form-data');
  var data = new FormData();
  data.append('name', firstNameRef.current+' '+lastNameRef.current);
  data.append('passportNo', passportNumRef.current);
  data.append('destination', destination);
  data.append('price', totalPrice);
  data.append('purchaseDate', purchaseDate);

  console.log(totalPrice)

  //Handlers for inputs
  const onChangeFirstName = (e) => {
    setFirstName(e.target.value)
    
  }
  const onChangeLastName = (e) => {
    setLastName(e.target.value)
    console.log(lastNameRef)
  }

  const onChangePassNum = (e) => {
    setPassportNum(e.target.value)
    console.log(passportNumRef)
  }



  var config = {
    method: 'post',
    url: 'http://localhost:8082/api/v1/analytics/userInfo',

    data: data
  };

  const onClickEventHandler = () => {
    axios(config)
      .then((response) => {
        // handle success
        console.log(response.status)
      })

  }

  return (
    <div className="create3">
      <h2>Please enter your information</h2>


      <label>First name</label>
      <input type="text" onChange={onChangeFirstName} placeholder="First name" required />

      <label>Surname</label>
      <input type="text" onChange={onChangeLastName} placeholder="Surname" required />

      <label>Nationality</label>
      <input type="text" placeholder="Nationality" required />

      <label>Passport/ID number</label>
      <input type="text" onChange={onChangePassNum} placeholder="Passport/ID number" required />

      <label>Age</label>
      <input type="text" placeholder="Age" required />
      <br />

      <div className="submit">
        <label>Grand total: €{totalPrice}</label>
        <button onClick={onClickEventHandler}>Click to purchase</button>
      </div>

    </div>
  );
}

