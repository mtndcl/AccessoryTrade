
import React from "react"
import { useState, useEffect } from "react";



export  type Plate={
    id:number,
    name:string,
    price:number;

}

export default function Home() {
    const [plates, setPlates] = useState<Plate[]>();
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch(`http://localhost:8080/accessories/all`)
            .then((res) => res.json())
            .then((data) => setPlates(data))
            .catch((error) => console.log("An error occurred in Home page", error));
    }, []);
    return (
        <div>


            <div className="flex justify-center">

            </div>

            <h1 className="mb-4">Home Page</h1>

            <div className="grid grid-cols-3" >

                  <p>vv</p>
            </div>
        </div>
    );
}