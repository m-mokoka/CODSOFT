import React from 'react';
import { Link } from 'react-router-dom';

function Home() {
  return (
    <div>
      <h1>Welcome to our Job Board!</h1>
      <p>
        Are you a job seeker or an employer?
      </p>
      <button>
        <Link to="/jobseeker/login">Job Seeker</Link>
      </button>
      <button>
        <Link to="/employer/login">Employer</Link>
      </button>
    </div>
  );
}

export default Home;