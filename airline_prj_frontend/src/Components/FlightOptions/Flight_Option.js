import { render } from "@testing-library/react"

export default function Flight_Option(props) {

    console.log(props.airline)
    return (
        <div className="white">
            <label>Option </label>
            <div className="options">
                <div>
                    <h3>Airline name</h3>
                    <label>{props.airline}</label>
                </div>
                <div>
                    <h3>Price</h3>
                    <label>€{props.price}</label>
                </div>
                <div>
                    <h3>Departure time</h3>
                    <label>{props.flight}</label>
                </div>
            </div>
        </div>
    )
}