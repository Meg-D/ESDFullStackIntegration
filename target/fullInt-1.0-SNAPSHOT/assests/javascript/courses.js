console.log($);

function fillDetails() {
  //  GET request using fetch()
  fetch("https://jsonplaceholder.typicode.com/users")
    // Converting received data to JSON
    .then((response) => response.json())
    .then((json) => {
      // Create a variable to store HTML

      // Loop through each data and add a table row
      json.forEach((user) => {
          console.log(user);
        let td = `<tr>
        <th scope="row">${user.name}</th>
        <td>Professor Name</td>
        <td>Max Students</td>
        <td>Credits</td>
        <td>Term</td>
      </tr>`;

        // Display result
        $('#table-body').append(td)
      });
    });
}

fillDetails()