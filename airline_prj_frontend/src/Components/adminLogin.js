import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";



export default function AdminLogin() {
    const adminPassword = "admin";
    const adminUsername = "admin";
    const [accessUsername, setAccessUsername] = useState(false);
    const [accessPassword, setAccessPassword] = useState(false);
    const navigate = useNavigate();


    const userInput_AdminId = (e) => {
        var inputAdmin = e.target.value;
        if (inputAdmin == adminUsername) {
            setAccessUsername(true)
        }
        else { setAccessUsername(false) }
    }

    const userInput_Password = (e) => {
        var inputPassword = e.target.value;
        if (inputPassword == adminPassword) {
            setAccessPassword(true)
        }
        else { setAccessPassword(false) }
    }



    const signIn = () => {
        if (accessUsername == true && accessPassword == true) {
            console.log("sign in");
            navigate('/Admin')
        }
        else{
            window.alert("Incorrect Username or Password...")
        }
    }

    return (
        <div>
            <div className="create">
                <h2>Admin login</h2>
                <form>
                    <label className="admin" >Admin Id: </label>
                    <input type="text" required onChange={userInput_AdminId}></input>
                    <br />
                    <label className="admin">Password: </label>
                    <input type="password" required onChange={userInput_Password}></input>
                    <button onClick={signIn}>Sign in</button>
                </form>
            </div>
        </div>
    );
}