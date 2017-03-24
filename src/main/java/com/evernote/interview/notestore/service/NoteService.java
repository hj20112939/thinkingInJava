package com.evernote.interview.notestore.service;

import java.util.List;
import java.util.Map;

import com.evernote.edam.error.EDAMNotFoundException;
import com.evernote.edam.error.EDAMSystemException;
import com.evernote.edam.error.EDAMUserException;
import com.evernote.interview.notestore.entity.NoteDetail;
import com.evernote.thrift.TException;

public interface NoteService {

	List<Map<String, String>> getAllNote() throws EDAMUserException,
			EDAMSystemException, TException, EDAMNotFoundException;

	List<Map<String, String>> getNoteListByNoteBookId(String guid)
			throws EDAMUserException, EDAMSystemException, TException,
			EDAMNotFoundException;

	List<Map<String, String>> getNoteBooks() throws EDAMUserException,
	EDAMSystemException, TException, EDAMNotFoundException;

	NoteDetail getNoteById(String guid) throws EDAMUserException,
	EDAMSystemException, TException, EDAMNotFoundException;

}
