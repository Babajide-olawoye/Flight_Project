import { render } from "@testing-library/react"
import useState from 'react-usestateref'
import { Button, Popover, PopoverHeader, PopoverBody } from "reactstrap";
import ChosenFlight from "../ChosenFlight";



export default function Flight_Option(props) {
    const [counter, setCounter, counterRef] = useState(0);
    const [popoverOpen, setPopoverOpen] = useState(false);

    const toggle = () => setPopoverOpen(!popoverOpen);

    const incrementCount = () =>{
        setCounter(counter+1);
        
    }

    // console.log(props.airline)
    return (
        <div className="white">
            <label>Option {props.count}</label>
            <div className="options" type="button" id={"Popover" +props.count}>
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
                placement="bottom"
                isOpen={popoverOpen}
                target={"Popover"+props.count}
                toggle={toggle}
            >
                <PopoverHeader>How many passengers</PopoverHeader>
                <PopoverBody>
                    <ChosenFlight/>
                </PopoverBody>
            </Popover>
        </div>

    )
}