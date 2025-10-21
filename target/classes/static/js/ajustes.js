document.addEventListener("DOMContentLoaded", () => {
  // DELETE 
  document.querySelector(".btn-danger").addEventListener("click", () => {
    if (confirm("¿Seguro que deseas eliminar esta cuenta?")) {
      alert("Cuenta eliminada (simulado).");
    }
  });

  // EDIT 
  document.querySelectorAll(".btn-outline-success").forEach(btn => {
    btn.addEventListener("click", () => {
      const label = btn.parentElement.querySelector(".fw-bold").textContent;
      const currentValue = btn.parentElement.querySelector(".text-muted")?.textContent || "";
      const nuevo = prompt(`Editar ${label}:`, currentValue);
      if (nuevo && btn.parentElement.querySelector(".text-muted")) {
        btn.parentElement.querySelector(".text-muted").textContent = nuevo;
      }
    });
  });

  //(Light / Dark Mode)
const dropdownButton = document.getElementById("dropdownMenuButton");
const darkModeOption = document.querySelector(".dropdown-item");

// Cargar tema guardado al iniciar
const savedTheme = localStorage.getItem("theme");

if (savedTheme === "dark") {
  document.body.classList.add("dark-mode");
  dropdownButton.innerText = "Dark Mode";     
  darkModeOption.innerText = "Light Mode"; 
} else {
  dropdownButton.innerText = "Light Mode";
  darkModeOption.innerText = "Dark Mode";
}

// Evento al hacer clic en la opción del menú
darkModeOption.addEventListener("click", (e) => {
  e.preventDefault();

  const isDarkNow = document.body.classList.toggle("dark-mode");

  if (isDarkNow) {
    dropdownButton.innerText = "Dark Mode";
    darkModeOption.innerText = "Light Mode";
    localStorage.setItem("theme", "dark");
  } else {
    dropdownButton.innerText = "Light Mode";
    darkModeOption.innerText = "Dark Mode";
    localStorage.setItem("theme", "light");
  }
});


    //  Estilos base para dark mode 
    const style = document.createElement("style");
    style.textContent = `
      .dark-mode {
        background-color: #121212 !important;
        color: #ffffff !important;
      }
      .dark-mode .card, 
      .dark-mode .tab-content {
        background-color: #1e1e1e !important;
      }
        .dark-mode .text-muted {
        color: #9eb495ff !important; 
      }
    `;
    document.head.appendChild(style);
  });