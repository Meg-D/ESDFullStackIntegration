function submitFunction() {
  // Getting values
  let name = document.getElementById("name").value;
  let professor = document.getElementById("professor").value;
  let specialization = document.getElementById("specialization").value;
  let credit = document.getElementById("credit").value;
  let term = document.getElementById("term").value;
  let no_of_students = document.getElementById("no_of_students").value;

  let obj = {
    name: name,
    professor: professor,
    specialization: specialization,
    credit: credit,
    term: term,
    no_of_students: no_of_students,
  };

  // Send to Backend
  fetch("http://localhost:8087/fullInt_war/api/course/add", {
    // Adding method type
    method: "POST",
    // Adding body or contents to send
    body: JSON.stringify(obj),
    // Adding headers to the request
    headers: {
      "Content-type": "application/json; charset=UTF-8",
    },
  })
    // Converting to JSON
    .then((response) => response.json())

    // Displaying results to console
    .then((json) => {
      console.log(json)
      
      // Popup
      Swal.fire({
        title: 'Submitted!',
        text: 'Details has been submitted',
        icon: 'success',
        confirmButtonText: 'Okay'
      })
    });


}
