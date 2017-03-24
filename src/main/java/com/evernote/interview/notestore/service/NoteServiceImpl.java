package com.evernote.interview.notestore.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.evernote.clients.NoteStoreClient;
import com.evernote.edam.error.EDAMNotFoundException;
import com.evernote.edam.error.EDAMSystemException;
import com.evernote.edam.error.EDAMUserException;
import com.evernote.edam.notestore.NoteFilter;
import com.evernote.edam.notestore.NoteList;
import com.evernote.edam.type.Note;
import com.evernote.edam.type.Notebook;
import com.evernote.interview.notestore.entity.NoteDetail;
import com.evernote.interview.utils.NoteStoreUtil;
import com.evernote.thrift.TException;

@Service
public class NoteServiceImpl implements NoteService {

	@Override
	public List<Map<String, String>> getAllNote() throws EDAMUserException,
			EDAMSystemException, TException, EDAMNotFoundException {
		NoteStoreClient noteStore = NoteStoreUtil.getInstance().getNoteStore();
		List<Notebook> notebooks = noteStore.listNotebooks();
		List<Map<String, String>> noteList = new ArrayList<Map<String, String>>();
		Map<String, String> noteInfo;
		for (Notebook notebook : notebooks) {
			NoteFilter filter = new NoteFilter();
			filter.setNotebookGuid(notebook.getGuid());
			NoteList notelist = noteStore.findNotes(filter, 0, 100);
			List<Note> notes = notelist.getNotes();
			for (Note note : notes) {
				noteInfo = new HashMap<String, String>();
				noteInfo.put("id", note.getGuid());
				noteInfo.put("name", note.getTitle());
				noteList.add(noteInfo);
			}
		}
		return noteList;
	}

	@Override
	public List<Map<String, String>> getNoteListByNoteBookId(String guid)
			throws EDAMUserException, EDAMSystemException, TException,
			EDAMNotFoundException {
		NoteStoreClient noteStore = NoteStoreUtil.getInstance().getNoteStore();
		List<Map<String, String>> noteList = new ArrayList<Map<String, String>>();
		Map<String, String> noteInfo;
		NoteFilter filter = new NoteFilter();
		filter.setNotebookGuid(guid);
		NoteList notelist = noteStore.findNotes(filter, 0, 100);
		List<Note> notes = notelist.getNotes();
		for (Note note : notes) {
			noteInfo = new HashMap<String, String>();
			noteInfo.put("id", note.getGuid());
			noteInfo.put("name", note.getTitle());
			noteList.add(noteInfo);
		}
		return noteList;
	}

	@Override
	public List<Map<String, String>> getNoteBooks() throws EDAMUserException,
			EDAMSystemException, TException, EDAMNotFoundException {
		NoteStoreClient noteStore = NoteStoreUtil.getInstance().getNoteStore();
		List<Map<String, String>> noteBookList = new ArrayList<Map<String, String>>();
		Map<String, String> noteBook;
		List<Notebook> notebooks = noteStore.listNotebooks();
		for (Notebook notebook : notebooks) {
			noteBook = new HashMap<String, String>();
			noteBook.put("id", notebook.getGuid());
			noteBook.put("name", notebook.getName());
			noteBookList.add(noteBook);
		}
		return noteBookList;
	}

	@Override
	public NoteDetail getNoteById(String guid) throws EDAMUserException,
			EDAMSystemException, TException, EDAMNotFoundException {
		NoteStoreClient noteStore = NoteStoreUtil.getInstance().getNoteStore();
		Note note = noteStore.getNote(guid, true, true, true, true);
		NoteDetail noteDetail = new NoteDetail();
		noteDetail.setTitle(note.getTitle());
		noteDetail.setContent(note.getContent());
		return noteDetail;
	}

}
