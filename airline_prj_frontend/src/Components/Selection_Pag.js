export default function Selection_Page() {
    return (
      <div className="create1">
        <h2>Please select a Flight</h2>
        
        <label>Option 1</label>
        <div className="options">
          <div>
            <h3>Airline name</h3>
            <label id="lbl1">Ryanair</label>
          </div>
          <div>
            <h3>Price</h3>  
            <label id="prc1">€120.00</label>
          </div>
          <div>
           <h3>Departure time</h3>  
            <label id="tme1">12:20am</label>
          </div>
        </div> 
        
        <label>Option 2</label>
        <div className="options">
          <div>
            <h3>Airline name</h3>
            <label id="lbl2">Airbaltic</label>
          </div>
          <div>
            <h3>Price</h3>  
            <label id="prc2">€166.00</label>
          </div>
          <div>
           <h3>Departure time</h3>  
            <label id="tme2">19:55am</label>
          </div>
        </div> 
        
        <label>Option 3</label>
        <div className="options">
          <div>
          <h3>Airline name</h3>
            <label id="lbl3">Aer Lingus</label>
          </div>
          <div>
            <h3>Price</h3>  
            <label id="prc3">€100.00</label>
          </div>
          <div>
           <h3>Departure time</h3>  
            <label id="tme3">06:40am</label>
          </div>
        </div> 
        <div className="submit">
          <label id="date">Date 20-Nov-2022</label>
          <button>Continue</button>
        </div>
        

      </div>
    );
  }
  
  