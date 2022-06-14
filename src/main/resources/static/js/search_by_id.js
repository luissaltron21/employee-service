(function($) {
	$("#search").click(function() {
		id = $("#idEmp").val();
		if (id == "") {
			url = "http://localhost:8001/employee/"
		}
		else {
			url = "http://localhost:8001/employee/" + id;
		}
		try {
			$.get(url, function(response) {
				console.log(response);
				if (!Array.isArray(response))
					data = [response];
				else
					data = response;
				$("#employees").css("display", "block");

				if ($.fn.DataTable.isDataTable('#employees')) {
					$('#employees').DataTable().clear().rows.add(data).draw();
				}
				else {
					$('#employees').DataTable({
						data: data,
						columns: [
							{ "data": "id" },
							{ "data": "employee_name" },
							{ "data": "employee_salary" },
							{ "data": "employee_age" },
							{ "data": "profile_image" },
							{ "data": "anual_salary" }
						]
					});
				}


			}).fail(function(error) {
				Swal.fire({
					icon: 'error',
					title: 'Error',
					text: 'Something is wrong with the request, please try again!',
				})
			});
		}
		catch (error) {
			console.error(error);
		}

	});
})(jQuery);