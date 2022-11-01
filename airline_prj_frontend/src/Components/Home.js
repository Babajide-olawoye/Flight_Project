import Date from "./Date";

export default function Home() {
  return (
    <div align= 'center'>
      <form>
        <div>
          <label>Departure from:</label>
        </div>
        <div>
          <input/>
        </div>
        <div>
          <label>Arriving at:</label>
        </div>
        <div>
          <select>
          <option value="none" selected disabled hidden>Select available arriaval options</option>
          </select>
        </div>
        <div>
          <Date/>
        </div>
        
       
      </form>

    </div>

  );
}

