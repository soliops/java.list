let htmlcode = document.getElementById("view");
let ul, li1, li1_1, li1_2, li1_3,li1_4, li2, span, input, label, img, ol, text1,text2,text3;
let nodata;
const ea = Object.keys(basket_product["flat_product"]).length;

basket_product["flat_product"].forEach(function(data,idx,array){
	var no;
	ul = document.createElement("ul");
	ul.className = "viewul";
	li1 = document.createElement("li");
	li1_1 = document.createElement("li");
	nodata = document.createTextNode("-");
	li1_1.append(nodata);
	li1_2 = document.createElement("li");
	li1_3 = document.createElement("li");
	li1_4 = document.createElement("li");
	input = document.createElement("input");
	input.type="checkbox";
	input.name="p_code";
	span = document.createElement("span");
	label = document.createElement("label");
	ol = document.createElement("ol");
	for(no in basket_product["flat_product"][idx]){
		//console.log(basket_product["flat_product"][idx][no]);
		var code;
		switch(no){
			case "product_nm":
			code = "product_img";
			img = document.createElement("img");
			img.src = basket_product["flat_product"][idx][code];
			input.value = basket_product["flat_product"][idx]["product_no"];
			break;
			
			case "product_img":
			code = "product_nm";
			li2 = document.createElement("li");
			text1 = document.createTextNode(basket_product["flat_product"][idx][code]);
			li2.append(text1);
			ol.append(li2);
			break;
			
			case "product_color":
			code = no;
			li2 = document.createElement("li");
			text1 = document.createTextNode(basket_product["flat_product"][idx][code]);
			li2.append(text1);
			ol.append(li2);
			break;
			
			case "product_size":
			code = no;
			li2 = document.createElement("li");
			text1 = document.createTextNode(basket_product["flat_product"][idx][code]);
			li2.append(text1);
			ol.append(li2);
			break;
			
			case "product_no":
			code = "product_money";
			text2 = document.createTextNode(Number(basket_product["flat_product"][idx][code]).toLocaleString());
			li1_2.append(text2);
			break;
			
			case "product_money":
			code = "product_dc";
			if(basket_product["flat_product"][idx][code]==""){
				text2 = document.createTextNode("-");
			}
			else{
			text2 = document.createTextNode(basket_product["flat_product"][idx][code]);
			}
			li1_3.append(text2);
			break;
			
			case "product_dc":
			code = "product_money";
			text2 = document.createTextNode(Number(basket_product["flat_product"][idx][code]).toLocaleString());
			li1_4.append(text2);
			break;
		}
		
	};
		
		label.append(img);
		span.append(input);	
		li1.append(span);
		li1.append(label);
		li1.append(ol);
		ul.append(li1);
		ul.append(li1_1);
		ul.append(li1_2);
		ul.append(li1_3);
		ul.append(li1_4);
	
	htmlcode.append(ul);
	
});


function go_product(){
	this.select = function(){
		var w=0;
		var ct=0;
		while(w<ea){
			if(f.p_code[w].checked==true){
				ct++;
			}
			w++;
		}
		if(ct==0){
			alert("최소한 한가지 상품은 선택 되어야 합니다.");
		}
		else{
			f.submit();
		}
		
	}
	this.all = function(){
	var w=0;
		while(w<ea){
			f.p_code[w].checked=true;
			w++;
		}
	f.submit();
	}
	this.all_checks = function(){
		var ck;
		if(document.getElementById("allck").checked==true){
			ck = true;
		}
		else{
			ck = false;
		}
		var w=0;
		while(w<ea){
			f.p_code[w].checked=ck;
			w++;
		}
	}
	
}
var btn_product = new go_product();

