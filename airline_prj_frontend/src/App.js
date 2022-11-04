import logo from './logo.svg';
import './App.css';
import React from 'react'
import { Route, BrowserRouter, Routes } from 'react-router-dom';
import Home from './Components/Home';
import Layout from './Components/Layout';
import Information_Page from './Components/Infomation_Page'
import Luggage_Selection_Pg from './Components/Luggage_Selection_Pg'
import Selection_Pag from './Components/Selection_Pag'
import Payment_Getaway_Page from './Components/Payment_Getaway_Page';
import Admin_Page from './Components/Admin_Page';


function App() {
  return(
        <Routes>
          <Route path="/">
            <Route index element={<Home />} />
            <Route path="UserInfo" element={<Information_Page />} />
            <Route path="Luggage" element={<Luggage_Selection_Pg />} />
            <Route path="Flight" element={<Selection_Pag />} />
            <Route path="Payment" element={<Payment_Getaway_Page />} />
            <Route path="Admin" element={<Admin_Page />} />
          </Route>
        </Routes>
    );
}

export default App;
