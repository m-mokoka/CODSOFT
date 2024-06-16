import React from 'react';
import { Link } from 'react-router-dom';

function EmployerDashboard() {
  return (
    <div>
      <h1>Employer Dashboard</h1>
      <p>
        Welcome, [username]!
      </p>
      <ul>
        <li>
          <Link to="/employer/profile">Profile Management</Link>
        </li>
        <li>
          <Link to="/employer/jobpostings">Job Postings</Link>
        </li>
        <li>
          <Link to="/employer/applications">Job Applications</Link>
        </li>
      </ul>
    </div>
  );
}

export default EmployerDashboard;