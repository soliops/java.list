function pageRefresh() {
	var returnurl = $('#cmtreturnurl').val();
	$( document ).ajaxComplete(function() {
		location.href = returnurl;
	});
}

$(document).ready(function() {

	
	var pagingTotalNum = $('#pagingDisplay a').length;
	if ( pagingTotalNum < 2 ) {
		$('#pagingDisplay').hide();
	}

	$('#bbslist .res_table .tbody span.now').closest('.tbody').addClass('now_list');
	$('#bbslist .res_table .tbody span.now').text('�꾩옱湲�');

	
	$('#subAllButton').click(function() {
		if ( $(this).hasClass('active') ) {
			$('#subpageLNB').removeClass('active');
			$(this).removeClass('active');
			hideModal();
		} else {
			$('#subpageLNB').addClass('active');
			$(this).addClass('active');
			showModal( 'gonID' );
		}
	});
	$(document).on('click', '#gonID', function() {
		$('#subpageLNB').removeClass('active');
		$('#subAllButton').removeClass('active');
		hideModal();
	});

	
	//respTable( 'table[data-responsive=yes]', 640 );

	
	$('[name=boad_cmt_delete_btn], [name=board_commentsend_reply], [name=boad_cmt_delete_reply_btn]').on('click', function() {
		pageRefresh()
	});

});