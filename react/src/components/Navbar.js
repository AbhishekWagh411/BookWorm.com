import React from 'react';
import { Link,Outlet } from 'react-router-dom';

const Navbar = () => {
  return (
    <>
    <div class="container d-flex flex-wrap justify-content-center">
      <a href="/" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto link-body-emphasis text-decoration-none">
        <svg class="bi me-2" width="40" height="72"></svg>
        <span class="fs-4">BOOKWORM</span>
      </a>
      <form class="col-12 col-lg-auto mb-3 mb-lg-0" role="search">
        <input type="search" class="form-control" placeholder="Search..." aria-label="Search" />
      </form>
    </div>
    <nav class="py-2 bg-body-tertiary border-bottom">
    <div class="container d-flex flex-wrap">
      <ul class="nav me-auto">
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2 active" aria-current="page"><Link to="/Home">Home</Link></a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/Products">Products</Link></a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/LendingLibrary">Lending Library</Link></a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/Aboutus">About us</Link></a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/Contactus">Contact us</Link></a></li>
      </ul>
      <ul class="nav">
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/MyAccount">My Account</Link> </a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/MyShelf">My Shelf </Link></a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/Login">Login</Link></a></li>
        <li class="nav-item"><a href="#" class="nav-link link-body-emphasis px-2"><Link to="/Signup">Sign up</Link></a></li>
      </ul>
    </div>
  </nav>
  <Outlet></Outlet>
  </>
  )
}

export default Navbar
