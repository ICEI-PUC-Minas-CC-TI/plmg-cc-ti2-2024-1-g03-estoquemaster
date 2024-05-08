document.addEventListener("DOMContentLoaded", function () {
  const productForm = document.getElementById("product-form");
  const productList = document.getElementById("products");

  // Array para armazenar os produtos
  let products = [];

  // Função para renderizar a lista de produtos
  function renderProducts() {
    // Limpar a lista de produtos antes de renderizar novamente
    productList.innerHTML = "";

    // Adicionar cada produto à lista
    products.forEach(function (product, index) {
      const li = document.createElement("li");
      li.innerHTML = `
                <span>${product.name} - ${product.description} - ${product.code} - ${product.price} - ${product.quantity}</span>
                <button onclick="editProduct(${index})">Editar</button>
                <button onclick="deleteProduct(${index})">Excluir</button>
            `;
      productList.appendChild(li);
    });
  }

  // Função para adicionar um novo produto
  function addProduct(name, description, code, price, quantity) {
    const product = {
      name: name,
      description: description,
      code: code,
      price: price,
      quantity: quantity,
    };
    products.push(product);
    renderProducts();
    productForm.reset(); // Limpar o formulário após adicionar o produto
  }

  // Função para editar um produto
  window.editProduct = function (index) {
    const product = products[index];
    // Preencher o formulário com os detalhes do produto selecionado para edição
    document.getElementById("name").value = product.name;
    document.getElementById("description").value = product.description;
    document.getElementById("code").value = product.code;
    document.getElementById("price").value = product.price;
    document.getElementById("quantity").value = product.quantity;

    // Remover o produto da lista após editá-lo
    products.splice(index, 1);
    renderProducts();
  };

  // Função para excluir um produto
  window.deleteProduct = function (index) {
    products.splice(index, 1);
    renderProducts();
  };

  // Event listener para submissão do formulário de produto
  productForm.addEventListener("submit", function (event) {
    event.preventDefault(); // Impede o envio do formulário
    const name = document.getElementById("name").value;
    const description = document.getElementById("description").value;
    const code = document.getElementById("code").value;
    const price = parseFloat(document.getElementById("price").value);
    const quantity = parseInt(document.getElementById("quantity").value);
    addProduct(name, description, code, price, quantity);
  });
});

function selectImage() {
  document.getElementById('fileInput').click();
}

function changeImage() {
  document.getElementById('fileInput').click();
}

document.getElementById('fileInput').addEventListener('change', function(event) {
  const file = event.target.files[0];
  const reader = new FileReader();
  reader.onload = function(e) {
      const img = document.getElementById('image');
      img.src = e.target.result;
      document.getElementById('btnChange').style.display = 'block';
  };
  reader.readAsDataURL(file);
});
