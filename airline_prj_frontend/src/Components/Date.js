
import React, { Component } from 'react';
import DatePicker from 'react-datepicker';

import "react-datepicker/dist/react-datepicker.css";
// import 'bootstrap/dist/css/bootstrap.min.css';

export default function Date() {

    return (

        <div className="form-group">
            <DatePicker
                name="startDate"
                dateFormat="MM/dd/yyyy"
            />
            <button className="btn btn-primary">Show Date</button>
        </div>
    );
}  