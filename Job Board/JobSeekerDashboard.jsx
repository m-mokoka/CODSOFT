import React from 'react';
import { Link } from 'react-router-dom';

function JobSeekerDashboard() {
  return (
    <div>
      <h1>Job Seeker Dashboard</h1>
      <p>
        Welcome, [username]!
      </p>
      <ul>
        <li>
          <Link to="/jobseeker/profile">Profile Management</Link>
        </li>
        <li>
          <Link to="/jobseeker/jobsearch">Job Search</Link>
        </li>
        <li>
          <Link to="/jobseeker/applications">Job Applications</Link>
        </li>
      </ul>
    </div>
  );
}

export default JobSeekerDashboard;