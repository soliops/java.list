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
		console.log(choice);
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
	//1인것만 체크해서 div를 생성
//		console.log(sec_span);	
//	var f=0;
//	do{
//		var views = document.getElementById("view");
////		var view = document.createElement("div");
////		view.className = "view";
//		var viewul = document.createElement("ul");
//		viewul.className = "viewul";
//		var viewli0 = document.createElement("li");
//		viewli0.Name = viewli0;
//		var viewli0_label = document.createElement("label");
//		var viewli0_img = document.createElement("img");
//		viewli0_img.src = bp[f]["product_img"];
//		var viewli0_ol = document.createElement("ol");		
//		var viewli0_li0 = document.createElement("li");	
//		viewli0_li0.innerText = "상품명";		
//		var viewli0_li1 = document.createElement("li");		
//		viewli0_li1.innerText = "색깔";		
//		var viewli0_li2 = document.createElement("li");		
//		viewli0_li2.innerText = "사이즈";				
//		var viewli1 = document.createElement("li");
//		viewli1.Name = viewli1;
//		var viewli1_div = document.createElement("div");
//		viewli1_div.className="countbox";
//		var viewli1_div_input = document.createElement("input");
//		viewli1_div_input.type = "text";
//		viewli1_div_input.Name ="ea"+f;
//		viewli1_div_input.id ="ea"+f;
//		viewli1_div_input.className = "ea"+f;
//		viewli1_div_input.value=f;
//		viewli1_div_input.readOnly;
//		var viewli1_div_span0 = document.createElement("span");
//		viewli1_div_span0.className ="up";
//		viewli1_div_span0.onclick="numcheck(ea"+f+",up,pay_money"+f+");";
//		var viewli1_div_span1 = document.createElement("span");
//		viewli1_div_span1.className ="down";
//		viewli1_div_span1.onclick="numcheck('ea+f','down','pay_money+f');";						
//		var viewli2 = document.createElement("li");
//		viewli2.Name = viewli2;
//		var viewli2_input = document.createElement("input");
//		viewli2_input.type = "text";
//		viewli2_input.Name = "p_money"+f;
//		viewli2_input.id = "p_money"+f;
//		viewli2_input.className = "money";
//		viewli2_input.value = bp[f]["product_money"];
//		viewli2_input.innerText="원";
//		var viewli3 = document.createElement("li");
//		viewli3.Name = viewli3;
//		var viewli4 = document.createElement("li");
//		viewli4.Name = viewli4;
//		viewli4.id = "total"+f;
//		viewul.append(viewli4);
//		viewul.append(viewli3);		
//		viewli2.append(viewli2_input);
//		viewul.append(viewli2);
//		viewli1_div.append(viewli1_div_span1);
//		viewli1_div.append(viewli1_div_span0);
//		viewli1_div.append(viewli1_div_input);				
//		viewli1.append(viewli1_div);
//		viewul.append(viewli1);
//		viewli0_ol.append(viewli0_li2);
//		viewli0_ol.append(viewli0_li2);
//		viewli0_ol.append(viewli0_li0);
//		viewli0_label.append(viewli0_img);
//		viewli0.append(viewli0_ol);
//		viewli0.append(viewli0_label);
//		viewul.append(viewli0);
//		views.append(viewul);
//		f++;
//		}while(f<choice.length);	
////		sec_span.append(view);
