export default function Information_Page() {
    return (
      <div className="create3">
        <h2>Please enter your information</h2>

        
          <label>First name</label>
          <input type="text" placeholder="First name" required/>
        

        
          <label>Surname</label>
          <input type="text" placeholder="Surname" required/>
       
        
       
          <label>Nationality</label>
          <input type="text" placeholder="Nationality" required/>
        
        
        
          <label>Passport/ID number</label>
          <input type="text" placeholder="Passport/ID number" required/>
        
       
          <label>Age</label>
          <input type="text" placeholder="Age" required/>
          <br/>

        <div className="submit">
          <label>Grand total: €200.00</label>
          <button>Click to purchase</button>
        </div>

      </div>
    );
  }
  
  