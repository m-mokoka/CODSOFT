import React, { useState } from 'react';
import { Link } from 'react-router-dom';

function EmployerLogin() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    // implement login logic here
    // if successful, redirect to EmployerDashboard
  };

  return (
    <div>
      <h1>Employer Login</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Email:
          <input type="email" value={email} onChange={(event) => setEmail(event.target.value)} />
        </label>
        <br />
        <label>
          Password:
          <input type="password" value={password} onChange={(event) => setPassword(event.target.value)} />
        </label>
        <br />
        <button type="submit">Login</button>
      </form>
      <p>
        Don't have an account? <Link to="/employer/register">Register</Link>
      </p>
    </div>
  );
}

export default EmployerLogin;