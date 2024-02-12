import React from "react";
import "./Signup.css";
import { useState } from "react";

// import user_icon from "../assets/person.png";
import email_icon from "../assets/email.png";
import password_icon from "../assets/password.png";

export const Signup = () => {
  const [loginDetails, setLogInDetails] = useState({});
  const handleChange = (event) => {
    setLogInDetails((values) => ({ ...values, [event.target.name]: event.target.value }));
  };
  const handleSubmit = (event) => {
    event.preventDefault();
    let details = JSON.stringify(loginDetails);
    // document.write("Hello World");
    fetch("http://localhost:8080/api/Login", {
      method: "POST",
      headers: { "Content-type": "application/json" },
      body: details,
    }).then((response)=>{
      console.log(response);
     return response.json();
    })
  .then((result) => {
    console.log("Response:", result);
    console.log("Type of response:", typeof result);
    if (result) {
        console.log("Login successful!");
        alert("Login Success!!"); //redirect Home page here
    } else {
        console.log("Login failed!");
        alert("Login Failed!!");
    }
});
    // navigate("");
  };
  return (
    <div className="signup">
      <div className = "header">
      <h1 className ="text">LOGIN</h1>
      <form className="inputs" onSubmit={handleSubmit}>
        {/* <img src={user_icon} alt="" />
        <input className="input"type="text" placeholder="Name"/> */}
        <img src={email_icon} alt="" />
        <input className="input"type="email" name="email" placeholder= "Email Id"onChange={handleChange}/>
        <img src={password_icon} alt="" />
        <input className="input" type="password" name="password" placeholder= "Password"onChange={handleChange}/>
        <br/>
        <input type="submit" value="LogIn" className="submit" />
        <br/>
        <input type="submit" value="SignUp" className="submit" />
       
      </form>
    </div>
    </div>
  );
};
