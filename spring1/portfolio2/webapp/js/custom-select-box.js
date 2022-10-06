
/**
 * Cumtom Select Box Plugin (jQuery 1.6.2, jQuery UI 1.8.16 湲곕컲)
 * Author : ocw
 * Date : 2012.01.13
**/
$(function() {
	$.widget( "custom.customSelectBox", {
		// default options
		options: {
			multi			: false,
			selectedIndex	: null,
			rows			: null,
			showEffect		: 'slideDown',
			hideEffect		: 'slideUp',
			effectSpeed		: 'fast',
			width			: null
		},

		// the constructor
		_create: function() {
			var that = this;
			
			this.element
				.hide()
				.disableSelection();

			this.list = new Array();

			for(var i=0;i<this.element.children("option").length;i++){
				var optionItem = this.element.children("option").eq(i);
				this.list.push({
					'value' : optionItem.val(),
					'text'	: optionItem.text(),
					'event' : optionItem.attr('event')?optionItem.attr('event'):null,
					'selected' : optionItem.attr('selected')
				});
			}
			
			if(!this.options.width) this.options.width = $(this.element).attr('width')?$(this.element).attr('width'):'120px'; 

			this.dropSelectLayerObj = $('<ul class="custom-select-box-layer"  style="z-index:1001;" ></ul>');
			this.dropSelectLayerObj.css('min-width',this.options.width);			

			// �뺤옣紐⑤뱶�쇰븣
			if(this.options.multi){
				this.dropMultiMainObj = $('<span class="custom-select-box-btn btn drop_multi_main"><a href="javascript:void(0);"></a></span>');
				this.dropMultiMainTextObj = this.dropMultiMainObj.children('a');
				this.dropBtnObj = $('<span class="custom-select-box-btn btn drop_multi_sub"><a href="javascript:void(0);"></a></span>');
				this.dropBtnTextObj = this.dropBtnObj.children('a');

				// 踰꾪듉 肉뚮━湲�
				this.element.before(this.dropMultiMainObj);
				this.element.before(this.dropBtnObj);

				this.dropMultiMainTextObj.click(function(e){
					that.element.change();
				});
			}
			else{
				this.dropBtnObj = $('<span class="custom-select-box-btn btn drop"><a href="javascript:void(0);"></a></span>');
				this.dropBtnTextObj = this.dropBtnObj.children('a');	
				
				// 踰꾪듉 肉뚮━湲�
				this.element.before(this.dropBtnObj);
			}

			// ���됲듃 �덉씠�� 肉뚮━湲�
			this.dropSelectLayerObj.prependTo('body');

			// �듭뀡紐⑸줉 肉뚮━湲�
			for(var i=0;i<this.list.length;i++){
				this.dropSelectLayerObj.append("<li idx='"+i+"'><span>"+this.list[i].text+"</span></li>");
			}

			// select諛뺤뒪濡쒕��� 湲곕낯媛� �ｊ퀬 �대┃�대깽�멸구湲�
			this.dropSelectLayerObj.children("li").each(function(i){
				// select諛뺤뒪�� �좏깮�쒓컪 湲곕낯媛믪쑝濡� �ｊ린
				if(that.list[i].selected){
					that.selectedIndex	= $(this).attr('idx');
					that._select(true);
				}			

				// ��ぉ �대┃�섎㈃ 媛� 諛붽씀湲�
				$(this).bind("click",function(){
					that.selectedIndex	= $(this).attr('idx');
					that._select();
				});
			});

			// select諛뺤뒪�� �좏깮�쒓컪�� �놁쑝硫� 泥ル쾲吏멸컪 �ｊ린
			if(this.selectedIndex == null)	{
				this.selectedIndex = 0;
				that._select(true);
			}

			// �좏깮�덉씠�� �ㅽ겕濡ㅻ컮泥섎━
			if($(this.element).attr('rows')){
				
				this.rows = parseInt($(this.element).attr('rows'));

				if(this.rows < this.list.length){
					var rowHeight = this.dropSelectLayerObj.children('li:eq(0)').height();
					
					this.dropSelectLayerObj.css({
						'overflow-y': 'scroll',
						'height'	: (rowHeight+1) * this.rows + 1
					});
				}
			}

			// �좏깮�덉씠�� �좉�
			this.dropBtnObj.bind('click',function(e){
				e.preventDefault();
				e.stopPropagation();
				if(that.dropSelectLayerObj.is(':hidden')){

					// �뺤옣紐⑤뱶�쇰븣
					if(that.options.multi){
						// �꾩튂 �명똿
						that.dropSelectLayerObj.css({
							top : that.dropMultiMainObj.offset().top + that.dropMultiMainObj.height(),
							left : that.dropMultiMainObj.offset().left
						});
					}
					else
					{
						// �꾩튂 �명똿
						that.dropSelectLayerObj.css({
							top : that.dropBtnObj.offset().top + that.dropBtnObj.height(),
							left : that.dropBtnObj.offset().left
						});
					}

					// �좏깮�� ��ぉ Bold泥섎━
					that.dropSelectLayerObj.children("li").removeClass('selected').eq(that.selectedIndex).addClass('selected');
					

					// �ㅻⅨ �좏깮�덉씠�� 紐⑤몢 �④린湲�
					$(".custom-select-box-layer").hide();

					// 蹂댁씠湲�
					that.dropSelectLayerObj[that.options.showEffect](that.options.effectSpeed);
					
				}
				else{
					// �④린湲�
					that.dropSelectLayerObj[that.options.hideEffect](that.options.effectSpeed);
				}
			});

		},

		// 媛� �좏깮��
		_select: function(defaultFlag) { // defaultFlag�� true�대㈃ 珥덇린 change()瑜� �ㅽ뻾�섏� �딅뒗��.
			var selectedValue	= this.list[this.selectedIndex].value;
			var selectedText	= this.list[this.selectedIndex].text;
			var selectedEvent	= this.list[this.selectedIndex].event;

			// �뺤옣紐⑤뱶�쇰븣
			if(this.options.multi){
				this.dropMultiMainTextObj.text(selectedText);
			}else{
				this.dropBtnTextObj.text(selectedText);
			}

			this.dropSelectLayerObj[this.options.hideEffect](this.options.effectSpeed);

			if(!defaultFlag) this.element.val(selectedValue).change();
		},
		
		selectIndex: function(selectedIndex){
			this.selectedIndex = selectedIndex;
			this.element.selectedIndex = selectedIndex;
			this._select(true);
		},

		destroy: function() {

			this.element.show();
			this.dropBtnObj.remove();
			this.dropBtnTextObj.remove();
			this.dropSelectLayerObj.remove();

			if(this.options.multi){
				this.dropMultiMainObj.remove();
				this.dropMultiMainTextObj.remove();
			}

			$.Widget.prototype.destroy.apply(this,arguments);
		},

		// _setOptions is called with a hash of all options that are changing
		// always refresh when changing options
		_setOptions: function() {
			// in 1.9 would use _superApply
			$.Widget.prototype._setOptions.apply( this, arguments );
		},

		// _setOption is called for each individual option that is changing
		_setOption: function( key, value ) {
			// in 1.9 would use _super
			$.Widget.prototype._setOption.call( this, key, value );
		}
	});

});
