export default function Selection_Page() {
    return (
      <div className="create1">
        <h2>Please select a Flight</h2>
        
        <label>Option 1</label>
        <div className="options">
          <div>
            <h3>Airline name</h3>
            <label>Ryanair</label>
          </div>
          <div>
            <h3>Price</h3>  
            <label>€120.00</label>
          </div>
          <div>
           <h3>Departure time</h3>  
            <label>12:20am</label>
          </div>
        </div> 
        
        <label>Option 2</label>
        <div className="options">
          <div>
            <h3>Airline name</h3>
            <label>Airbaltic</label>
          </div>
          <div>
            <h3>Price</h3>  
            <label>€166.00</label>
          </div>
          <div>
           <h3>Departure time</h3>  
            <label>19:55am</label>
          </div>
        </div> 
        
        <label>Option 3</label>
        <div className="options">
          <div>
          <h3>Airline name</h3>
            <label>Aer Lingus</label>
          </div>
          <div>
            <h3>Price</h3>  
            <label>€100.00</label>
          </div>
          <div>
           <h3>Departure time</h3>  
            <label>06:40am</label>
          </div>
        </div> 

        <button>Continue</button>

      </div>
    );
  }
  
  