document.addEventListener('DOMContentLoaded', function() {
    const display = document.getElementById('display');
    const buttons = Array.from(document.getElementsByClassName('button'));
    let currentInput = '';
    
    buttons.forEach(button => {
        button.addEventListener('click', () => {
            const value = button.getAttribute('data-value');

            if (button.id === 'clear') {
                currentInput = '';
                display.innerText = '0';
            } else if (button.id === 'backspace') {
                currentInput = currentInput.slice(0, -1);
                display.innerText = currentInput || '0';
            } else if (button.id === 'equals') {
                try {
                    currentInput = String(eval(currentInput.replace('÷', '/').replace('×', '*')));
                } catch {
                    currentInput = 'Error';
                }
                display.innerText = currentInput;
            } else {
                currentInput += value;
                display.innerText = currentInput;
            }
        });
    });
});
