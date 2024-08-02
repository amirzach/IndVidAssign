const links = document.querySelectorAll('.timetable a');
links.forEach(link => {
    link.addEventListener('click', (event) => {
        event.preventDefault(); 
        const targetId = link.getAttribute('href').substring(1); 
        const targetElement = document.getElementById(targetId); 
        targetElement.classList.add('highlight'); 
        targetElement.scrollIntoView({ behavior: 'smooth', block: 'start' }); 
    });
});
