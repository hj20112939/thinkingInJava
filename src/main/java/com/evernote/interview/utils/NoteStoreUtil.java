package com.evernote.interview.utils;

import com.evernote.auth.EvernoteAuth;
import com.evernote.auth.EvernoteService;
import com.evernote.clients.ClientFactory;
import com.evernote.clients.NoteStoreClient;
import com.evernote.edam.error.EDAMSystemException;
import com.evernote.edam.error.EDAMUserException;
import com.evernote.thrift.TException;

/**
 * 
 * @author user
 * 链接调用沙箱环境下接口NoteStore的工具类
 */
public class NoteStoreUtil {
	private final static String developerToken = "S=s1:U=9366d:E=161cc8afec3:C=15a74d9cfe0:P=1cd:A=en-devtoken:V=2:H=1d08bfdc337481112a329812f201af29";
	private static NoteStoreUtil noteStoreUtil = new NoteStoreUtil();
	private NoteStoreUtil(){}
  public static NoteStoreUtil getInstance(){
  	return noteStoreUtil;
  }
	public NoteStoreClient getNoteStore() throws EDAMUserException, EDAMSystemException, TException{
		EvernoteAuth evernoteAuth = new EvernoteAuth(EvernoteService.SANDBOX,
				developerToken);
		ClientFactory factory = new ClientFactory(evernoteAuth);
		NoteStoreClient noteStore = factory.createNoteStoreClient();
		return noteStore;
	}
}
