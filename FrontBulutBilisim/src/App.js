import React from 'react';
import './App.css';
import Add from './Add';
import Footer from './Footer';
import Header from './Header';

function App() {
  return (
    <div className="App">
      <Header/>
      <Add className="QPadding"/>
      <Footer />
    </div>
  );
}

export default App;
