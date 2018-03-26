function changeType(){
	var type_body = document.getElementById("")
	var type_item = document.getElementsByClassName("about_me_type_item");
	for(var index=0;index<type_item.length;index++){
		type_item[index].style.backgroundColor="white";
	}
	event.srcElement.style.backgroundColor="rgb(213,197,161)";
}
