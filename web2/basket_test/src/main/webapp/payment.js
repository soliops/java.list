function abc(nm,part,df){
	var ids = document.getElementById(nm);
	var eamoney = document.getElementById(df);
	var num = Number(eamoney.value.replace(",",""));
	var totals; 
	if(part=="up"){
		ids.value = Number(ids.value)+1; 
		totals = Number(ids.value) * num;
		document.getElementById("total0").innerText = totals.toLocaleString();
	}
	else{
		if(Number(ids.value) > 1){
		ids.value = Number(ids.value)-1;
		totals = Number(ids.value) * num;
		document.getElementById("total0").innerText = totals.toLocaleString();
		}
	}
	
	
}