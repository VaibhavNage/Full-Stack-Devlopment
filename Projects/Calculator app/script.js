function displayScreen(param)
{
    document.getElementById("result").value += param;
}

function clearScreen()
{
    document.getElementById("result").value = ""; 
}

function changeTheme()
{
    let dark = document.getElementById("dark-mode");
    let theme = document.getElementById("theme");

    if(theme.getAttribute("href") === "css/light.css")
    {
        theme.href = "css/dark.css";
        dark.innerHTML = "Light Mode ☀";
    }

    else
    {
        theme.href = "css/light.css";
        dark.innerHTML = "Dark Mode 🌙";
    }
}