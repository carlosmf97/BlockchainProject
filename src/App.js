import logo from "./logo.svg";
import "./App.css";
import UserDataForm from "./components/UserDataForm";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Questionaire from "./components/Questionaire";
import Affinity from "./components/Affinity";

function App() {
  return (
    <div className="App">
      <div className="App-header">
        <p>Do you need Blockchain?</p>
      </div>
      <BrowserRouter>
        <Routes path="/">
          <Route index element={<Affinity />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
