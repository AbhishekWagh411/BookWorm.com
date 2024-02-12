import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import 'bootstrap/dist/css/bootstrap.css';
import Home from './components/home/Home';
import Products from './components/product/Products';
import LendingLibrary from './components/lendinglibrary/LendingLibrary';
import { BrowserRouter,Route,Routes } from 'react-router-dom';
import Aboutus from './components/aboutus/Aboutus';
import Contactus from './components/contactus/Contactus';
import { Signup } from './components/signup/Signup';
import reportWebVitals from './reportWebVitals';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
  <Routes>
    <Route path="/" element = {<App />}>
      <Route path="/" element = {<Home />}/>
      <Route path="Home" element = {<Home />}/>
      <Route path="Products" element = {<Products />}/>
      <Route path="LendingLibrary" element = {<LendingLibrary />}/>
      <Route path="Aboutus" element = {<Aboutus />}/>
      <Route path="Contactus" element = {<Contactus />}/>
    </Route>
    <Route path="Signup" element = {<Signup />}/>
  </Routes>
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
