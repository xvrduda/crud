document.getElementById("viagemForm").addEventListener("submit", function(event) {
    event.preventDefault();
  
    var ida = document.getElementById("ida").value;
    var volta = document.getElementById("volta").value;
    var hora = document.getElementById("hora").value;
    
    alert("Viagem confirmada!\n\nData de Ida: " + ida + "\nData de Volta: " + volta + "\nHorário da Viagem: " + hora);
  });

  // function buscarEndereco() {
  //   var cep = document.getElementById("cep").value;
    
  //   // Fazer uma requisição para API de CEP para obter os dados do endereço
  //   // Exemplo de requisição usando a API ViaCEP
  //   fetch(`https://viacep.com.br/ws/${cep}/json/`)
  //     .then(response => response.json())
  //     .then(data => preencherEndereco(data))
  //     .catch(error => console.log(error));
  // }
  
  // function preencherEndereco(data) {
  //   if (data.erro) {
  //     alert("CEP não encontrado. Por favor, verifique o CEP digitado.");
  //   } else {
  //     document.getElementById("endereco").value = data.logradouro;
  //     document.getElementById("cidade").value = data.localidade;
  //     document.getElementById("estado").value = data.uf;
  //   }
  // }
  
  // document.querySelector('form').addEventListener('submit', function(event) {
  //   event.preventDefault();
  
  //   var ida = document.getElementById("ida").value;
  //   var volta = document.getElementById("volta").value;
  //   var hora = document.getElementById("hora").value;
  //   var endereco = document.getElementById("endereco").value;
  //   var cidade = document.getElementById("cidade").value;
  //   var estado = document.getElementById("estado").value;
  
  //   alert("Viagem confirmada!\n\nData de Ida: " + ida + "\nData de Volta: " + volta + "\nHorário da Viagem")