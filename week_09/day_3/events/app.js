// changing box colour
const button = document.querySelector("#btn");

const box = document.querySelector("#box");

const handleButtonClick = () => {
    box.style.backgroundColor = "blue";
}

button.addEventListener("click", handleButtonClick);


//displaying user message
const input = document.querySelector("#user-input");
const message = document.querySelector("#user-message");

input.addEventListener("input", (event) => {
    message.innerText = event.target.value;
})

// adding from form

const list = document.querySelector("ul");
const form = document.querySelector("#new-student-form");

form.addEventListener("submit", (event) => {
    event.preventDefault();
    const newListItem = document.createElement("li");
    newListItem.innerText = event.target["new-student"].value;
    list.appendChild(newListItem);
});