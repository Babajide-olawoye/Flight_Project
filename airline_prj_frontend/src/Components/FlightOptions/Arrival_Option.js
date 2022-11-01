import React from "react";

const sevilleOption = [
    { value: 'Dublin', label: 'Dublin' },
    { value: 'London', label: 'London' },
    { value: 'Berlin', label: 'Berlin' }
]
const DublinOption = [
    { value: 'Vilnius', label: 'Vilnius' },
    { value: 'London', label: 'London' },
    { value: 'Seville', label: 'Seville' }
]
const LondonOption = [
    { value: 'Dublin', label: 'Dublin' },
    { value: 'Seville', label: 'Seville' },
    { value: 'Vilnius', label: 'Vilnius' },
    { value: 'Berlin', label: 'Berlin' }
]
const BerlinOption = [
    { value: 'Vilnius', label: 'Vilnius' },
    { value: 'London', label: 'London' },
    { value: 'Seville', label: 'Seville' }
]
const VilniusOption = [
    { value: 'Berlin', label: 'Berlin' },
    { value: 'London', label: 'London' },
    { value: 'Dublin', label: 'Dublin' }
]

export default class Arrival_Option extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            selectOption: this.props.opt,
            resultOpt: []

        };
        this.componentDidUpdate.bind(this);
    }
    componentDidUpdate(){
        if (this.state.selectOption == "Seville") {
            this.setState({ resultOpt: sevilleOption });
        }
        console.log(this.props.opt)
    }


    render() {
        return (
            <div>
                <select>
                    <option value="none" >Select available arriaval options</option>
                    {this.state.resultOpt.map((option) => (
                        <option value={option.value}>{option.label}</option>
                    ))}
                </select>
            </div>


        );
    }
}

