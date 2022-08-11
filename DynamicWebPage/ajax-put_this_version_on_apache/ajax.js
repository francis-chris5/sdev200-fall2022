

function XMLData(){
	let request = new XMLHttpRequest();
	request.open("GET", "http://172.20.229.121:8080/DynamicWebPage/get-data?format=xml", true);
	request.send();
	request.onreadystatechange = function(){
		if(request.readyState == 4 && request.status == 200){
			let data = request.responseXML;
			let payload = data.getElementsByTagName('person');
			//document.getElementById('xmlOutput').innerHTML = payload;
			let tableString = "<table border=\"1\"><tr><td>Name</td><td>Age</td><td>Home</td></tr>";
			for(let i = 0; i < payload.length; i++){
				tableString += "<tr><td>" + payload[i].childNodes[0].innerHTML + "</td><td>" + payload[i].childNodes[1].innerHTML + "</td><td>" + payload[i].childNodes[2].innerHTML + "</td></tr>";
			}
			tableString += "</table>";
			document.getElementById('xmlOutput').innerHTML = tableString;
		}
	}
}//end testString()


function jsonData(){
	let request = new XMLHttpRequest();
	request.open("GET", "http://172.20.229.121:8080/DynamicWebPage/get-data?format=json", true);
	request.send();
	request.onreadystatechange = function(){
		if(request.readyState == 4 && request.status == 200){
			let data= request.responseText;
			let collect = data.split('\n'); //put breaks in method that sends it
			let payload = Array();
				for(let i=0; i < collect.length-1; i++){
					payload[i] = JSON.parse(collect[i]);
				}
			let tableString = "<table border=\"1\"><tr><td>Name</td><td>Age</td><td>Home</td></tr>";
			for(let i = 0; i < payload.length; i++){
				tableString += "<tr><td>" + payload[i]['name'] + "</td><td>" + payload[i]['age'] + "</td><td>" + payload[i]['home'] + "</td></tr>";
			}
			tableString += "</table>";
			document.getElementById('jsonOutput').innerHTML = tableString;
		}
	}
}//end testString()

