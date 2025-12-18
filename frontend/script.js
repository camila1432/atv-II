function updateCartCount() {
  const cart = JSON.parse(localStorage.getItem("cart")) || [];

  const total = cart.reduce((sum, item) => {
    return sum + (item.quantity || 0);
  }, 0);

  const cartCountEl = document.getElementById("cart-count");

  if (cartCountEl) {
    cartCountEl.innerText = total;
    cartCountEl.style.display = total > 0 ? "inline-block" : "none";
  }
}
updateCartCount();

window.addEventListener("cart-updated", updateCartCount);

function updateCartCount() {
  const cart = JSON.parse(localStorage.getItem("cart")) || [];

  const total = cart.reduce((sum, item) => {
    return sum + (item.quantity || 0);
  }, 0);

  const cartCountEl = document.getElementById("cart-count");

  if (cartCountEl) {
    cartCountEl.innerText = total;
    cartCountEl.style.display = total > 0 ? "inline-block" : "none";
  }
}

updateCartCount();

window.addEventListener("cart-updated", updateCartCount);
