$(".lorl-nav a").click(function(){
		$(".lorl-nav a.active").removeClass("active");
		$(this).addClass("active");
		if ($(this).attr("href")==="#login") {
			$(".view.selected").removeClass("selected");
			$(".view.view-in").addClass("selected");
		}else if($(this).attr("href")==="#logup"){
			$(".view.selected").removeClass("selected");
			$(".view.view-up").addClass("selected");
		};
	});
