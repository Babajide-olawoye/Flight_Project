import { Link, useLocation } from "react-router-dom";

export default function Luggage_Selection_Pg() {


  const location = useLocation()
  const { destination } = location.state
  const { departDate } = location.state
  const { subTotal } = location.state

  console.log(subTotal)
  return (
    <div className="create1">
      <h2>Would you like to add luggage to your flight?</h2>

      <div className="options1">
        <h1 id="luggage">20Kg bag +€20,00 </h1>
      </div>






      <Link className="nolg" to="/UserInfo"
        state={{
          destination: destination,
          purchaseDate: departDate,
          totalPrice: subTotal+20
        }}
      >
        <button className="yes" id="yesBtn">Add Luggage</button>
      </Link>
      <br />
      <Link to="/UserInfo"
        state={{
          destination: destination,
          purchaseDate: departDate,
          totalPrice: subTotal
        }}
      >
        <button className="no" id="noBtn">No, continue without luggage </button>
      </Link>

    </div>

  );
}

