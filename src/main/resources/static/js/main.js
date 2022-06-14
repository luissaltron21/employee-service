(function($) {

	"use strict";

	$('nav .dropdown').hover(function() {
		var $this = $(this);
		$this.addClass('show');
		$this.find('> a').attr('aria-expanded', true);
		$this.find('.dropdown-menu').addClass('show');
	}, function() {
		var $this = $(this);
		$this.removeClass('show');
		$this.find('> a').attr('aria-expanded', false);
		$this.find('.dropdown-menu').removeClass('show');
	});
	let url = "http://localhost:8001/employee";
	$.get(url, function(response) {
		$('#employees').DataTable({
			data: response,
			columns: [
				{ "data": "id" },
				{ "data": "employee_name" },
				{ "data": "employee_salary" },
				{ "data": "employee_age" },
				{ "data": "profile_image" },
				{ "data": "anual_salary" }
			]
		});
	}).fail(function(error) {
		Swal.fire({
			icon: 'error',
			title: 'Error',
			text: 'Something is wrong with the request, please try again!',
		})
	});
	/*
	$('#employees').DataTable({
		"ajax": {
			"url": "http://localhost:8080/employee",
			"dataSrc": ""
		},
		columns: [
			{ "data": "id" },
			{ "data": "employee_name" },
			{ "data": "employee_salary" },
			{ "data": "employee_age" },
			{ "data": "profile_image" },
			{ "data": "anual_salary" }
		]
	});*/
})(jQuery);
