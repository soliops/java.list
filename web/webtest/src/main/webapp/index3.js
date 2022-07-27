let data;
function wck() {
	if (window.XMLHttpRequest) {
		return new XMLHttpRequest();
	}
}
function members() {
	if (data.readyState == XMLHttpRequest.DONE && data.status == 200) {
		member_list(data.response);
	}
	else if (data.status == 404) {
		error();
	}
}
data = wck();
data.onreadystatechange = members;
data.open("GET", "./index3.json", true);
data.send();


function member_list(jdata) {
	var j = JSON.parse(jdata);
	var total = j["members"].length;
	var tbody = document.getElementById("mblist");
//	var a = document.createElement("a");
//	a.href="";
	var tr,td,text;
	for (var i in j["members"]) {
		tr = document.createElement("tr");
		td = document.createElement("td");
		td.innerText = total;
		tr.append(td);
		//getAttribute : 속성값을 가져올때 (style,onclick,class....)
		Object.keys(j["members"][i]).forEach(function(a, b, c) {
			if(a=="id"){
			tr.setAttribute("onclick","java_get('"+j.members[i][a]+"')");				
			}
			td = document.createElement("td");
			if(a=="area"){
				a= "phone"
			}else if(a=="phone"){
				a="area"
			}
			text = document.createTextNode(j.members[i][a]);
			td.append(text);
			tr.append(td);
			console.log(j["members"][i][a]); //데이터 반복

		})
		tbody.append(tr);
		total--;
	}
}


function error() {
	alert("해당 파일을 로드할 수 없습니다.");
	return;
}

function java_get(mid){
	location.href='./first.do?mid='+mid;
}