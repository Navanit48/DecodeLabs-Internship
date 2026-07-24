// Navbar shadow while scrolling

window.addEventListener("scroll", () => {

    const navbar = document.querySelector(".navbar");

    if (window.scrollY > 30) {

        navbar.style.boxShadow = "0 10px 25px rgba(0,0,0,.3)";

    }

    else {

        navbar.style.boxShadow = "none";

    }

});

const cards = document.querySelectorAll(
    ".about-card,.skill-card,.project-card");

const observer = new IntersectionObserver(entries => {

    entries.forEach(entry => {

        if (entry.isIntersecting) {

            entry.target.classList.add("show");

        }

    });

});

cards.forEach(card => {

    observer.observe(card);

});