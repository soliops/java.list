var url = window.location.search;
var url_split= url.split("&");
var pro_sel=[];
var sel_fin=[];
var choice=[];
	for(var w=0;w<url_split.length;w++){
		if(w==0){
			pro_sel[w]=url_split[w].split("?")[1];
		}else{			
		pro_sel[w]=url_split[w];
		}
// 		console.log(pro_sel);
			sel_fin[w]=pro_sel[w].split("=");
	}
//	console.log(sel_fin);
	
	var c=0;
	var ct=0;
	for(c;c<sel_fin.length;c++){
		if(sel_fin[c][1]==1){
		choice[ct]=sel_fin[c][0];
		ct++;
		}
		
	}
		var bp = basket_product["flat_product"];
		console.log(bp);
		for(var v in bp){
			for(var vv in bp[v]){				
				console.log(bp[v][vv]);		
						
			}
//			Object.keys(bp[v]).forEach(function(a,b,c){
//			});
		}
		
		console.log(bp[1]["product_img"]);								
	
function num_check(cr,check,pm,tt){
	var cbs = document.getElementById(cr);
	console.log(cbs.name);
	var pm = document.getElementById(pm);
	var num = Number(pm.value.replace(",",""));
	var total_money; 
	if(check=="up"){
		cbs.value = Number(cbs.value)+1; 
		if(cbs.name=="cb0"||cbs.name=="cb3"){
		total_money = Number(cbs.value) * num *0.9;						
		}else{
		total_money = Number(cbs.value) * num;			
		}
		
		document.getElementById(tt).innerText = total_money.toLocaleString();
	}
	else{
		if(Number(cbs.value) > 1){
		cbs.value = Number(cbs.value)-1;
		if(cbs.name=="cb0"||cbs.name=="cb3"){
		total_money = Number(cbs.value) * num *0.9;						
		}else{
		total_money = Number(cbs.value) * num;			
		}
		document.getElementById(tt).innerText = total_money.toLocaleString();
		}
	}
		
}

//var totalmoney1 = document.getElementById("totalmoney1");
//var mny = document.getElementById("total1")
//console.log(mny);
//var final_money=0;
//for(var ft=0;ft<choice.length;ft++){
//	final_money+= Number(mny);
//}
////totalmoney1.innerText = final_money;
var money=100;
 function ock(){
	location.href = "http://192.168.100.209:8080/basket/money.html?total="+money;
}