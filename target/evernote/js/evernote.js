var urlPreffix = "/evernote/note/";
$(document).ready(function () {  
	getAllNote();
	$('#bs-example-navbar-collapse-1 li').click(function (e) {
		$('#bs-example-navbar-collapse-1 li').removeClass('active');
		$(this).addClass('active');
		if($('#bs-example-navbar-collapse-1 li')[0].classList[0]){
			$("#type").text("所有笔记");
			getAllNote();  
		}
		else{
			$("#type").text("笔记本");
			getNoteBooks();
		}
	});
});

function getAllNote(){
	var url = urlPreffix + "getAllNote.do";
	var list = '';
	contentControl(0);
	$.get(url,null,function(data) {
		  $.each(data,function(i,value){
			 // list += '<a class="list-group-item" href="#" onclick=getNote("'+ value.id +'")>'+value.name+'</a>';
			 list += '<a class="list-group-item" href="' + urlPreffix + 'getNoteById.do?noteId=' + value.id + '" >'+value.name+'</a>';
		  });
		  $("#NoteOrNotebookList").empty();
		  $("#NoteOrNotebookList").append(list);
	});  
}

function getNoteListByNoteBookId(id){
	var url = urlPreffix + "getNoteListByNoteBookId.do";
	var param = {"noteId":id};
	var list = '';
	contentControl(0);
	$.get(url,param,function(data) {
		  $.each(data,function(i,value){
			 // list += '<a class="list-group-item" href="#" onclick=getNote("'+ value.id +'")>'+value.name+'</a>';
			 list += '<a class="list-group-item" href="' + urlPreffix + 'getNoteById.do?noteId=' + value.id + '" >'+value.name+'</a>';
		  });
		  $("#NoteOrNotebookList").empty();
		  $("#NoteOrNotebookList").append(list);
	});  
}

function getNoteBooks(){
	var url = urlPreffix + "getNoteBooks.do";
	var list = '';
	contentControl(0);
	$.get(url,null,function(data) {
		  $.each(data,function(i,value){
			  list += '<a class="list-group-item" href="#" onclick=getNoteListByNoteBookId("'+ value.id +'")>'+value.name+'</a>';
		  });
		  $("#NoteOrNotebookList").empty();
		  $("#NoteOrNotebookList").append(list);
	});  
}

function getNote(id){
	var url = urlPreffix + "getNoteById.do";
	var param = {"noteId":id};
	contentControl(1);
	$.get(url,param,function(data) {
		$("#noteContent").empty();
		$("#noteContent").append("<h2>" + data.title + "</h2>" + data.content);
	});  
}

function contentControl(type){
	if(type == 0){
		$(".list-group").show();
		//$("#navbar-toggle").show();
		$(".container-fluid").hide();
	}else{
		$(".list-group").hide();
		//$("#navbar-toggle").hide();
		$(".container-fluid").show();
	}
}