import React from "react";

function Affinity() {
  return (
    <div className="App">
      <div className="Component-header">
        <p>Your Blockchain affinity is</p>
      </div>
      <div className="QuestionField" style={{fontSize:16}}>
        <p>Francisco Javier Márquez Lavado (fjaviermarquez@gmail.com)</p>
      </div>
      <div style={{justifyContent:'center', alignItems:'center', flexDirection:'column'}}>
        <div style={{width:200, backgroundColor:'#abc', justifyContent:'center', alignItems:'center', flex:1}}>
            <div style={{display:'flex'}}>
                <p>- Data:</p>
                <p>60%</p>
            </div>
            <div style={{display:'flex'}}>
                <p>- Logistics:</p>
                <p>5%</p>
            </div>
            <div style={{display:'flex'}}>
                <p>- Identity validation:</p>
                <p>15%</p>
            </div>
            <div style={{display:'flex'}}>
                <p>- Fidelization:</p>
                <p>15%</p>
            </div>
            <div style={{display:'flex'}}>
                <p>- Payment:</p>
                <p>5%</p>
            </div>
        </div>
      </div>
    </div>
  );
}
export default Affinity;
