import React from 'react'
import { useEffect, useState } from 'react'

export default function Products () {
  const [product, setProduct] = useState([]);
  useEffect(() =>{
    fetch("http://localhost:8080/api/products/getProducts")
    .then((res) => res.json())
    .then((result) => {
      setProduct(result);
    });
  }, []);
  return(
    <div>
    <h2>Products</h2>
    <table>
      {" "}
      <thead>
        <tr>
          <th>Name</th>
          <th>Author</th>
          <th>Base Price</th>
          <th>Sale Price</th>
        </tr>
      </thead>
      <tbody>
        {product.map((pro) => (
          <tr key={pro.product_id}>
            <td>{pro.product_name}</td>
            <td>{pro.product_author}</td>
            <td>{pro.product_baseprice}</td>
            <td>{pro.product_offerprice}</td>
          </tr>
        ))}
      </tbody>
    </table>
  </div>
  )
}

