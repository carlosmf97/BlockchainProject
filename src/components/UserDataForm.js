import React from "react";

function UserDataForm() {
  return (
    <div>
      <form>
        <div className="Component-header">
          <p>Enter your data</p>
        </div>
        <div className="Form">
          <div className="InputField">
            <p>Name: </p>
            <input type="text" />
          </div>
          <div>
            <p>Email: </p>
            <input type="email" />
          </div>
        </div>
        <div>
          <input
            type="submit"
            value="START"
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
export default UserDataForm;
