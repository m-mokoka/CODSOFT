document.getElementById('subscription-form').addEventListener('submit', function(event) {
    var email = document.getElementById('email').value;
    var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email)){
        alert('Please enter a valid email address.');
        event.preventDefault();
    }
});
