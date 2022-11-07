import React, { useState } from "react";

function Questionaire() {
  const [answer, setAnswer] = useState();

  return (
    <div>
      <div className="Component-header">
        <p>Question #1</p>
      </div>
      <div className="QuestionField">
        <p>How big is your company?</p>
      </div>
      <form>
        <div className="Form">
          <label className="RadioField">
            <input
              type="radio"
              value="0-10"
              checked={answer==="0-10"}
              onChange={(e) => {
                setAnswer(e.target.value);
              }}
            />
            0-10
          </label>
          <label className="RadioField">
            <input
              type="radio"
              value="10-100"
              checked={answer==="10-100"}
              onChange={(e) => {
                setAnswer(e.target.value);
              }}
            />
            10-100
          </label>
          <label className="RadioField">
            <input
              type="radio"
              value="+100"
              checked={answer==="+100"}
              onChange={(e) => {
                setAnswer(e.target.value);
              }}
            />
            +100
          </label>
        </div>
        <div>
          <input
            type="submit"
            value="CONTINUE"
            style={{
              backgroundColor: "#282c34",
              color: "#fff",
              fontSize: 20,
              borderRadius: 20,
              marginTop: 40,
              paddingRight: 20,
              paddingLeft: 20,
              paddingTop: 10,
              paddingBottom: 10,
              fontWeight: "bold",
            }}
          />
        </div>
      </form>
    </div>
  );
}
export default Questionaire;
